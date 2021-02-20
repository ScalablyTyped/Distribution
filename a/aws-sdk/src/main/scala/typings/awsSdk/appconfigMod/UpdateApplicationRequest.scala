package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  
  /**
    * A description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
}
object UpdateApplicationRequest {
  
  @scala.inline
  def apply(ApplicationId: Id): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateApplicationRequestMutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
