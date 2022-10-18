package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteSnapshotResponse extends StObject {
  
  /**
    * The status of the snapshot.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsEbsMod.Status] = js.undefined
}
object CompleteSnapshotResponse {
  
  inline def apply(): CompleteSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteSnapshotResponse]
  }
  
  extension [Self <: CompleteSnapshotResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
