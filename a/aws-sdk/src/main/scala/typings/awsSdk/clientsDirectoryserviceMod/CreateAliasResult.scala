package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasResult extends StObject {
  
  /**
    * The alias for the directory.
    */
  var Alias: js.UndefOr[AliasName] = js.undefined
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}
object CreateAliasResult {
  
  inline def apply(): CreateAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAliasResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAliasResult] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: AliasName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
