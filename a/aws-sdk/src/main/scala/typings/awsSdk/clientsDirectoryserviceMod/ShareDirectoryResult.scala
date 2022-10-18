package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDirectoryResult extends StObject {
  
  /**
    * Identifier of the directory that is stored in the directory consumer account that is shared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}
object ShareDirectoryResult {
  
  inline def apply(): ShareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDirectoryResult]
  }
  
  extension [Self <: ShareDirectoryResult](x: Self) {
    
    inline def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
