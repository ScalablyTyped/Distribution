package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceAdminResponse extends StObject {
  
  /**
    * The name and ARN of the admin for the app instance.
    */
  var AppInstanceAdmin: js.UndefOr[Identity] = js.native
  
  /**
    * The ARN of the of the admin for the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
}
object CreateAppInstanceAdminResponse {
  
  @scala.inline
  def apply(): CreateAppInstanceAdminResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceAdminResponse]
  }
  
  @scala.inline
  implicit class CreateAppInstanceAdminResponseMutableBuilder[Self <: CreateAppInstanceAdminResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceAdmin(value: Identity): Self = StObject.set(x, "AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceAdminUndefined: Self = StObject.set(x, "AppInstanceAdmin", js.undefined)
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
