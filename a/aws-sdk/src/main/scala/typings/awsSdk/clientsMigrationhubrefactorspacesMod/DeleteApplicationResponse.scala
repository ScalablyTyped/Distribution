package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationResponse extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The unique identifier of the application’s environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * A timestamp that indicates when the environment was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The current state of the application. 
    */
  var State: js.UndefOr[ApplicationState] = js.undefined
}
object DeleteApplicationResponse {
  
  inline def apply(): DeleteApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationResponse]
  }
  
  extension [Self <: DeleteApplicationResponse](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ApplicationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
