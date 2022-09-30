package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import typings.antvUtil.anon.Call
import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.anon.`0`
import typings.antvUtil.antvUtilStrings.off
import typings.antvUtil.getRangeMod.RangeType
import typings.antvUtil.groupByMod.ObjectType
import typings.antvUtil.parseRadiusMod.RadiusType
import typings.antvUtil.pathTypesMod.AbsoluteArray
import typings.antvUtil.pathTypesMod.CSegment_
import typings.antvUtil.pathTypesMod.CurveArray
import typings.antvUtil.pathTypesMod.MSegment_
import typings.antvUtil.pathTypesMod.NormalArray
import typings.antvUtil.pathTypesMod.PathArray
import typings.antvUtil.pathTypesMod.PathBBox
import typings.antvUtil.pathTypesMod.PathBBoxTotalLength
import typings.antvUtil.pathTypesMod.PathSegment
import typings.antvUtil.pathTypesMod.Point
import typings.antvUtil.throttleMod.OptionsType
import typings.std.FrameRequestCallback
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/util", "Cache")
  @js.native
  open class Cache[T] ()
    extends typings.antvUtil.lodashMod.Cache[T]
  
  inline def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def assign[Base, A, B, C](dist: Base & A & B & C): Base & A & B & C = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any]).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def assign[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  
  inline def augment(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("augment")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def clamp(a: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clearAnimationFrame(handler: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAnimationFrame")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clonePath(path: PathArray): PathArray = ^.asInstanceOf[js.Dynamic].applyDynamic("clonePath")(path.asInstanceOf[js.Any]).asInstanceOf[PathArray]
  inline def clonePath(path: PathSegment): PathArray = ^.asInstanceOf[js.Dynamic].applyDynamic("clonePath")(path.asInstanceOf[js.Any]).asInstanceOf[PathArray]
  
  inline def clone_(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def contains(arr: js.Array[Any], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def debounce(func: js.Function): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function, wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function, wait: Double, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function, wait: Unit, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def deepMix(rst: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepMix")(scala.List(rst.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def difference[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def difference[T](arr: js.Array[T], values: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arr.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("direction")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distanceSquareRoot(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquareRoot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def each(elements: js.Array[Any], func: js.Function2[/* v */ Any, /* k */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(elements: js.Object, func: js.Function2[/* v */ Any, /* k */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def endsWith(arr: String, e: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsWith[T](arr: js.Array[T], e: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equalizeSegments(path1: PathArray, path2: PathArray): js.Array[CurveArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeSegments")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[CurveArray]]
  inline def equalizeSegments(path1: PathArray, path2: PathArray, TL: Double): js.Array[CurveArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeSegments")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], TL.asInstanceOf[js.Any])).asInstanceOf[js.Array[CurveArray]]
  
  inline def every[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extend(subclass: Any, superclass: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def extend(subclass: Any, superclass: Any, overrides: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def extend(subclass: Any, superclass: Any, overrides: Any, staticOverrides: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticOverrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def extend(subclass: Any, superclass: Any, overrides: Unit, staticOverrides: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticOverrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def filter[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def find[T](arr: js.Array[T], predicate: js.Function): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](arr: js.Array[T], predicate: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findIndex[T](arr: js.Array[T], predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndex[T](
    arr: js.Array[T],
    predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean],
    fromIndex: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def firstValue(data: js.Array[js.Object], name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("firstValue")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fixedBase(v: Double, base: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedBase")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def fixedBase(v: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedBase")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def flatten[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def flattenDeep(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def flattenDeep(arr: js.Array[Any], result: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def forIn(elements: js.Array[Any], func: js.Function2[/* v */ Any, /* k */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forIn")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forIn(elements: js.Object, func: js.Function2[/* v */ Any, /* k */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forIn")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(obj: Any, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(obj: Any, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(obj: Any, key: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(obj: Any, key: js.Array[Any], defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDrawDirection(pathArray: PathArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDrawDirection")(pathArray.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getPathArea(path: PathArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getPathBBox(path: String): PathBBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBox]
  inline def getPathBBox(path: String, options: PartialPathLengthFactoryO): PathBBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBox]
  inline def getPathBBox(path: PathArray): PathBBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBox]
  inline def getPathBBox(path: PathArray, options: PartialPathLengthFactoryO): PathBBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBox]
  
  inline def getPathBBoxTotalLength(path: PathArray): PathBBoxTotalLength = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBoxTotalLength")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBoxTotalLength]
  inline def getPathBBoxTotalLength(path: PathArray, options: PartialPathLengthFactoryO): PathBBoxTotalLength = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBoxTotalLength")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBoxTotalLength]
  
  inline def getPointAtLength(pathInput: String, distance: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPointAtLength(pathInput: String, distance: Double, options: PartialPathLengthFactoryO): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPointAtLength(pathInput: PathArray, distance: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPointAtLength(pathInput: PathArray, distance: Double, options: PartialPathLengthFactoryO): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getRange(values: js.Array[Double]): RangeType = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(values.asInstanceOf[js.Any]).asInstanceOf[RangeType]
  
  inline def getRotatedCurve(a: CurveArray, b: CurveArray): js.Array[js.Array[String] | MSegment_ | CSegment_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotatedCurve")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String] | MSegment_ | CSegment_]]
  
  inline def getTotalLength(pathInput: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTotalLength(pathInput: String, options: PartialPathLengthFactoryO): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTotalLength(pathInput: PathArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTotalLength(pathInput: PathArray, options: PartialPathLengthFactoryO): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getType(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getWrapBehavior(obj: js.Object, action: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapBehavior")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def gradient(colors: String): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
  inline def gradient(colors: js.Array[String]): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
  
  inline def group[T](data: js.Array[T], condition: String): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def group[T](data: js.Array[T], condition: js.Array[String]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def group[T](data: js.Array[T], condition: js.Function1[/* v */ T, String]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def groupBy[T](data: js.Array[T], condition: String): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  inline def groupBy[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  inline def groupToMap(data: Any, condition: String): ObjectType[Any] | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("groupToMap")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[Any] | `0`]
  inline def groupToMap(data: Any, condition: js.Array[String]): ObjectType[Any] | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("groupToMap")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[Any] | `0`]
  inline def groupToMap(data: Any, condition: js.Function1[/* row */ Any, String]): ObjectType[Any] | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("groupToMap")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[Any] | `0`]
  
  inline def has(obj: js.Object, key: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasKey(obj: js.Object, key: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasValue(obj: js.Object, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def head(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def identity[T](v: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def includes(arr: js.Array[Any], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf[T](arr: js.Array[T], obj: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArguments(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArguments")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArray(value: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isArrayLike(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(value: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDecimal(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual(value: Any, other: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEqualWith[T](value: T, other: T, fn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualWith")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isError(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isEven(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEven")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFinite(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInteger(number: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMatch(obj: Any, attrs: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(obj.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNegative(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNull(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isNumberEqual(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isNumberEqual(a: Double, b: Double, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObject[T](value: Any): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isObjectLike(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isOdd(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOdd")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPointInPolygon(points: js.Array[js.Array[Double]], x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPolygon")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPointInStroke(pathInput: String, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInStroke")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointInStroke(pathInput: PathArray, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInStroke")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPolygonsIntersect(points1: js.Array[js.Array[Double]], points2: js.Array[js.Array[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPolygonsIntersect")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPositive(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrototype(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrototype")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(str: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(str.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isType(value: Any, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def keys(obj: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def last(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def lowerCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lowerFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def map[T, G](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, G]): js.Array[G] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[G]]
  
  inline def mapValues[T](`object`: StringDictionary[T]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def mapValues[T](`object`: StringDictionary[T], func: js.Function2[/* value */ T, /* key */ String, Any]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def max(arr: js.Array[Double]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(arr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def maxBy[T](arr: js.Array[T], fn: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxBy[T](arr: js.Array[T], fn: js.Function1[/* v */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def memoize(f: js.Function): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def memoize(f: js.Function, resolver: js.Function1[/* repeated */ Any, String]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  inline def min(arr: js.Array[Double]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(arr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
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
  
  inline def normalizePath(pathInput: String): NormalArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathInput.asInstanceOf[js.Any]).asInstanceOf[NormalArray]
  inline def normalizePath(pathInput: PathArray): NormalArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathInput.asInstanceOf[js.Any]).asInstanceOf[NormalArray]
  
  inline def number2color(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("number2color")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def omit[T](obj: typings.antvUtil.typesMod.ObjectType[T], keys: js.Array[String]): typings.antvUtil.typesMod.ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.antvUtil.typesMod.ObjectType[T]]
  
  inline def parseRadius(radius: js.Array[Double]): RadiusType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRadius")(radius.asInstanceOf[js.Any]).asInstanceOf[RadiusType]
  inline def parseRadius(radius: Double): RadiusType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRadius")(radius.asInstanceOf[js.Any]).asInstanceOf[RadiusType]
  
  inline def path2Absolute(pathInput: String): AbsoluteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathInput.asInstanceOf[js.Any]).asInstanceOf[AbsoluteArray]
  inline def path2Absolute(pathInput: PathArray): AbsoluteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathInput.asInstanceOf[js.Any]).asInstanceOf[AbsoluteArray]
  
  inline def path2Curve(pathInput: String): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any]).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: String, needZCommandIndexes: Boolean): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: PathArray): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any]).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: PathArray, needZCommandIndexes: Boolean): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  
  inline def path2String(path: PathArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def path2String(path: PathArray, round: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def path2String_off(path: PathArray, round: off): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pick[T](`object`: typings.antvUtil.pickMod.ObjectType[T], keys: js.Array[String]): typings.antvUtil.pickMod.ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.antvUtil.pickMod.ObjectType[T]]
  
  inline def pull[T](arr: js.Array[T], values: Any*): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pull")(scala.List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[T]]
  
  inline def pullAt[T](arr: js.Array[T], indexes: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullAt")(arr.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def reduce[T, G](
    arr: js.Array[G],
    fn: js.Function3[/* result */ T, /* data */ G, /* idx */ String | Double, T],
    init: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduce[T, G](
    arr: typings.antvUtil.typesMod.ObjectType[T],
    fn: js.Function3[/* result */ T, /* data */ G, /* idx */ String | Double, T],
    init: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def remove[T](
    arr: js.Array[T],
    predicate: js.Function3[/* value */ T, /* idx */ Double, /* arr */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def requestAnimationFrame(fn: FrameRequestCallback): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def reverseCurve(pathArray: CurveArray): CurveArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCurve")(pathArray.asInstanceOf[js.Any]).asInstanceOf[CurveArray]
  
  inline def rgb2arr(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2arr")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def set(obj: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set(obj: Any, path: js.Array[Any], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def size(o: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(o.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def some[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: String): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antvUtil.sortByMod.ObjectType[T]]]
  inline def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: js.Array[String]): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antvUtil.sortByMod.ObjectType[T]]]
  inline def sortBy[T](arr: js.Array[typings.antvUtil.sortByMod.ObjectType[T]], key: js.Function): js.Array[typings.antvUtil.sortByMod.ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antvUtil.sortByMod.ObjectType[T]]]
  
  inline def startsWith(arr: String, e: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startsWith[T](arr: js.Array[T], e: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def substitute[T](str: String, o: typings.antvUtil.substituteMod.ObjectType[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(str.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def throttle(func: js.Function, wait: Double, options: OptionsType): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def toArray(value: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def toCSSGradient(gradientColor: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCSSGradient")(gradientColor.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toDegree(radian: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegree")(radian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toRGB(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGB")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toRadian(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadian")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toString_(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def union(sources: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def uniq(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def uniq(arr: js.Array[Any], cache: Map[Any, Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  inline def uniqueId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def values(obj: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def valuesOfKey(data: js.Array[Any], name: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("valuesOfKey")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("vertical")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def wrapBehavior(obj: js.Object, action: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapBehavior")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
