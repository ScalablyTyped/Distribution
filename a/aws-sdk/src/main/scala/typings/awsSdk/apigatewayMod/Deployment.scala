package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends StObject {
  
  /**
    * A summary of the RestApi at the date and time that the deployment resource was created.
    */
  var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.native
  
  /**
    * The date and time that the deployment resource was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description for the deployment resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the deployment resource.
    */
  var id: js.UndefOr[String] = js.native
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSummary(value: PathToMapOfMethodSnapshot): Self = StObject.set(x, "apiSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSummaryUndefined: Self = StObject.set(x, "apiSummary", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
