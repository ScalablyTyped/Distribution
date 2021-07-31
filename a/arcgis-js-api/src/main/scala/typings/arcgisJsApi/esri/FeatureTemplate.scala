package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`auto-complete-polygon`
import typings.arcgisJsApi.arcgisJsApiStrings.`down-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`up-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.ellipse
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplate
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: String = js.native
  
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow` = js.native
  
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: String = js.native
  
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: FeatureTemplateThumbnail = js.native
}
