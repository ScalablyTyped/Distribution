package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.BezierCurve.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Polyline")
@js.native
/**
  * 折线
  * @param options 选项
  */
class Polyline[ExtraData] ()
  extends StObject
     with typings.amapJsApi.AMap.Polyline[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  def this(options: typings.amapJsApi.AMap.Polyline.Options[ExtraData]) = this()
}
