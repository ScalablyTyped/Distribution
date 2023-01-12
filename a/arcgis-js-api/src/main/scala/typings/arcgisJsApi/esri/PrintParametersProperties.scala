package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintParametersProperties extends StObject {
  
  /**
    * Additional parameters for the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#extraParameters)
    */
  var extraParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * Specify the output spatial reference for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Defines the layout template used for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#template)
    */
  var template: js.UndefOr[PrintTemplateProperties] = js.undefined
  
  /**
    * The view to print.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object PrintParametersProperties {
  
  inline def apply(): PrintParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setExtraParameters(value: Any): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
    
    inline def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setTemplate(value: PrintTemplateProperties): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
