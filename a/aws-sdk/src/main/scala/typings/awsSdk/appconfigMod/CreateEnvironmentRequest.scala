package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEnvironmentRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.native
  
  /**
    * A name for the environment.
    */
  var Name: typings.awsSdk.appconfigMod.Name = js.native
  
  /**
    * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateEnvironmentRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, Name: Name): CreateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentRequest]
  }
  
  @scala.inline
  implicit class CreateEnvironmentRequestMutableBuilder[Self <: CreateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setMonitors(value: MonitorList): Self = StObject.set(x, "Monitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorsUndefined: Self = StObject.set(x, "Monitors", js.undefined)
    
    @scala.inline
    def setMonitorsVarargs(value: Monitor*): Self = StObject.set(x, "Monitors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
