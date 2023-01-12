package typings.allKeys

import typings.std.Record
import typings.std.Set
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("all-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ObjectType /* <: Record[String, Any] */](`object`: ObjectType): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]]]
  inline def default[ObjectType /* <: Record[String, Any] */](`object`: ObjectType, options: Options): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]]]
  
  trait Options extends StObject {
    
    /**
    	Include `Object.prototype` properties like `isPrototypeOf`.
    	@default true
    	*/
    val includeObjectPrototype: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Include [`Symbol`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) keys.
    	@default true
    	*/
    val includeSymbols: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIncludeObjectPrototype(value: Boolean): Self = StObject.set(x, "includeObjectPrototype", value.asInstanceOf[js.Any])
      
      inline def setIncludeObjectPrototypeUndefined: Self = StObject.set(x, "includeObjectPrototype", js.undefined)
      
      inline def setIncludeSymbols(value: Boolean): Self = StObject.set(x, "includeSymbols", value.asInstanceOf[js.Any])
      
      inline def setIncludeSymbolsUndefined: Self = StObject.set(x, "includeSymbols", js.undefined)
    }
  }
}
