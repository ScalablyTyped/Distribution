package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.BezierCurve.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.BezierCurve")
@js.native
open class BezierCurve[ExtraData] protected ()
  extends StObject
     with typings.amapJsApi.AMap.BezierCurve[ExtraData] {
  /**
    * 贝瑟尔曲线
    * @param options 覆盖物选项
    */
  def this(options: Options[ExtraData]) = this()
}
