package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodedValueDomainProperties
  extends StObject
     with DomainProperties {
  
  /**
    * An array of the coded values in the domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.UndefOr[js.Array[CodedValueDomainCodedValues]] = js.undefined
}
object CodedValueDomainProperties {
  
  @scala.inline
  def apply(): CodedValueDomainProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodedValueDomainProperties]
  }
  
  @scala.inline
  implicit class CodedValueDomainPropertiesMutableBuilder[Self <: CodedValueDomainProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodedValues(value: js.Array[CodedValueDomainCodedValues]): Self = StObject.set(x, "codedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodedValuesUndefined: Self = StObject.set(x, "codedValues", js.undefined)
    
    @scala.inline
    def setCodedValuesVarargs(value: CodedValueDomainCodedValues*): Self = StObject.set(x, "codedValues", js.Array(value :_*))
  }
}
