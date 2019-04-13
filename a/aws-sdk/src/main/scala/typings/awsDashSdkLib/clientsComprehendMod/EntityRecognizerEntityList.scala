package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRecognizerEntityList extends js.Object {
  /**
    * Specifies the Amazon S3 location where the entity list is located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: awsDashSdkLib.clientsComprehendMod.S3Uri
}

object EntityRecognizerEntityList {
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerEntityList = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri)
  
    __obj.asInstanceOf[EntityRecognizerEntityList]
  }
}

