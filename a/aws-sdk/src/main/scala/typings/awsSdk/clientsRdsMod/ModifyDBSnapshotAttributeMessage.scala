package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBSnapshotAttributeMessage extends StObject {
  
  /**
    * The name of the DB snapshot attribute to modify. To manage authorization for other Amazon Web Services accounts to copy or restore a manual DB snapshot, set this value to restore.  To view the list of attributes available to modify, use the DescribeDBSnapshotAttributes API operation. 
    */
  var AttributeName: String
  
  /**
    * The identifier for the DB snapshot to modify the attributes for.
    */
  var DBSnapshotIdentifier: String
  
  /**
    * A list of DB snapshot attributes to add to the attribute specified by AttributeName. To authorize other Amazon Web Services accounts to copy or restore a manual snapshot, set this list to include one or more Amazon Web Services account IDs, or all to make the manual DB snapshot restorable by any Amazon Web Services account. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all Amazon Web Services accounts.
    */
  var ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined
  
  /**
    * A list of DB snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other Amazon Web Services accounts to copy or restore a manual snapshot, set this list to include one or more Amazon Web Services account identifiers, or all to remove authorization for any Amazon Web Services account to copy or restore the DB snapshot. If you specify all, an Amazon Web Services account whose account ID is explicitly added to the restore attribute can still copy or restore the manual DB snapshot.
    */
  var ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
}
object ModifyDBSnapshotAttributeMessage {
  
  inline def apply(AttributeName: String, DBSnapshotIdentifier: String): ModifyDBSnapshotAttributeMessage = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSnapshotAttributeMessage]
  }
  
  extension [Self <: ModifyDBSnapshotAttributeMessage](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setValuesToAdd(value: AttributeValueList): Self = StObject.set(x, "ValuesToAdd", value.asInstanceOf[js.Any])
    
    inline def setValuesToAddUndefined: Self = StObject.set(x, "ValuesToAdd", js.undefined)
    
    inline def setValuesToAddVarargs(value: String*): Self = StObject.set(x, "ValuesToAdd", js.Array(value*))
    
    inline def setValuesToRemove(value: AttributeValueList): Self = StObject.set(x, "ValuesToRemove", value.asInstanceOf[js.Any])
    
    inline def setValuesToRemoveUndefined: Self = StObject.set(x, "ValuesToRemove", js.undefined)
    
    inline def setValuesToRemoveVarargs(value: String*): Self = StObject.set(x, "ValuesToRemove", js.Array(value*))
  }
}
