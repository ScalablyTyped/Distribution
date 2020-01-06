package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerEntityList extends js.Object {
  /**
    * Specifies the Amazon S3 location where the entity list is located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsDashSdk.clientsComprehendMod.S3Uri = js.native
}

object EntityRecognizerEntityList {
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerEntityList = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityRecognizerEntityList]
  }
}

