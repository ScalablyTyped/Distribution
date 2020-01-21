package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.AMAP_ANIMATION_NONE
  - typings.amapJsApi.amapJsApiStrings.AMAP_ANIMATION_DROP
  - typings.amapJsApi.amapJsApiStrings.AMAP_ANIMATION_BOUNCE
*/
trait AnimationName extends js.Object

object AnimationName {
  @scala.inline
  def AMAP_ANIMATION_BOUNCE: typings.amapJsApi.amapJsApiStrings.AMAP_ANIMATION_BOUNCE = this.cast("AMAP_ANIMATION_BOUNCE")
  @scala.inline
  def AMAP_ANIMATION_DROP: typings.amapJsApi.amapJsApiStrings.AMAP_ANIMATION_DROP = this.cast("AMAP_ANIMATION_DROP")
  @scala.inline
  def AMAP_ANIMATION_NONE: typings.amapJsApi.amapJsApiStrings.AMAP_ANIMATION_NONE = this.cast("AMAP_ANIMATION_NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

