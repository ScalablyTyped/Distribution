package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import typings.antvUtil.anon.Call
import typings.antvUtil.anon.`0`
import typings.antvUtil.cacheMod.default
import typings.antvUtil.getRangeMod.RangeType
import typings.antvUtil.groupByMod.ObjectType
import typings.antvUtil.parseRadiusMod.RadiusType
import typings.antvUtil.throttleMod.OptionsType
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/util", "Cache")
  @js.native
  class Cache[T] () extends default[T]
  
  inline def assign[Base, A, B, C](dist: Base & A & B & C): Base & A & B & C = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any]).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  
  inline def augment(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("augment")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clamp(a: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clearAnimationFrame(handler: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAnimationFrame")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clone_(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def contains(arr: js.Array[js.Any], value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def debounce(func: js.Function): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function, wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function, wait: Double, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function, wait: Unit, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def deepMix(rst: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMix")(rst.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def difference[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def difference[T](arr: js.Array[T], values: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arr.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def each(elements: js.Array[js.Any], func: js.Function2[/* v */ js.Any, /* k */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def endsWith(arr: String, e: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsWith[T](arr: js.Array[T], e: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extend(subclass: js.Any, superclass: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def extend(subclass: js.Any, superclass: js.Any, overrides: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def extend(subclass: js.Any, superclass: js.Any, overrides: js.Any, staticOverrides: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def extend(subclass: js.Any, superclass: js.Any, overrides: Unit, staticOverrides: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def filter[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def find[T](arr: js.Array[T], predicate: js.Function): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](arr: js.Array[T], predicate: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findIndex[T](arr: js.Array[T], predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndex[T](
    arr: js.Array[T],
    predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean],
    fromIndex: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def firstValue(data: js.Array[js.Object], name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("firstValue")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def fixedBase(v: Double, base: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedBase")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def fixedBase(v: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedBase")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def flatten[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def flattenDeep(arr: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def flattenDeep(arr: js.Array[js.Any], result: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def forIn(elements: js.Array[js.Any], func: js.Function2[/* v */ js.Any, /* k */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forIn")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forIn(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forIn")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(obj: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Any, key: String, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Any, key: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(obj: js.Any, key: js.Array[js.Any], defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getRange(values: js.Array[Double]): RangeType = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(values.asInstanceOf[js.Any]).asInstanceOf[RangeType]
  
  inline def getType(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getWrapBehavior(obj: js.Object, action: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapBehavior")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def group[T](data: js.Array[T], condition: String): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def group[T](data: js.Array[T], condition: js.Array[String]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def group[T](data: js.Array[T], condition: js.Function1[/* v */ T, String]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def groupBy[T](data: js.Array[T], condition: String): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  inline def groupBy[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  inline def groupToMap(data: js.Any, condition: js.Any): ObjectType[js.Any] | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("groupToMap")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[js.Any] | `0`]
  
  inline def has(obj: js.Object, key: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasKey(obj: js.Object, key: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasValue(obj: js.Object, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def head(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def identity[T](v: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def includes(arr: js.Array[js.Any], value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf[T](arr: js.Array[T], obj: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArguments(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArguments")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArray(value: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isArrayLike(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(value: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDecimal(num: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual(value: js.Any, other: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEqualWith[T](value: T, other: T, fn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualWith")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isError(value: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isEven(num: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEven")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFinite(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMatch(obj: js.Any, attrs: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(obj.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNegative(num: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(value: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNull(value: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isNumberEqual(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isNumberEqual(a: Double, b: Double, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObject[T](value: js.Any): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isObjectLike(value: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isOdd(num: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOdd")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(value: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPositive(num: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrototype(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrototype")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(str: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(str.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(str: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isType(value: js.Any, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUndefined(value: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def keys(obj: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def last(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def lowerCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lowerFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def map[T, G](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, G]): js.Array[G] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[G]]
  
  inline def mapValues[T](`object`: StringDictionary[T]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def mapValues[T](`object`: StringDictionary[T], func: js.Function2[/* value */ T, /* key */ String, js.Any]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  inline def maxBy[T](arr: js.Array[T], fn: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxBy[T](arr: js.Array[T], fn: js.Function1[/* v */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def memoize(f: js.Function): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def memoize(f: js.Function, resolver: js.Function1[/* repeated */ js.Any, String]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  inline def minBy[T](arr: js.Array[T], fn: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def minBy[T](arr: js.Array[T], fn: js.Function1[/* v */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mix[Base, A, B, C](dist: Base & A & B & C): Base & A & B & C = ^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any]).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  
  inline def mod(n: Double, m: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def number2color(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("number2color")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseRadius(radius: js.Array[Double]): RadiusType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRadius")(radius.asInstanceOf[js.Any]).asInstanceOf[RadiusType]
  inline def parseRadius(radius: Double): RadiusType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRadius")(radius.asInstanceOf[js.Any]).asInstanceOf[RadiusType]
  
  inline def pick[T](`object`: typings.antvUtil.pickMod.ObjectType[T], keys: js.Array[String]): typings.antvUtil.pickMod.ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.antvUtil.pickMod.ObjectType[T]]
  
  inline def pull[T](arr: js.Array[T], values: js.Any*): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pull")(arr.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def pullAt[T](arr: js.Array[T], indexes: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullAt")(arr.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def reduce[T, G](arr: js.Array[G], fn: js.Function3[/* result */ T, /* data */ G, /* idx */ Double, T], init: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def remove[T](
    arr: js.Array[T],
    predicate: js.Function3[/* value */ T, /* idx */ Double, /* arr */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def requestAnimationFrame(fn: FrameRequestCallback): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def set(obj: js.Any, path: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def set(obj: js.Any, path: js.Array[js.Any], value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def size(o: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(o.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def some[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: String): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antvUtil.sortByMod.ObjectType[T]]]
  inline def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: js.Array[String]): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antvUtil.sortByMod.ObjectType[T]]]
  inline def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: js.Function): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antvUtil.sortByMod.ObjectType[T]]]
  
  inline def startsWith(arr: String, e: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startsWith[T](arr: js.Array[T], e: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def substitute[T](str: String, o: typings.antvUtil.substituteMod.ObjectType[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(str.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def throttle(func: js.Function, wait: Double, options: OptionsType): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def toArray(value: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def toDegree(radian: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegree")(radian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toRadian(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadian")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toString_(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def union(sources: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(sources.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def uniq(arr: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  inline def uniqueId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def values(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def valuesOfKey(data: js.Array[js.Any], name: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("valuesOfKey")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def wrapBehavior(obj: js.Object, action: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapBehavior")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
