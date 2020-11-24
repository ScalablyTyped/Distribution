package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPrimitiveOverride extends js.Object {
  
  /**
    * The expression.
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * The primitive name this override applies to.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  /**
    * The property name in the primitive this override applies to.
    */
  var propertyName: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride = js.native
  
  /**
    * ExpressionInfo that contains the Arcade expression that returns value as a number or a string depending on the PropertyName.
    */
  var valueExpressionInfo: js.UndefOr[CIMExpressionInfo] = js.native
}
object CIMPrimitiveOverride {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride): CIMPrimitiveOverride = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPrimitiveOverride]
  }
  
  @scala.inline
  implicit class CIMPrimitiveOverrideOps[Self <: CIMPrimitiveOverride] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = this.set("primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveName: Self = this.set("primitiveName", js.undefined)
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyName: Self = this.set("propertyName", js.undefined)
    
    @scala.inline
    def setValueExpressionInfo(value: CIMExpressionInfo): Self = this.set("valueExpressionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpressionInfo: Self = this.set("valueExpressionInfo", js.undefined)
  }
}
