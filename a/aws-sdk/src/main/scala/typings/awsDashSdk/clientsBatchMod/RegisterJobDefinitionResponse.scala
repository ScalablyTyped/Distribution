package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterJobDefinitionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job definition.
    */
  var jobDefinitionArn: String = js.native
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String = js.native
  /**
    * The revision of the job definition.
    */
  var revision: Integer = js.native
}

object RegisterJobDefinitionResponse {
  @scala.inline
  def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer): RegisterJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterJobDefinitionResponse]
  }
}

