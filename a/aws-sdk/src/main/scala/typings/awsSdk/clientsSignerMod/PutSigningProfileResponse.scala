package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSigningProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signing profile created.
    */
  var arn: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The version of the signing profile being created.
    */
  var profileVersion: js.UndefOr[ProfileVersion] = js.undefined
  
  /**
    * The signing profile ARN, including the profile version.
    */
  var profileVersionArn: js.UndefOr[Arn] = js.undefined
}
object PutSigningProfileResponse {
  
  inline def apply(): PutSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSigningProfileResponse]
  }
  
  extension [Self <: PutSigningProfileResponse](x: Self) {
    
    inline def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setProfileVersion(value: ProfileVersion): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionArn(value: Arn): Self = StObject.set(x, "profileVersionArn", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionArnUndefined: Self = StObject.set(x, "profileVersionArn", js.undefined)
    
    inline def setProfileVersionUndefined: Self = StObject.set(x, "profileVersion", js.undefined)
  }
}
