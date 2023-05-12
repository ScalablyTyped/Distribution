package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryS3OutputConfiguration extends StObject {
  
  /**
    * The S3 bucket to unload the protected query results.
    */
  var bucket: ProtectedQueryS3OutputConfigurationBucketString
  
  /**
    * The S3 prefix to unload the protected query results.
    */
  var keyPrefix: js.UndefOr[KeyPrefix] = js.undefined
  
  /**
    * Intended file format of the result.
    */
  var resultFormat: ResultFormat
}
object ProtectedQueryS3OutputConfiguration {
  
  inline def apply(bucket: ProtectedQueryS3OutputConfigurationBucketString, resultFormat: ResultFormat): ProtectedQueryS3OutputConfiguration = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], resultFormat = resultFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQueryS3OutputConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryS3OutputConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: ProtectedQueryS3OutputConfigurationBucketString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefix(value: KeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setResultFormat(value: ResultFormat): Self = StObject.set(x, "resultFormat", value.asInstanceOf[js.Any])
  }
}
