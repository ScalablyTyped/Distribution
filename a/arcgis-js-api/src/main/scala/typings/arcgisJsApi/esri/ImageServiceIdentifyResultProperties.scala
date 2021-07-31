package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageServiceIdentifyResultProperties extends StObject {
  
  /**
    * The set of visible areas for the identified catalog items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItemVisibilities)
    */
  var catalogItemVisibilities: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The set of catalog items that overlap the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItems)
    */
  var catalogItems: js.UndefOr[FeatureSetProperties] = js.undefined
  
  /**
    * The identified location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The identify property name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The identify property id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#objectId)
    */
  var objectId: js.UndefOr[Double] = js.undefined
  
  /**
    * The attributes of the identified object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#properties)
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The identify image service pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#value)
    */
  var value: js.UndefOr[String] = js.undefined
}
object ImageServiceIdentifyResultProperties {
  
  @scala.inline
  def apply(): ImageServiceIdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageServiceIdentifyResultProperties]
  }
  
  @scala.inline
  implicit class ImageServiceIdentifyResultPropertiesMutableBuilder[Self <: ImageServiceIdentifyResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogItemVisibilities(value: js.Array[Double]): Self = StObject.set(x, "catalogItemVisibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogItemVisibilitiesUndefined: Self = StObject.set(x, "catalogItemVisibilities", js.undefined)
    
    @scala.inline
    def setCatalogItemVisibilitiesVarargs(value: Double*): Self = StObject.set(x, "catalogItemVisibilities", js.Array(value :_*))
    
    @scala.inline
    def setCatalogItems(value: FeatureSetProperties): Self = StObject.set(x, "catalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogItemsUndefined: Self = StObject.set(x, "catalogItems", js.undefined)
    
    @scala.inline
    def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
