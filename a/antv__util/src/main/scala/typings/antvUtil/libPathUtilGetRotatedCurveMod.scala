package typings.antvUtil

import typings.antvUtil.libPathTypesMod.CSegment_
import typings.antvUtil.libPathTypesMod.CurveArray
import typings.antvUtil.libPathTypesMod.MSegment_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetRotatedCurveMod {
  
  @JSImport("@antv/util/lib/path/util/get-rotated-curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRotatedCurve(a: CurveArray, b: CurveArray): js.Array[js.Array[String] | MSegment_ | CSegment_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotatedCurve")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String] | MSegment_ | CSegment_]]
}
