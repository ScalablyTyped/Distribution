package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageDeploymentRequest extends StObject {
  
  /**
    *  The identifier of the stage deployment. StartStageDeployment returns the identifier that you use here. 
    */
  var DeploymentId: js.UndefOr[typings.awsSdk.clientsGamesparksMod.DeploymentId] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The name of the stage.
    */
  var StageName: typings.awsSdk.clientsGamesparksMod.StageName
}
object GetStageDeploymentRequest {
  
  inline def apply(GameName: GameName, StageName: StageName): GetStageDeploymentRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStageDeploymentRequest]
  }
  
  extension [Self <: GetStageDeploymentRequest](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
