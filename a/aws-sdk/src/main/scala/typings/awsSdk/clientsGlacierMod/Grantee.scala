package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grantee extends StObject {
  
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[String] = js.undefined
  
  /**
    * Type of grantee
    */
  var Type: typings.awsSdk.clientsGlacierMod.Type
  
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[String] = js.undefined
}
object Grantee {
  
  inline def apply(Type: Type): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  
  extension [Self <: Grantee](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
