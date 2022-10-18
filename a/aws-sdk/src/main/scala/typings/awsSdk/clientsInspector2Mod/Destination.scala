package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * The name of the Amazon S3 bucket to export findings to.
    */
  var bucketName: String
  
  /**
    * The prefix of the KMS key used to export findings.
    */
  var keyPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the KMS key used to encrypt data when exporting findings.
    */
  var kmsKeyArn: String
}
object Destination {
  
  inline def apply(bucketName: String, kmsKeyArn: String): Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
