package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkProperties
  extends StObject
     with LoadableProperties {
  
  /**
    * The full network definition, accessible only when the network is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#dataElement)
    */
  var dataElement: js.UndefOr[Any] = js.undefined
  
  /**
    * The full extent of the network, defined from the service territory used to create the network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Random unique id (UUID) to identify a network as defined in the webmap spec.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The full url to the network layer id as defined in the webmap spec.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#layerUrl)
    */
  var layerUrl: js.UndefOr[String] = js.undefined
  
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
    * The spatial reference of the network, defined at the creation of the network, usually from the service territory class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The name of the network as defined in the webmap spec.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}
object NetworkProperties {
  
  inline def apply(): NetworkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkProperties] (val x: Self) extends AnyVal {
    
    inline def setDataElement(value: Any): Self = StObject.set(x, "dataElement", value.asInstanceOf[js.Any])
    
    inline def setDataElementUndefined: Self = StObject.set(x, "dataElement", js.undefined)
    
    inline def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayerUrl(value: String): Self = StObject.set(x, "layerUrl", value.asInstanceOf[js.Any])
    
    inline def setLayerUrlUndefined: Self = StObject.set(x, "layerUrl", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
