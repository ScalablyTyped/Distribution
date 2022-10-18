package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginAccessControlConfig extends StObject {
  
  /**
    * A description of the origin access control.
    */
  var Description: String
  
  /**
    * A name to identify the origin access control.
    */
  var Name: String
  
  /**
    * The type of origin that this origin access control is for. The only valid value is s3.
    */
  var OriginAccessControlOriginType: OriginAccessControlOriginTypes
  
  /**
    * Specifies which requests CloudFront signs (adds authentication information to). Specify always for the most common use case. For more information, see origin access control advanced settings in the Amazon CloudFront Developer Guide. This field can have one of the following values:    always – CloudFront signs all origin requests, overwriting the Authorization header from the viewer request if one exists.    never – CloudFront doesn't sign any origin requests. This value turns off origin access control for all origins in all distributions that use this origin access control.    no-override – If the viewer request doesn't contain the Authorization header, then CloudFront signs the origin request. If the viewer request contains the Authorization header, then CloudFront doesn't sign the origin request and instead passes along the Authorization header from the viewer request. WARNING: To pass along the Authorization header from the viewer request, you must add the Authorization header to a cache policy for all cache behaviors that use origins associated with this origin access control.   
    */
  var SigningBehavior: OriginAccessControlSigningBehaviors
  
  /**
    * The signing protocol of the origin access control, which determines how CloudFront signs (authenticates) requests. The only valid value is sigv4.
    */
  var SigningProtocol: OriginAccessControlSigningProtocols
}
object OriginAccessControlConfig {
  
  inline def apply(
    Description: String,
    Name: String,
    OriginAccessControlOriginType: OriginAccessControlOriginTypes,
    SigningBehavior: OriginAccessControlSigningBehaviors,
    SigningProtocol: OriginAccessControlSigningProtocols
  ): OriginAccessControlConfig = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OriginAccessControlOriginType = OriginAccessControlOriginType.asInstanceOf[js.Any], SigningBehavior = SigningBehavior.asInstanceOf[js.Any], SigningProtocol = SigningProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessControlConfig]
  }
  
  extension [Self <: OriginAccessControlConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlOriginType(value: OriginAccessControlOriginTypes): Self = StObject.set(x, "OriginAccessControlOriginType", value.asInstanceOf[js.Any])
    
    inline def setSigningBehavior(value: OriginAccessControlSigningBehaviors): Self = StObject.set(x, "SigningBehavior", value.asInstanceOf[js.Any])
    
    inline def setSigningProtocol(value: OriginAccessControlSigningProtocols): Self = StObject.set(x, "SigningProtocol", value.asInstanceOf[js.Any])
  }
}
