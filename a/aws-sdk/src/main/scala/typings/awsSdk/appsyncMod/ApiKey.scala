package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKey extends js.Object {
  
  /**
    * The time after which the API key is deleted. The date is represented as seconds since the epoch, rounded down to the nearest hour.
    */
  var deletes: js.UndefOr[Long] = js.native
  
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour.
    */
  var expires: js.UndefOr[Long] = js.native
  
  /**
    * The API key ID.
    */
  var id: js.UndefOr[String] = js.native
}
object ApiKey {
  
  @scala.inline
  def apply(): ApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKey]
  }
  
  @scala.inline
  implicit class ApiKeyOps[Self <: ApiKey] (val x: Self) extends AnyVal {
    
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
    def setDeletes(value: Long): Self = this.set("deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletes: Self = this.set("deletes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpires(value: Long): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
