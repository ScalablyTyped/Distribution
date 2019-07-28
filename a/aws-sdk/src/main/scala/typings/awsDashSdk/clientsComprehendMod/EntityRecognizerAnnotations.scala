package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRecognizerAnnotations extends js.Object {
  /**
    *  Specifies the Amazon S3 location where the annotations for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsDashSdk.clientsComprehendMod.S3Uri
}

object EntityRecognizerAnnotations {
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerAnnotations = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri)
  
    __obj.asInstanceOf[EntityRecognizerAnnotations]
  }
}

