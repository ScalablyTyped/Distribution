package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntityRecognizerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: typings.awsDashSdk.clientsComprehendMod.EntityRecognizerArn
}

object DescribeEntityRecognizerRequest {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): DescribeEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn)
  
    __obj.asInstanceOf[DescribeEntityRecognizerRequest]
  }
}

