package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTrainingEntityRecognizerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer currently being trained.
    */
  var EntityRecognizerArn: awsDashSdkLib.clientsComprehendMod.EntityRecognizerArn
}

object StopTrainingEntityRecognizerRequest {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): StopTrainingEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn)
  
    __obj.asInstanceOf[StopTrainingEntityRecognizerRequest]
  }
}

