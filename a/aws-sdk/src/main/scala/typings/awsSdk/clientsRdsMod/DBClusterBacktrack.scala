package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterBacktrack extends StObject {
  
  /**
    * Contains the backtrack identifier.
    */
  var BacktrackIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the time at which the backtrack was requested.
    */
  var BacktrackRequestCreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the time to which the DB cluster was backtracked.
    */
  var BacktrackTo: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the time from which the DB cluster was backtracked.
    */
  var BacktrackedFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the backtrack. This property returns one of the following values:    applying - The backtrack is currently being applied to or rolled back from the DB cluster.    completed - The backtrack has successfully been applied to or rolled back from the DB cluster.    failed - An error occurred while the backtrack was applied to or rolled back from the DB cluster.    pending - The backtrack is currently pending application to or rollback from the DB cluster.  
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBClusterBacktrack {
  
  inline def apply(): DBClusterBacktrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBClusterBacktrack] (val x: Self) extends AnyVal {
    
    inline def setBacktrackIdentifier(value: String): Self = StObject.set(x, "BacktrackIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBacktrackIdentifierUndefined: Self = StObject.set(x, "BacktrackIdentifier", js.undefined)
    
    inline def setBacktrackRequestCreationTime(value: js.Date): Self = StObject.set(x, "BacktrackRequestCreationTime", value.asInstanceOf[js.Any])
    
    inline def setBacktrackRequestCreationTimeUndefined: Self = StObject.set(x, "BacktrackRequestCreationTime", js.undefined)
    
    inline def setBacktrackTo(value: js.Date): Self = StObject.set(x, "BacktrackTo", value.asInstanceOf[js.Any])
    
    inline def setBacktrackToUndefined: Self = StObject.set(x, "BacktrackTo", js.undefined)
    
    inline def setBacktrackedFrom(value: js.Date): Self = StObject.set(x, "BacktrackedFrom", value.asInstanceOf[js.Any])
    
    inline def setBacktrackedFromUndefined: Self = StObject.set(x, "BacktrackedFrom", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
