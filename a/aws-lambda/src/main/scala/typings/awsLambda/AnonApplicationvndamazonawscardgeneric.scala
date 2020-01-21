package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import typings.awsLambda.mod.LexGenericAttachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplicationvndamazonawscardgeneric extends js.Object {
  var contentType: applicationSlashvndDotamazonawsDotcardDotgeneric
  var genericAttachments: js.Array[LexGenericAttachment]
  var version: Double
}

object AnonApplicationvndamazonawscardgeneric {
  @scala.inline
  def apply(
    contentType: applicationSlashvndDotamazonawsDotcardDotgeneric,
    genericAttachments: js.Array[LexGenericAttachment],
    version: Double
  ): AnonApplicationvndamazonawscardgeneric = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], genericAttachments = genericAttachments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApplicationvndamazonawscardgeneric]
  }
}

