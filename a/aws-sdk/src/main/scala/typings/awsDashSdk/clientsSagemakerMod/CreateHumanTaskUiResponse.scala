package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHumanTaskUiResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
    */
  var HumanTaskUiArn: typings.awsDashSdk.clientsSagemakerMod.HumanTaskUiArn = js.native
}

object CreateHumanTaskUiResponse {
  @scala.inline
  def apply(HumanTaskUiArn: HumanTaskUiArn): CreateHumanTaskUiResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateHumanTaskUiResponse]
  }
}

