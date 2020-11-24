package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanKey extends js.Object {
  
  /**
    * The Id of a usage plan key.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of a usage plan key.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of a usage plan key. Currently, the valid key type is API_KEY.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The value of a usage plan key.
    */
  var value: js.UndefOr[String] = js.native
}
object UsagePlanKey {
  
  @scala.inline
  def apply(): UsagePlanKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKey]
  }
  
  @scala.inline
  implicit class UsagePlanKeyOps[Self <: UsagePlanKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
