package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CodedValueDomainPropertie
import typings.arcgisJsApi.anon.RangeDomainPropertiestype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldColumnTemplateProperties
  extends StObject
     with ColumnTemplateBaseProperties {
  
  /**
  		 * The [coded value domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or a [range domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) of the associated field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html#domain)
  		 */
  var domain: js.UndefOr[CodedValueDomainPropertie | RangeDomainPropertiestype] = js.undefined
  
  /**
  		 * Indicates whether the field is editable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html#editable)
  		 */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The field name as defined by the feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html#fieldName)
  		 */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether a field requires a value.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html#required)
  		 */
  var required: js.UndefOr[Boolean] = js.undefined
}
object FieldColumnTemplateProperties {
  
  inline def apply(): FieldColumnTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldColumnTemplateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldColumnTemplateProperties] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: CodedValueDomainPropertie | RangeDomainPropertiestype): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
