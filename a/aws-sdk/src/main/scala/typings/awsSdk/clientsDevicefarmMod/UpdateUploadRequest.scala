package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUploadRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the uploaded test spec.
    */
  var arn: AmazonResourceName
  
  /**
    * The upload's content type (for example, application/x-yaml).
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Set to true if the YAML file has changed and must be updated. Otherwise, set to false.
    */
  var editContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The upload's test spec file name. The name must not contain any forward slashes (/). The test spec file name must end with the .yaml or .yml file extension.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object UpdateUploadRequest {
  
  inline def apply(arn: AmazonResourceName): UpdateUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEditContent(value: Boolean): Self = StObject.set(x, "editContent", value.asInstanceOf[js.Any])
    
    inline def setEditContentUndefined: Self = StObject.set(x, "editContent", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
