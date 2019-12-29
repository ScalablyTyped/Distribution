package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.LexGenericAttachment
import typings.awsDashLambda.awsDashLambdaStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Applicationvndamazonawscardgeneric extends js.Object {
  var contentType: applicationSlashvndDotamazonawsDotcardDotgeneric
  var genericAttachments: js.Array[LexGenericAttachment]
  var version: Double
}

object Anon_Applicationvndamazonawscardgeneric {
  @scala.inline
  def apply(
    contentType: applicationSlashvndDotamazonawsDotcardDotgeneric,
    genericAttachments: js.Array[LexGenericAttachment],
    version: Double
  ): Anon_Applicationvndamazonawscardgeneric = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], genericAttachments = genericAttachments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Applicationvndamazonawscardgeneric]
  }
}

