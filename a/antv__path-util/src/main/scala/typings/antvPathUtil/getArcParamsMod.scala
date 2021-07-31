package typings.antvPathUtil

import typings.antvPathUtil.anon.ArcFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getArcParamsMod {
  
  @JSImport("@antv/path-util/lib/get-arc-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(startPoint: js.Any, params: js.Any): ArcFlag = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(startPoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[ArcFlag]
  
  @scala.inline
  def isSamePoint(point1: js.Any, point2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSamePoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
