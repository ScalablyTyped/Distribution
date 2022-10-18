package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotLimitsRequest extends StObject {
  
  /**
    * Contains the identifier of the directory to obtain the limits for.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object GetSnapshotLimitsRequest {
  
  inline def apply(DirectoryId: DirectoryId): GetSnapshotLimitsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotLimitsRequest]
  }
  
  extension [Self <: GetSnapshotLimitsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
