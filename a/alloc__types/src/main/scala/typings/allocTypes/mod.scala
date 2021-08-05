package typings.allocTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.allocTypes.allocTypesBooleans.`false`
import typings.allocTypes.allocTypesStrings.prototype
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@alloc/types", "Any")
  @js.native
  class Any () extends StObject
  
  type AnyFn[In /* <: js.Array[js.Any] */, Out] = js.Function1[/* args */ In, Out]
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type Exclusive[T] = Remap[typings.allocTypes.allocTypesStrings.Exclusive & TopLevel[T] & TopLevel[js.Any]]
  
  type Falsy = js.UndefOr[`false` | Null]
  
  /** Convert a union to an intersection */
  type Intersect[U] = js.Any
  
  type Lookup[T] = StringDictionary[T]
  
  type MergeDefaults[T /* <: js.Object */, U /* <: Partial[T] */] = Remap[
    (Omit[T, /* keyof U */ String]) & (Partial[Pick[T, Extract[/* keyof U */ String, /* keyof T */ String]]])
  ]
  
  type MergeUnknown[T, U] = Remap[T & (Omit[U, /* keyof T */ String])]
  
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
  
  type ObjectFromUnion[T /* <: js.Object */] = Remap[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof @alloc/types.@alloc/types.Intersect<T> ]: T extends infer U? P extends keyof any? any[P] : never : never}
    */ typings.allocTypes.allocTypesStrings.ObjectFromUnion & TopLevel[js.Any]
  ]
  
  type ObjectType[T] = js.Object | T
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OneOrMore[T] = T | js.Array[T]
  
  type Overwrite[T, U] = Remap[(Omit[T, /* keyof U */ String]) & U]
  
  type Partial[T] = js.Object & typings.allocTypes.allocTypesStrings.Partial & TopLevel[T]
  
  type Pick[T, K /* <: /* keyof T */ String */] = js.Object & typings.allocTypes.allocTypesStrings.Pick & TopLevel[T]
  
  type Remap[T] = js.Object & typings.allocTypes.allocTypesStrings.Remap & TopLevel[T]
  
  type Solve[T] = T
  
  type StaticProps[T] = Omit[T, (/* keyof T */ String) & prototype]
  
  type UnknownProps = Lookup[js.Any]
}
