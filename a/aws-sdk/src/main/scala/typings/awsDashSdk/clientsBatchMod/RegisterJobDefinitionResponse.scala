package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterJobDefinitionResponse extends js.Object {
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
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn, jobDefinitionName = jobDefinitionName, revision = revision)
  
    __obj.asInstanceOf[RegisterJobDefinitionResponse]
  }
}

