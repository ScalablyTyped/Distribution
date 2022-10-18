package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginAccessControlSummary extends StObject {
  
  /**
    * A description of the origin access control.
    */
  var Description: String
  
  /**
    * The unique identifier of the origin access control.
    */
  var Id: String
  
  /**
    * A unique name that identifies the origin access control.
    */
  var Name: String
  
  /**
    * The type of origin that this origin access control is for. The only valid value is s3.
    */
  var OriginAccessControlOriginType: OriginAccessControlOriginTypes
  
  /**
    * A value that specifies which requests CloudFront signs (adds authentication information to). This field can have one of the following values:    never – CloudFront doesn't sign any origin requests.    always – CloudFront signs all origin requests, overwriting the Authorization header from the viewer request if necessary.    no-override – If the viewer request doesn't contain the Authorization header, CloudFront signs the origin request. If the viewer request contains the Authorization header, CloudFront doesn't sign the origin request, but instead passes along the Authorization header that it received in the viewer request.  
    */
  var SigningBehavior: OriginAccessControlSigningBehaviors
  
  /**
    * The signing protocol of the origin access control. The signing protocol determines how CloudFront signs (authenticates) requests. The only valid value is sigv4.
    */
  var SigningProtocol: OriginAccessControlSigningProtocols
}
object OriginAccessControlSummary {
  
  inline def apply(
    Description: String,
    Id: String,
    Name: String,
    OriginAccessControlOriginType: OriginAccessControlOriginTypes,
    SigningBehavior: OriginAccessControlSigningBehaviors,
    SigningProtocol: OriginAccessControlSigningProtocols
  ): OriginAccessControlSummary = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OriginAccessControlOriginType = OriginAccessControlOriginType.asInstanceOf[js.Any], SigningBehavior = SigningBehavior.asInstanceOf[js.Any], SigningProtocol = SigningProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessControlSummary]
  }
  
  extension [Self <: OriginAccessControlSummary](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlOriginType(value: OriginAccessControlOriginTypes): Self = StObject.set(x, "OriginAccessControlOriginType", value.asInstanceOf[js.Any])
    
    inline def setSigningBehavior(value: OriginAccessControlSigningBehaviors): Self = StObject.set(x, "SigningBehavior", value.asInstanceOf[js.Any])
    
    inline def setSigningProtocol(value: OriginAccessControlSigningProtocols): Self = StObject.set(x, "SigningProtocol", value.asInstanceOf[js.Any])
  }
}
