package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSceneResponse extends StObject {
  
  /**
    * The ARN of the scene.
    */
  var arn: TwinMakerArn
  
  /**
    * A list of capabilities that the scene uses to render.
    */
  var capabilities: js.UndefOr[SceneCapabilities] = js.undefined
  
  /**
    * The relative path that specifies the location of the content definition file.
    */
  var contentLocation: S3Url
  
  /**
    * The date and time when the scene was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The description of the scene.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the scene.
    */
  var sceneId: Id
  
  /**
    * The date and time when the scene was last updated.
    */
  var updateDateTime: js.Date
  
  /**
    * The ID of the workspace that contains the scene.
    */
  var workspaceId: Id
}
object GetSceneResponse {
  
  inline def apply(
    arn: TwinMakerArn,
    contentLocation: S3Url,
    creationDateTime: js.Date,
    sceneId: Id,
    updateDateTime: js.Date,
    workspaceId: Id
  ): GetSceneResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], sceneId = sceneId.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSceneResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSceneResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: SceneCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: SceneCapability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setContentLocation(value: S3Url): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSceneId(value: Id): Self = StObject.set(x, "sceneId", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
