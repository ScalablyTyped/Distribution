package typings.amapJsApi.AMap

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoLayer extends MediaLayer[HTMLVideoElement] {
  
  /**
    * 返回Video的Url
    */
  def getVideoUrl(): js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * 修改Video的Url
    * @param source url
    */
  def setVideoUrl(source: String): Unit = js.native
  def setVideoUrl(source: js.Array[String]): Unit = js.native
}
