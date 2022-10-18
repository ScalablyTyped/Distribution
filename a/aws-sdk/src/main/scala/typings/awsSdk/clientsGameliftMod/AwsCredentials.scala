package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCredentials extends StObject {
  
  /**
    * Temporary key allowing access to the Amazon GameLift S3 account.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Temporary secret key allowing access to the Amazon GameLift S3 account.
    */
  var SecretAccessKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Token used to associate a specific build ID with the files uploaded using these credentials.
    */
  var SessionToken: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCredentials {
  
  inline def apply(): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCredentials]
  }
  
  extension [Self <: AwsCredentials](x: Self) {
    
    inline def setAccessKeyId(value: NonEmptyString): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setSecretAccessKey(value: NonEmptyString): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "SecretAccessKey", js.undefined)
    
    inline def setSessionToken(value: NonEmptyString): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
