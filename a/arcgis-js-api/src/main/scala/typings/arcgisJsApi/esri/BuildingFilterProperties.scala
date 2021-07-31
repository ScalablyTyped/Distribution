package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingFilterProperties extends StObject {
  
  /**
    * Description of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Filter blocks define which features should be visible in the affected [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) and how the filtered features are drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks)
    */
  var filterBlocks: js.UndefOr[CollectionProperties[BuildingFilterBlock]] = js.undefined
  
  /**
    * Name of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
}
object BuildingFilterProperties {
  
  @scala.inline
  def apply(): BuildingFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingFilterProperties]
  }
  
  @scala.inline
  implicit class BuildingFilterPropertiesMutableBuilder[Self <: BuildingFilterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFilterBlocks(value: CollectionProperties[BuildingFilterBlock]): Self = StObject.set(x, "filterBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterBlocksUndefined: Self = StObject.set(x, "filterBlocks", js.undefined)
    
    @scala.inline
    def setFilterBlocksVarargs(value: BuildingFilterBlock*): Self = StObject.set(x, "filterBlocks", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
