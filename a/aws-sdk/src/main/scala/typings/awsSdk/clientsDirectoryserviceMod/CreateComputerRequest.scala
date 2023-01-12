package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComputerRequest extends StObject {
  
  /**
    * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The name of the computer account.
    */
  var ComputerName: typings.awsSdk.clientsDirectoryserviceMod.ComputerName
  
  /**
    * The identifier of the directory in which to create the computer account.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The fully-qualified distinguished name of the organizational unit to place the computer account in.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.undefined
  
  /**
    * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
    */
  var Password: ComputerPassword
}
object CreateComputerRequest {
  
  inline def apply(ComputerName: ComputerName, DirectoryId: DirectoryId, Password: ComputerPassword): CreateComputerRequest = {
    val __obj = js.Dynamic.literal(ComputerName = ComputerName.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateComputerRequest] (val x: Self) extends AnyVal {
    
    inline def setComputerAttributes(value: Attributes): Self = StObject.set(x, "ComputerAttributes", value.asInstanceOf[js.Any])
    
    inline def setComputerAttributesUndefined: Self = StObject.set(x, "ComputerAttributes", js.undefined)
    
    inline def setComputerAttributesVarargs(value: Attribute*): Self = StObject.set(x, "ComputerAttributes", js.Array(value*))
    
    inline def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDN): Self = StObject.set(x, "OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedName", js.undefined)
    
    inline def setPassword(value: ComputerPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
