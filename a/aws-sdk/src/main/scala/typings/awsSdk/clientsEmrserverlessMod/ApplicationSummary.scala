package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The ARN of the application.
    */
  var arn: ApplicationArn
  
  /**
    * The date and time when the application was created.
    */
  var createdAt: js.Date
  
  /**
    * The ID of the application.
    */
  var id: ApplicationId
  
  /**
    * The name of the application.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The EMR release version associated with the application.
    */
  var releaseLabel: ReleaseLabel
  
  /**
    * The state of the application.
    */
  var state: ApplicationState
  
  /**
    * The state details of the application.
    */
  var stateDetails: js.UndefOr[String256] = js.undefined
  
  /**
    * The type of application, such as Spark or Hive.
    */
  var `type`: EngineType
  
  /**
    * The date and time when the application was last updated.
    */
  var updatedAt: js.Date
}
object ApplicationSummary {
  
  inline def apply(
    arn: ApplicationArn,
    createdAt: js.Date,
    id: ApplicationId,
    releaseLabel: ReleaseLabel,
    state: ApplicationState,
    `type`: EngineType,
    updatedAt: js.Date
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ApplicationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: ApplicationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setState(value: ApplicationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetails(value: String256): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    inline def setStateDetailsUndefined: Self = StObject.set(x, "stateDetails", js.undefined)
    
    inline def setType(value: EngineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
