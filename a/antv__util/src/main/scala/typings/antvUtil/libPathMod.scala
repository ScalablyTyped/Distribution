package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.antvUtilStrings.off
import typings.antvUtil.libPathTypesMod.AbsoluteArray
import typings.antvUtil.libPathTypesMod.CSegment_
import typings.antvUtil.libPathTypesMod.CurveArray
import typings.antvUtil.libPathTypesMod.MSegment_
import typings.antvUtil.libPathTypesMod.NormalArray
import typings.antvUtil.libPathTypesMod.PathArray
import typings.antvUtil.libPathTypesMod.PathBBox
import typings.antvUtil.libPathTypesMod.PathBBoxTotalLength
import typings.antvUtil.libPathTypesMod.PathSegment
import typings.antvUtil.libPathTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathMod {
  
  @JSImport("@antv/util/lib/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arcToCubic(
    X1: Double,
    Y1: Double,
    RX: Double,
    RY: Double,
    angle: Double,
    LAF: Double,
    SF: Double,
    X2: Double,
    Y2: Double,
    recursive: js.Array[Double]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arcToCubic")(X1.asInstanceOf[js.Any], Y1.asInstanceOf[js.Any], RX.asInstanceOf[js.Any], RY.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], LAF.asInstanceOf[js.Any], SF.asInstanceOf[js.Any], X2.asInstanceOf[js.Any], Y2.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def clonePath(path: PathArray): PathArray = ^.asInstanceOf[js.Dynamic].applyDynamic("clonePath")(path.asInstanceOf[js.Any]).asInstanceOf[PathArray]
  inline def clonePath(path: PathSegment): PathArray = ^.asInstanceOf[js.Dynamic].applyDynamic("clonePath")(path.asInstanceOf[js.Any]).asInstanceOf[PathArray]
  
  inline def distanceSquareRoot(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquareRoot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equalizeSegments(path1: PathArray, path2: PathArray): js.Array[CurveArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeSegments")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[CurveArray]]
  inline def equalizeSegments(path1: PathArray, path2: PathArray, TL: Double): js.Array[CurveArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeSegments")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], TL.asInstanceOf[js.Any])).asInstanceOf[js.Array[CurveArray]]
  
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
  
  inline def getRotatedCurve(a: CurveArray, b: CurveArray): js.Array[js.Array[String] | MSegment_ | CSegment_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotatedCurve")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String] | MSegment_ | CSegment_]]
  
  inline def getTotalLength(pathInput: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTotalLength(pathInput: String, options: PartialPathLengthFactoryO): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTotalLength(pathInput: PathArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTotalLength(pathInput: PathArray, options: PartialPathLengthFactoryO): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isPointInStroke(pathInput: String, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInStroke")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointInStroke(pathInput: PathArray, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInStroke")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizePath(pathInput: String): NormalArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathInput.asInstanceOf[js.Any]).asInstanceOf[NormalArray]
  inline def normalizePath(pathInput: PathArray): NormalArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathInput.asInstanceOf[js.Any]).asInstanceOf[NormalArray]
  
  inline def path2Absolute(pathInput: String): AbsoluteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathInput.asInstanceOf[js.Any]).asInstanceOf[AbsoluteArray]
  inline def path2Absolute(pathInput: PathArray): AbsoluteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathInput.asInstanceOf[js.Any]).asInstanceOf[AbsoluteArray]
  
  inline def path2Curve(pathInput: String): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any]).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: String, needZCommandIndexes: Boolean): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: PathArray): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any]).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: PathArray, needZCommandIndexes: Boolean): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  
  inline def path2String(path: PathArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def path2String(path: PathArray, round: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def path2String_off(path: PathArray, round: off): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def reverseCurve(pathArray: CurveArray): CurveArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCurve")(pathArray.asInstanceOf[js.Any]).asInstanceOf[CurveArray]
}
