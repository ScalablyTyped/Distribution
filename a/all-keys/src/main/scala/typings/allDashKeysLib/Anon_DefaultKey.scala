package typings
package allDashKeysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultKey extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function allKeys<ObjectType extends {[key: string]: unknown}>(
  // 	object: ObjectType,
  // 	options?: allKeys.Options
  // ): Set<LiteralUnion<keyof ObjectType, string | number | symbol>>;
  // export = allKeys;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply[ObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](`object`: ObjectType): stdLib.Set[
    typeDashFestLib.typeDashFestMod.LiteralUnion[java.lang.String, java.lang.String | scala.Double | js.Symbol]
  ] = js.native
  def apply[ObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](`object`: ObjectType, options: allDashKeysLib.allDashKeysMod.allKeysNs.Options): stdLib.Set[
    typeDashFestLib.typeDashFestMod.LiteralUnion[java.lang.String, java.lang.String | scala.Double | js.Symbol]
  ] = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function allKeys<ObjectType extends {[key: string]: unknown}>(
  // 	object: ObjectType,
  // 	options?: allKeys.Options
  // ): Set<LiteralUnion<keyof ObjectType, string | number | symbol>>;
  // export = allKeys;
  def default[ObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](`object`: ObjectType): stdLib.Set[
    typeDashFestLib.typeDashFestMod.LiteralUnion[java.lang.String, java.lang.String | scala.Double | js.Symbol]
  ] = js.native
  def default[ObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](`object`: ObjectType, options: allDashKeysLib.allDashKeysMod.allKeysNs.Options): stdLib.Set[
    typeDashFestLib.typeDashFestMod.LiteralUnion[java.lang.String, java.lang.String | scala.Double | js.Symbol]
  ] = js.native
}

