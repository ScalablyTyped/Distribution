package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import typings.awsLambda.lexMod.LexGenericAttachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentType extends js.Object {
  var contentType: applicationSlashvndDotamazonawsDotcardDotgeneric = js.native
  var genericAttachments: js.Array[LexGenericAttachment] = js.native
  var version: Double = js.native
}

object ContentType {
  @scala.inline
  def apply(
    contentType: applicationSlashvndDotamazonawsDotcardDotgeneric,
    genericAttachments: js.Array[LexGenericAttachment],
    version: Double
  ): ContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], genericAttachments = genericAttachments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
  @scala.inline
  implicit class ContentTypeOps[Self <: ContentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentType(value: applicationSlashvndDotamazonawsDotcardDotgeneric): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenericAttachmentsVarargs(value: LexGenericAttachment*): Self = this.set("genericAttachments", js.Array(value :_*))
    @scala.inline
    def setGenericAttachments(value: js.Array[LexGenericAttachment]): Self = this.set("genericAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

