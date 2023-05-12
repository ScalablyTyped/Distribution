package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key.
    */
  var KMSKeyArn: typings.awsSdk.clientsForecastserviceMod.KMSKeyArn
  
  /**
    * The ARN of the IAM role that Amazon Forecast can assume to access the KMS key. Passing a role across Amazon Web Services accounts is not allowed. If you pass a role that isn't in your account, you get an InvalidInputException error.
    */
  var RoleArn: Arn
}
object EncryptionConfig {
  
  inline def apply(KMSKeyArn: KMSKeyArn, RoleArn: Arn): EncryptionConfig = {
    val __obj = js.Dynamic.literal(KMSKeyArn = KMSKeyArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    
    inline def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
