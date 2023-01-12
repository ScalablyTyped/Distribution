package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSigningJobRequest extends StObject {
  
  /**
    * String that identifies the signing request. All calls after the first that use this token return the same response as the first call.
    */
  var clientRequestToken: ClientRequestToken
  
  /**
    * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an optional prefix.
    */
  var destination: Destination
  
  /**
    * The name of the signing profile.
    */
  var profileName: ProfileName
  
  /**
    * The AWS account ID of the signing profile owner.
    */
  var profileOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
    */
  var source: Source
}
object StartSigningJobRequest {
  
  inline def apply(
    clientRequestToken: ClientRequestToken,
    destination: Destination,
    profileName: ProfileName,
    source: Source
  ): StartSigningJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSigningJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSigningJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileOwner(value: AccountId): Self = StObject.set(x, "profileOwner", value.asInstanceOf[js.Any])
    
    inline def setProfileOwnerUndefined: Self = StObject.set(x, "profileOwner", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
