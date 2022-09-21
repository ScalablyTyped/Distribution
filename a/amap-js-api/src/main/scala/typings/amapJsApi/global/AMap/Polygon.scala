package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.Polygon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Polygon")
@js.native
/**
  * 多边形
  * @param options 选项
  */
open class Polygon[ExtraData] ()
  extends StObject
     with typings.amapJsApi.AMap.Polygon[ExtraData] {
  def this(options: Options[ExtraData]) = this()
}
