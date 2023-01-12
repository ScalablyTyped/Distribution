package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorldExportJobRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
    */
  var iamRole: IamRole
  
  var outputLocation: OutputLocation
  
  /**
    * A map that contains tag keys and tag values that are attached to the world export job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A list of Amazon Resource Names (arns) that correspond to worlds to export.
    */
  var worlds: Arns
}
object CreateWorldExportJobRequest {
  
  inline def apply(iamRole: IamRole, outputLocation: OutputLocation, worlds: Arns): CreateWorldExportJobRequest = {
    val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any], outputLocation = outputLocation.asInstanceOf[js.Any], worlds = worlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorldExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorldExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
    
    inline def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorlds(value: Arns): Self = StObject.set(x, "worlds", value.asInstanceOf[js.Any])
    
    inline def setWorldsVarargs(value: Arn*): Self = StObject.set(x, "worlds", js.Array(value*))
  }
}
