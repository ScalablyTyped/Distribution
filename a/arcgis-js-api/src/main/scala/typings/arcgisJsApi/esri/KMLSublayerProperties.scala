package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.KMLLayerPropertiestypekml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMLSublayerProperties extends StObject {
  
  /**
  		 * Description for the KML sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * The id for the KML sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#id)
  		 */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to which the sublayer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#layer)
  		 */
  var layer: js.UndefOr[KMLLayerProperties] = js.undefined
  
  /**
  		 * Network link info for the current layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#networkLink)
  		 */
  var networkLink: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The parent layer to which the sublayer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#parent)
  		 */
  var parent: js.UndefOr[KMLSublayerProperties | KMLLayerPropertiestypekml] = js.undefined
  
  /**
  		 * The raw KML data for this sublayer, in JSON format, as returned by the [KML utility service](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#kmlServiceUrl).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#sourceJSON)
  		 */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
  		 * A collection of [KMLSublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#sublayers)
  		 */
  var sublayers: js.UndefOr[CollectionProperties[KMLSublayerProperties]] = js.undefined
  
  /**
  		 * The title of the KML sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates if the sublayer is visible in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object KMLSublayerProperties {
  
  inline def apply(): KMLSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLSublayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KMLSublayerProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayer(value: KMLLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setNetworkLink(value: Any): Self = StObject.set(x, "networkLink", value.asInstanceOf[js.Any])
    
    inline def setNetworkLinkUndefined: Self = StObject.set(x, "networkLink", js.undefined)
    
    inline def setParent(value: KMLSublayerProperties | KMLLayerPropertiestypekml): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setSublayers(value: CollectionProperties[KMLSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: KMLSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
