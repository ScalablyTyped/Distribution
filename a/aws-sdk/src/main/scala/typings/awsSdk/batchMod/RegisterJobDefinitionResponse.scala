package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterJobDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the job definition.
    */
  var jobDefinitionArn: String
  
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String
  
  /**
    * The revision of the job definition.
    */
  var revision: Integer
}
object RegisterJobDefinitionResponse {
  
  @scala.inline
  def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer): RegisterJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterJobDefinitionResponse]
  }
  
  @scala.inline
  implicit class RegisterJobDefinitionResponseMutableBuilder[Self <: RegisterJobDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobDefinitionArn(value: String): Self = StObject.set(x, "jobDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDefinitionName(value: String): Self = StObject.set(x, "jobDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Integer): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
