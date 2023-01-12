package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasRequest extends StObject {
  
  /**
    * The requested alias. The alias must be unique amongst all aliases in Amazon Web Services. This operation throws an EntityAlreadyExistsException error if the alias already exists.
    */
  var Alias: AliasName
  
  /**
    * The identifier of the directory for which to create the alias.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object CreateAliasRequest {
  
  inline def apply(Alias: AliasName, DirectoryId: DirectoryId): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: AliasName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
