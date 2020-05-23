package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.MediaLayer.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.MediaLayer")
@js.native
/**
  * @param options 图层选项
  */
abstract class MediaLayer[E /* <: HTMLElement */] ()
  extends typings.amapJsApi.AMap.MediaLayer[E] {
  def this(options: Options) = this()
}

