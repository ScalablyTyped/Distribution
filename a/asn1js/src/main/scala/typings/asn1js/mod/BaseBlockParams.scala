package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBlockParams extends LocalBaseBlockParams {
  
  var name: js.UndefOr[String] = js.native
  
  var optional: js.UndefOr[scala.Boolean] = js.native
  
  var primitiveSchema: js.UndefOr[js.Object] = js.native
}
object BaseBlockParams {
  
  @scala.inline
  def apply(): BaseBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBlockParams]
  }
  
  @scala.inline
  implicit class BaseBlockParamsOps[Self <: BaseBlockParams] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptional(value: scala.Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setPrimitiveSchema(value: js.Object): Self = this.set("primitiveSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveSchema: Self = this.set("primitiveSchema", js.undefined)
  }
}
