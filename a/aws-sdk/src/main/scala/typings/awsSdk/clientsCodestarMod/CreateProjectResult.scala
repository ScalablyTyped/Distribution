package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created project.
    */
  var arn: ProjectArn
  
  /**
    * A user- or system-generated token that identifies the entity that requested project creation.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The ID of the project.
    */
  var id: ProjectId
  
  /**
    * Reserved for future use.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
}
object CreateProjectResult {
  
  inline def apply(arn: ProjectArn, id: ProjectId): CreateProjectResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
  
  extension [Self <: CreateProjectResult](x: Self) {
    
    inline def setArn(value: ProjectArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectTemplateId(value: ProjectTemplateId): Self = StObject.set(x, "projectTemplateId", value.asInstanceOf[js.Any])
    
    inline def setProjectTemplateIdUndefined: Self = StObject.set(x, "projectTemplateId", js.undefined)
  }
}
