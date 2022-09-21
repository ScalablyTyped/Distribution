package typings.arrayFlatten

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten[T /* <: ArrayLike[Any] */](array: T): FlatArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[FlatArray[T]]
  
  type FlatArray[T /* <: ArrayLike[Any] */] = js.Array[
    PickValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]
  
  type PickValue[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in std.Extract<keyof T, number> ]: array-flatten.array-flatten.PickValue<T[K]>}[number] */ js.Any)
}
