package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseDynamicLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties

object BaseDynamicLayerProperties {
  @scala.inline
  def apply(): BaseDynamicLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseDynamicLayerProperties]
  }
}

