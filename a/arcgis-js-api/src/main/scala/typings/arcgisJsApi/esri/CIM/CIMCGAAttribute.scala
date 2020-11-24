package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMCGAAttribute extends js.Object {
  
  /**
    * The CGA attribute type.
    */
  var CGAAttributeType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CGAAttributeType * / any */ String
  ] = js.native
  
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute = js.native
  
  /**
    * The value.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object CIMCGAAttribute {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute): CIMCGAAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMCGAAttribute]
  }
  
  @scala.inline
  implicit class CIMCGAAttributeOps[Self <: CIMCGAAttribute] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCGAAttributeType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CGAAttributeType * / any */ String
    ): Self = this.set("CGAAttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCGAAttributeType: Self = this.set("CGAAttributeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
