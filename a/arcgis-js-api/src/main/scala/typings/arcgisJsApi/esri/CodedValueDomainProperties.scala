package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodedValueDomainProperties extends DomainProperties {
  
  /**
    * An array of the coded values in the domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.UndefOr[js.Array[CodedValueDomainCodedValues]] = js.native
}
object CodedValueDomainProperties {
  
  @scala.inline
  def apply(): CodedValueDomainProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodedValueDomainProperties]
  }
  
  @scala.inline
  implicit class CodedValueDomainPropertiesOps[Self <: CodedValueDomainProperties] (val x: Self) extends AnyVal {
    
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
    def setCodedValuesVarargs(value: CodedValueDomainCodedValues*): Self = this.set("codedValues", js.Array(value :_*))
    
    @scala.inline
    def setCodedValues(value: js.Array[CodedValueDomainCodedValues]): Self = this.set("codedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodedValues: Self = this.set("codedValues", js.undefined)
  }
}
