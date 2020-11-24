package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageServiceIdentifyResultProperties extends js.Object {
  
  /**
    * The set of visible areas for the identified catalog items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItemVisibilities)
    */
  var catalogItemVisibilities: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The set of catalog items that overlap the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItems)
    */
  var catalogItems: js.UndefOr[FeatureSetProperties] = js.native
  
  /**
    * The identified location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
  
  /**
    * The identify property name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The identify property id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#objectId)
    */
  var objectId: js.UndefOr[Double] = js.native
  
  /**
    * The attributes of the identified object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#properties)
    */
  var properties: js.UndefOr[js.Any] = js.native
  
  /**
    * The identify image service pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#value)
    */
  var value: js.UndefOr[String] = js.native
}
object ImageServiceIdentifyResultProperties {
  
  @scala.inline
  def apply(): ImageServiceIdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageServiceIdentifyResultProperties]
  }
  
  @scala.inline
  implicit class ImageServiceIdentifyResultPropertiesOps[Self <: ImageServiceIdentifyResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalogItemVisibilitiesVarargs(value: Double*): Self = this.set("catalogItemVisibilities", js.Array(value :_*))
    
    @scala.inline
    def setCatalogItemVisibilities(value: js.Array[Double]): Self = this.set("catalogItemVisibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogItemVisibilities: Self = this.set("catalogItemVisibilities", js.undefined)
    
    @scala.inline
    def setCatalogItems(value: FeatureSetProperties): Self = this.set("catalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogItems: Self = this.set("catalogItems", js.undefined)
    
    @scala.inline
    def setLocation(value: PointProperties): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObjectId(value: Double): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
