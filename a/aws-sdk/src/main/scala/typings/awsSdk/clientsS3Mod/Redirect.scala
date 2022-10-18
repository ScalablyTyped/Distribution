package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redirect extends StObject {
  
  /**
    * The host name to use in the redirect request.
    */
  var HostName: js.UndefOr[typings.awsSdk.clientsS3Mod.HostName] = js.undefined
  
  /**
    * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
    */
  var HttpRedirectCode: js.UndefOr[typings.awsSdk.clientsS3Mod.HttpRedirectCode] = js.undefined
  
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typings.awsSdk.clientsS3Mod.Protocol] = js.undefined
  
  /**
    * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var ReplaceKeyPrefixWith: js.UndefOr[typings.awsSdk.clientsS3Mod.ReplaceKeyPrefixWith] = js.undefined
  
  /**
    * The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the siblings is present. Can be present only if ReplaceKeyPrefixWith is not provided.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var ReplaceKeyWith: js.UndefOr[typings.awsSdk.clientsS3Mod.ReplaceKeyWith] = js.undefined
}
object Redirect {
  
  inline def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  
  extension [Self <: Redirect](x: Self) {
    
    inline def setHostName(value: HostName): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
    
    inline def setHttpRedirectCode(value: HttpRedirectCode): Self = StObject.set(x, "HttpRedirectCode", value.asInstanceOf[js.Any])
    
    inline def setHttpRedirectCodeUndefined: Self = StObject.set(x, "HttpRedirectCode", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setReplaceKeyPrefixWith(value: ReplaceKeyPrefixWith): Self = StObject.set(x, "ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
    
    inline def setReplaceKeyPrefixWithUndefined: Self = StObject.set(x, "ReplaceKeyPrefixWith", js.undefined)
    
    inline def setReplaceKeyWith(value: ReplaceKeyWith): Self = StObject.set(x, "ReplaceKeyWith", value.asInstanceOf[js.Any])
    
    inline def setReplaceKeyWithUndefined: Self = StObject.set(x, "ReplaceKeyWith", js.undefined)
  }
}
