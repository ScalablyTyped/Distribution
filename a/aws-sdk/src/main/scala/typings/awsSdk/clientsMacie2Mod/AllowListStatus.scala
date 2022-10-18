package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowListStatus extends StObject {
  
  /**
    * The current status of the allow list. If the list's criteria specify a regular expression (regex), this value is typically OK. Amazon Macie can compile the expression. If the list's criteria specify an S3 object, possible values are: OK - Macie can retrieve and parse the contents of the object. S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a customer managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions settings for the bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that Macie is allowed to use. S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that the object contains the correct entries. Also ensure that the list's criteria specify the correct bucket and object names. S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the correct bucket and object names. S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its storage size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure that each file doesn't exceed any quotas. Then configure list settings in Macie for each file. S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try again. S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object exists, you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use. Work with your Amazon Web Services administrator to ensure that the list's criteria specify the correct bucket and object names, and you have read access to the bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that you're allowed to use. UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the object. Wait a few minutes and then try again. A list can also have this status if it's encrypted with a key that Amazon S3 and Macie can't access or use.
    */
  var code: AllowListStatusCode
  
  /**
    * A brief description of the status of the allow list. Amazon Macie uses this value to provide additional information about an error that occurred when Macie tried to access and use the list's criteria.
    */
  var description: js.UndefOr[stringMin1Max1024PatternSS] = js.undefined
}
object AllowListStatus {
  
  inline def apply(code: AllowListStatusCode): AllowListStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowListStatus]
  }
  
  extension [Self <: AllowListStatus](x: Self) {
    
    inline def setCode(value: AllowListStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: stringMin1Max1024PatternSS): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
