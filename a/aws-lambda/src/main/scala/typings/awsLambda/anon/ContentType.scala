package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import typings.awsLambda.triggerLexMod.LexGenericAttachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType extends StObject {
  
  var contentType: applicationSlashvndDotamazonawsDotcardDotgeneric
  
  var genericAttachments: js.Array[LexGenericAttachment]
  
  var version: Double
}
object ContentType {
  
  inline def apply(genericAttachments: js.Array[LexGenericAttachment], version: Double): ContentType = {
    val __obj = js.Dynamic.literal(contentType = "application/vnd.amazonaws.card.generic", genericAttachments = genericAttachments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: applicationSlashvndDotamazonawsDotcardDotgeneric): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setGenericAttachments(value: js.Array[LexGenericAttachment]): Self = StObject.set(x, "genericAttachments", value.asInstanceOf[js.Any])
    
    inline def setGenericAttachmentsVarargs(value: LexGenericAttachment*): Self = StObject.set(x, "genericAttachments", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
