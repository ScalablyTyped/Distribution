package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshareDirectoryResult extends StObject {
  
  /**
    * Identifier of the directory stored in the directory consumer account that is to be unshared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}
object UnshareDirectoryResult {
  
  inline def apply(): UnshareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnshareDirectoryResult]
  }
  
  extension [Self <: UnshareDirectoryResult](x: Self) {
    
    inline def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
