package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUploadRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm upload to delete.
    */
  var arn: AmazonResourceName
}
object DeleteUploadRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
