package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSFeatureType extends StObject {
  
  /**
    * The description of the featureType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var description: String
  
  /**
    * The extent of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var extent: Extent
  
  /**
    * The name of the featureType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var name: String
  
  /**
    * The prefix of the namespace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var namespacePrefix: String
  
  /**
    * The namespaceUri of the featureType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var namespaceUri: String
  
  /**
    * An array of spatialReference wkids that are supported on the featureType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var supportedSpatialReferences: js.Array[Double]
  
  /**
    * The title of the featureType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var title: String
  
  /**
    * The type name of the featureType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSFeatureType)
    */
  var typeName: String
}
object WFSFeatureType {
  
  inline def apply(
    description: String,
    extent: Extent,
    name: String,
    namespacePrefix: String,
    namespaceUri: String,
    supportedSpatialReferences: js.Array[Double],
    title: String,
    typeName: String
  ): WFSFeatureType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespacePrefix = namespacePrefix.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], supportedSpatialReferences = supportedSpatialReferences.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSFeatureType]
  }
  
  extension [Self <: WFSFeatureType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    inline def setSupportedSpatialReferences(value: js.Array[Double]): Self = StObject.set(x, "supportedSpatialReferences", value.asInstanceOf[js.Any])
    
    inline def setSupportedSpatialReferencesVarargs(value: Double*): Self = StObject.set(x, "supportedSpatialReferences", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
