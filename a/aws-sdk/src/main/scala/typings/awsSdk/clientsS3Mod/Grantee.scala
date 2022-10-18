package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grantee extends StObject {
  
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsS3Mod.DisplayName] = js.undefined
  
  /**
    * Email address of the grantee.  Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:    US East (N. Virginia)   US West (N. California)    US West (Oregon)    Asia Pacific (Singapore)   Asia Pacific (Sydney)   Asia Pacific (Tokyo)   Europe (Ireland)   South America (São Paulo)   For a list of all the Amazon S3 supported Regions and endpoints, see Regions and Endpoints in the Amazon Web Services General Reference. 
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.clientsS3Mod.EmailAddress] = js.undefined
  
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[typings.awsSdk.clientsS3Mod.ID] = js.undefined
  
  /**
    * Type of grantee
    */
  var Type: typings.awsSdk.clientsS3Mod.Type
  
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[typings.awsSdk.clientsS3Mod.URI] = js.undefined
}
object Grantee {
  
  inline def apply(Type: Type): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  
  extension [Self <: Grantee](x: Self) {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setURI(value: URI): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
