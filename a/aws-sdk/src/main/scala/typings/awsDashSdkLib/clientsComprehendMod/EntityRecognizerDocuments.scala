package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRecognizerDocuments extends js.Object {
  /**
    *  Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: awsDashSdkLib.clientsComprehendMod.S3Uri
}

object EntityRecognizerDocuments {
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerDocuments = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri)
  
    __obj.asInstanceOf[EntityRecognizerDocuments]
  }
}

