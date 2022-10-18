package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FSxWindowsFileServerAuthorizationConfig extends StObject {
  
  /**
    * The authorization credential option to use. The authorization credential options can be provided using either the Amazon Resource Name (ARN) of an Secrets Manager secret or SSM Parameter Store parameter. The ARN refers to the stored credentials.
    */
  var credentialsParameter: String
  
  /**
    * A fully qualified domain name hosted by an Directory Service Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
    */
  var domain: String
}
object FSxWindowsFileServerAuthorizationConfig {
  
  inline def apply(credentialsParameter: String, domain: String): FSxWindowsFileServerAuthorizationConfig = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSxWindowsFileServerAuthorizationConfig]
  }
  
  extension [Self <: FSxWindowsFileServerAuthorizationConfig](x: Self) {
    
    inline def setCredentialsParameter(value: String): Self = StObject.set(x, "credentialsParameter", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
