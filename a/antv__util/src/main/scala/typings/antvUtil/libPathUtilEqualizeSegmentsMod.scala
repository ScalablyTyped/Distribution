package typings.antvUtil

import typings.antvUtil.libPathTypesMod.CurveArray
import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilEqualizeSegmentsMod {
  
  @JSImport("@antv/util/lib/path/util/equalize-segments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equalizeSegments(path1: PathArray, path2: PathArray): js.Array[CurveArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeSegments")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[CurveArray]]
  inline def equalizeSegments(path1: PathArray, path2: PathArray, TL: Double): js.Array[CurveArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeSegments")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], TL.asInstanceOf[js.Any])).asInstanceOf[js.Array[CurveArray]]
}
