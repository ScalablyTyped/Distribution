package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseSnapshotsResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object describing the result of your get relational database snapshots request.
    */
  var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.undefined
}
object GetRelationalDatabaseSnapshotsResult {
  
  inline def apply(): GetRelationalDatabaseSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRelationalDatabaseSnapshotsResult] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRelationalDatabaseSnapshots(value: RelationalDatabaseSnapshotList): Self = StObject.set(x, "relationalDatabaseSnapshots", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseSnapshotsUndefined: Self = StObject.set(x, "relationalDatabaseSnapshots", js.undefined)
    
    inline def setRelationalDatabaseSnapshotsVarargs(value: RelationalDatabaseSnapshot*): Self = StObject.set(x, "relationalDatabaseSnapshots", js.Array(value*))
  }
}
