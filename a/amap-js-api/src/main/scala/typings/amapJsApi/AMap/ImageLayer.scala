package typings.amapJsApi.AMap

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 图片图层
  */
@js.native
trait ImageLayer
  extends StObject
     with MediaLayer[HTMLImageElement] {
  
  /**
    * 返回Image的Url
    */
  def getImageUrl(): js.UndefOr[String] = js.native
  
  /**
    * 修改Image的Url
    * @param url url
    */
  def setImageUrl(url: String): Unit = js.native
}
