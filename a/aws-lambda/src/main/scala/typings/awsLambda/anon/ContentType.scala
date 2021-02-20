package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import typings.awsLambda.lexMod.LexGenericAttachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType extends StObject {
  
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
  implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: applicationSlashvndDotamazonawsDotcardDotgeneric): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericAttachments(value: js.Array[LexGenericAttachment]): Self = StObject.set(x, "genericAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericAttachmentsVarargs(value: LexGenericAttachment*): Self = StObject.set(x, "genericAttachments", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
