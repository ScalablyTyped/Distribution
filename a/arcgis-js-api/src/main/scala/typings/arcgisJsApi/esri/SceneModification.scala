package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clip
import typings.arcgisJsApi.arcgisJsApiStrings.mask
import typings.arcgisJsApi.arcgisJsApiStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneModification
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The geometry representing the location of the modification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#geometry)
    */
  var geometry: Polygon = js.native
  
  /**
    * The type of modification to perform.
    *
    * @default clip
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#type)
    */
  var `type`: clip | mask | replace = js.native
}
