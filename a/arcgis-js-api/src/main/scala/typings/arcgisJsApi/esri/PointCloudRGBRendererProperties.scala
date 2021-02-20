package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudRGBRendererProperties extends PointCloudRendererProperties {
  
  /**
    * The name of the field containing RGB values used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
}
object PointCloudRGBRendererProperties {
  
  @scala.inline
  def apply(): PointCloudRGBRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudRGBRendererProperties]
  }
  
  @scala.inline
  implicit class PointCloudRGBRendererPropertiesMutableBuilder[Self <: PointCloudRGBRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
