package typings.allKeys

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get all property keys of an object including non-enumerable and inherited ones. Like [Reflect.ownKeys()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Reflect/ownKeys) but traverses up the prototype-chain.
  	@returns All property names from `object`.
  	@example
  	```
  	import allKeys = require('all-keys');
  	Object.getOwnPropertyNames(Symbol.prototype);
  	/ *
  	[
  		'constructor',
  		'toString',
  		'valueOf'
  	]
  	*\/
  	allKeys(Symbol.prototype);
  	/ *
  	Set {
  		'constructor',
  		'toString',
  		'valueOf',
  		'toLocaleString',
  		'hasOwnProperty',
  		'isPrototypeOf',
  		'propertyIsEnumerable',
  		'__defineGetter__',
  		'__lookupGetter__',
  		'__defineSetter__',
  		'__lookupSetter__',
  		'__proto__'
  	}
  	*\/
  	```
  	*/
  inline def apply[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]]]
  inline def apply[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType, options: Options): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]]]
  
  @JSImport("all-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function allKeys<ObjectType extends {[key: string]: any}>(
  // 	object: ObjectType,
  // 	options?: allKeys.Options
  // ): Set<LiteralUnion<keyof ObjectType, string | number | symbol>>;
  // export = allKeys;
  @JSImport("all-keys", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allKeys */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allKeys */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
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
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeObjectPrototype(value: Boolean): Self = StObject.set(x, "includeObjectPrototype", value.asInstanceOf[js.Any])
      
      inline def setIncludeObjectPrototypeUndefined: Self = StObject.set(x, "includeObjectPrototype", js.undefined)
      
      inline def setIncludeSymbols(value: Boolean): Self = StObject.set(x, "includeSymbols", value.asInstanceOf[js.Any])
      
      inline def setIncludeSymbolsUndefined: Self = StObject.set(x, "includeSymbols", js.undefined)
    }
  }
}
