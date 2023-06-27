package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait websceneVirtualLighting
  extends StObject
     with Accessor {
  
  /**
  		 * Indicates whether to show shadows cast by the light source.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-VirtualLighting.html#directShadowsEnabled)
  		 */
  var directShadowsEnabled: Boolean = js.native
  
  /**
  		 * Indicates that the light source is virtual light.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-VirtualLighting.html#type)
  		 */
  val `type`: virtual = js.native
}
