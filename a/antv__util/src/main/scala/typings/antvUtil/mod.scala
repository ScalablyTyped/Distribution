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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def assign[Base, A, B, C](dist: Base with A with B with C): Base with A with B with C = js.native
  def assign[Base, A, B, C](dist: Base with A with B with C, src1: A): Base with A with B with C = js.native
  def assign[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B): Base with A with B with C = js.native
  def assign[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B, src3: C): Base with A with B with C = js.native
  def assign[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: js.UndefOr[scala.Nothing], src3: C): Base with A with B with C = js.native
  def assign[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B): Base with A with B with C = js.native
  def assign[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B, src3: C): Base with A with B with C = js.native
  def assign[Base, A, B, C](
    dist: Base with A with B with C,
    src1: js.UndefOr[scala.Nothing],
    src2: js.UndefOr[scala.Nothing],
    src3: C
  ): Base with A with B with C = js.native
  
  def augment(args: js.Any*): Unit = js.native
  
  def clamp(a: Double, min: Double, max: Double): Double = js.native
  
  def clearAnimationFrame(handler: Double): Unit = js.native
  
  def clone(obj: js.Any): js.Any = js.native
  
  def contains(arr: js.Array[_], value: js.Any): Boolean = js.native
  
  def debounce(func: js.Function): js.Function0[Unit] = js.native
  def debounce(func: js.Function, wait: js.UndefOr[scala.Nothing], immediate: Boolean): js.Function0[Unit] = js.native
  def debounce(func: js.Function, wait: Double): js.Function0[Unit] = js.native
  def debounce(func: js.Function, wait: Double, immediate: Boolean): js.Function0[Unit] = js.native
  
  def deepMix(rst: js.Any, args: js.Any*): js.Any = js.native
  
  def difference[T](arr: js.Array[T]): js.Array[T] = js.native
  def difference[T](arr: js.Array[T], values: js.Array[T]): js.Array[T] = js.native
  
  def each(elements: js.Array[_], func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  def each(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  
  def endsWith(arr: String, e: String): Boolean = js.native
  def endsWith[T](arr: js.Array[T], e: T): Boolean = js.native
  
  def every[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], _]): Boolean = js.native
  
  def extend(subclass: js.Any, superclass: js.Any): js.Any = js.native
  def extend(
    subclass: js.Any,
    superclass: js.Any,
    overrides: js.UndefOr[scala.Nothing],
    staticOverrides: js.Any
  ): js.Any = js.native
  def extend(subclass: js.Any, superclass: js.Any, overrides: js.Any): js.Any = js.native
  def extend(subclass: js.Any, superclass: js.Any, overrides: js.Any, staticOverrides: js.Any): js.Any = js.native
  
  def filter[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, Boolean]): js.Array[T] = js.native
  
  def find[T](arr: js.Array[T], predicate: js.Function): T = js.native
  def find[T](arr: js.Array[T], predicate: js.Object): T = js.native
  
  def findIndex[T](arr: js.Array[T], predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean]): Double = js.native
  def findIndex[T](
    arr: js.Array[T],
    predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean],
    fromIndex: Double
  ): Double = js.native
  
  def firstValue(data: js.Array[js.Object], name: String): js.Any = js.native
  
  def fixedBase(v: Double, base: String): Double = js.native
  def fixedBase(v: Double, base: Double): Double = js.native
  
  def flatten[T](arr: js.Array[T]): js.Array[T] = js.native
  
  def flattenDeep(arr: js.Array[_]): js.Array[_] = js.native
  def flattenDeep(arr: js.Array[_], result: js.Array[_]): js.Array[_] = js.native
  
  def forIn(elements: js.Array[_], func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  def forIn(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  
  def get(obj: js.Any, key: String): js.Any = js.native
  def get(obj: js.Any, key: String, defaultValue: js.Any): js.Any = js.native
  def get(obj: js.Any, key: js.Array[_]): js.Any = js.native
  def get(obj: js.Any, key: js.Array[_], defaultValue: js.Any): js.Any = js.native
  
  def getRange(values: js.Array[Double]): RangeType = js.native
  
  def getType(value: js.Any): String = js.native
  
  def getWrapBehavior(obj: js.Object, action: String): js.Function = js.native
  
  def group[T](data: js.Array[T], condition: String): js.Array[js.Array[T]] = js.native
  def group[T](data: js.Array[T], condition: js.Array[String]): js.Array[js.Array[T]] = js.native
  def group[T](data: js.Array[T], condition: js.Function1[/* v */ T, String]): js.Array[js.Array[T]] = js.native
  
  def groupBy[T](data: js.Array[T], condition: String): ObjectType[T] = js.native
  def groupBy[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = js.native
  
  def groupToMap(data: js.Any, condition: js.Any): ObjectType[_] | `0` = js.native
  
  def has(obj: js.Object, key: js.Any): Boolean = js.native
  
  def hasKey(obj: js.Object, key: js.Any): Boolean = js.native
  
  def hasValue(obj: js.Object, value: js.Any): Boolean = js.native
  
  def head(o: js.Any): js.Any = js.native
  
  def identity[T](v: T): T = js.native
  
  def includes(arr: js.Array[_], value: js.Any): Boolean = js.native
  
  def indexOf[T](arr: js.Array[T], obj: T): Double = js.native
  
  def isArguments(value: js.Any): Boolean = js.native
  
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isArrayLike(value: js.Any): Boolean = js.native
  
  def isBoolean(value: js.Any): /* is boolean */ Boolean = js.native
  
  def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
  
  def isDecimal(num: js.Any): Boolean = js.native
  
  def isElement(o: js.Any): Boolean = js.native
  
  def isEmpty(value: js.Any): Boolean = js.native
  
  def isEqual(value: js.Any, other: js.Any): Boolean = js.native
  
  def isEqualWith[T](value: T, other: T, fn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Boolean = js.native
  
  def isError(value: js.Any): /* is std.Error */ Boolean = js.native
  
  def isEven(num: js.Any): Boolean = js.native
  
  def isFinite(value: js.Any): /* is number */ Boolean = js.native
  
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  def isInteger(number: Double): Boolean = js.native
  
  def isMatch(obj: js.Any, attrs: js.Any): Boolean = js.native
  
  def isNegative(num: js.Any): Boolean = js.native
  
  def isNil(value: js.Any): /* is null */ Boolean = js.native
  
  def isNull(value: js.Any): /* is null */ Boolean = js.native
  
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  def isNumberEqual(a: Double, b: Double): Boolean = js.native
  def isNumberEqual(a: Double, b: Double, precision: Double): Boolean = js.native
  
  def isObject[T](value: js.Any): /* is T */ Boolean = js.native
  
  def isObjectLike(value: js.Any): /* is object */ Boolean = js.native
  
  def isOdd(num: js.Any): Boolean = js.native
  
  def isPlainObject(value: js.Any): /* is object */ Boolean = js.native
  
  def isPositive(num: js.Any): Boolean = js.native
  
  def isPrototype(value: js.Any): Boolean = js.native
  
  def isRegExp(str: js.Any): /* is std.RegExp */ Boolean = js.native
  
  def isString(str: js.Any): /* is string */ Boolean = js.native
  
  def isType(value: js.Any, `type`: String): Boolean = js.native
  
  def isUndefined(value: js.Any): /* is undefined */ Boolean = js.native
  
  def keys(obj: js.Any): js.Array[_] = js.native
  
  def last(o: js.Any): js.Any = js.native
  
  def lowerCase(str: String): String = js.native
  
  def lowerFirst(value: String): String = js.native
  
  def map[T, G](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, G]): js.Array[G] = js.native
  
  def mapValues[T](`object`: StringDictionary[T]): StringDictionary[js.Any] = js.native
  def mapValues[T](`object`: StringDictionary[T], func: js.Function2[/* value */ T, /* key */ String, _]): StringDictionary[js.Any] = js.native
  
  def maxBy[T](arr: js.Array[T], fn: String): T = js.native
  def maxBy[T](arr: js.Array[T], fn: js.Function1[/* v */ T, Double]): T = js.native
  
  def memoize(f: js.Function): Call = js.native
  def memoize(f: js.Function, resolver: js.Function1[/* repeated */ js.Any, String]): Call = js.native
  
  def minBy[T](arr: js.Array[T], fn: String): T = js.native
  def minBy[T](arr: js.Array[T], fn: js.Function1[/* v */ T, Double]): T = js.native
  
  def mix[Base, A, B, C](dist: Base with A with B with C): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B, src3: C): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: js.UndefOr[scala.Nothing], src3: C): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B, src3: C): Base with A with B with C = js.native
  def mix[Base, A, B, C](
    dist: Base with A with B with C,
    src1: js.UndefOr[scala.Nothing],
    src2: js.UndefOr[scala.Nothing],
    src3: C
  ): Base with A with B with C = js.native
  
  def mod(n: Double, m: Double): Double = js.native
  
  def noop(): Unit = js.native
  
  def number2color(num: Double): String = js.native
  
  def parseRadius(radius: js.Array[Double]): RadiusType = js.native
  def parseRadius(radius: Double): RadiusType = js.native
  
  def pick[T](`object`: typings.antvUtil.pickMod.ObjectType[T], keys: js.Array[String]): typings.antvUtil.pickMod.ObjectType[T] = js.native
  
  def pull[T](arr: js.Array[T], values: js.Any*): js.Array[T] = js.native
  
  def pullAt[T](arr: js.Array[T], indexes: js.Array[Double]): js.Array[T] = js.native
  
  def reduce[T, G](arr: js.Array[G], fn: js.Function3[/* result */ T, /* data */ G, /* idx */ Double, T], init: T): T = js.native
  
  def remove[T](
    arr: js.Array[T],
    predicate: js.Function3[/* value */ T, /* idx */ Double, /* arr */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = js.native
  
  def requestAnimationFrame(fn: FrameRequestCallback): js.Any = js.native
  
  def set(obj: js.Any, path: String, value: js.Any): js.Any = js.native
  def set(obj: js.Any, path: js.Array[_], value: js.Any): js.Any = js.native
  
  def size(o: js.Any): Double = js.native
  
  def some[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], _]): Boolean = js.native
  
  def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: String): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = js.native
  def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: js.Array[String]): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = js.native
  def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: js.Function): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = js.native
  
  def startsWith(arr: String, e: String): Boolean = js.native
  def startsWith[T](arr: js.Array[T], e: T): Boolean = js.native
  
  def substitute[T](str: String, o: typings.antvUtil.substituteMod.ObjectType[T]): String = js.native
  
  def throttle(func: js.Function, wait: Double, options: OptionsType): js.Function = js.native
  
  def toArray(value: js.Any): js.Array[_] = js.native
  
  def toDegree(radian: Double): Double = js.native
  
  def toRadian(degree: Double): Double = js.native
  
  def toString(value: js.Any): String = js.native
  
  def union(sources: js.Any*): js.Array[_] = js.native
  
  def uniq(arr: js.Any): js.Array[_] = js.native
  
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
  
  def upperCase(str: String): String = js.native
  
  def upperFirst(value: String): String = js.native
  
  def values(obj: js.Any): js.Any = js.native
  
  def valuesOfKey(data: js.Array[_], name: String): js.Array[_] = js.native
  
  def wrapBehavior(obj: js.Object, action: String): js.Function = js.native
  
  @js.native
  class Cache[T] () extends default[T]
}
