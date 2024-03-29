package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import typings.arcgisJsApi.arcgisJsApiStrings.range
import typings.arcgisJsApi.esri.CodedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.CodedValueDomainProperties & {  type :'coded-value'} */
trait CodedValueDomainPropertie extends StObject {
  
  /**
  		 * An array of the coded values in the domain.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
  		 */
  var codedValues: js.UndefOr[js.Array[CodedValue]] = js.undefined
  
  /**
  		 * The domain name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The domain type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
  		 */
  var `type`: js.UndefOr[range | `coded-value` | inherited] = js.undefined
}
object CodedValueDomainPropertie {
  
  inline def apply(): CodedValueDomainPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodedValueDomainPropertie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodedValueDomainPropertie] (val x: Self) extends AnyVal {
    
    inline def setCodedValues(value: js.Array[CodedValue]): Self = StObject.set(x, "codedValues", value.asInstanceOf[js.Any])
    
    inline def setCodedValuesUndefined: Self = StObject.set(x, "codedValues", js.undefined)
    
    inline def setCodedValuesVarargs(value: CodedValue*): Self = StObject.set(x, "codedValues", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: range | `coded-value` | inherited): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
