package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterSnapshotAttributesResult extends StObject {
  
  /**
    * The list of attributes and values for the manual DB cluster snapshot.
    */
  var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined
  
  /**
    * The identifier of the manual DB cluster snapshot that the attributes apply to.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
}
object DBClusterSnapshotAttributesResult {
  
  inline def apply(): DBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
  }
  
  extension [Self <: DBClusterSnapshotAttributesResult](x: Self) {
    
    inline def setDBClusterSnapshotAttributes(value: DBClusterSnapshotAttributeList): Self = StObject.set(x, "DBClusterSnapshotAttributes", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotAttributesUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributes", js.undefined)
    
    inline def setDBClusterSnapshotAttributesVarargs(value: DBClusterSnapshotAttribute*): Self = StObject.set(x, "DBClusterSnapshotAttributes", js.Array(value*))
    
    inline def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DBClusterSnapshotIdentifier", js.undefined)
  }
}
