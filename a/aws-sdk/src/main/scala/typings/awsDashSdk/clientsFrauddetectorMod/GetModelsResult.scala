package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelsResult extends js.Object {
  /**
    * The returned models. 
    */
  var models: js.UndefOr[ModelList] = js.native
  /**
    * The next token for subsequent requests. 
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetModelsResult {
  @scala.inline
  def apply(models: ModelList = null, nextToken: String = null): GetModelsResult = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelsResult]
  }
}

