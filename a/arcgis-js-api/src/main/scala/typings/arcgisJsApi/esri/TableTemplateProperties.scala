package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.FieldColumnTemplateProper
import typings.arcgisJsApi.anon.GroupColumnTemplateProper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableTemplateProperties extends StObject {
  
  /**
    * A collection of [field column templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html) and/or [group column templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html) that represent an ordered list of column templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html#columnTemplates)
    */
  var columnTemplates: js.UndefOr[js.Array[FieldColumnTemplateProper | GroupColumnTemplateProper]] = js.undefined
}
object TableTemplateProperties {
  
  inline def apply(): TableTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableTemplateProperties]
  }
  
  extension [Self <: TableTemplateProperties](x: Self) {
    
    inline def setColumnTemplates(value: js.Array[FieldColumnTemplateProper | GroupColumnTemplateProper]): Self = StObject.set(x, "columnTemplates", value.asInstanceOf[js.Any])
    
    inline def setColumnTemplatesUndefined: Self = StObject.set(x, "columnTemplates", js.undefined)
    
    inline def setColumnTemplatesVarargs(value: (FieldColumnTemplateProper | GroupColumnTemplateProper)*): Self = StObject.set(x, "columnTemplates", js.Array(value*))
  }
}
