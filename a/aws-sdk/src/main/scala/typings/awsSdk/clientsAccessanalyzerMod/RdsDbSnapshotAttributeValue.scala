package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsDbSnapshotAttributeValue extends StObject {
  
  /**
    * The Amazon Web Services account IDs that have access to the manual Amazon RDS DB snapshot. If the value all is specified, then the Amazon RDS DB snapshot is public and can be copied or restored by all Amazon Web Services accounts.   If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the accountIds in RdsDbSnapshotAttributeValue, then the access preview uses the existing shared accountIds for the snapshot.   If the access preview is for a new resource and you do not specify the specify the accountIds in RdsDbSnapshotAttributeValue, then the access preview considers the snapshot without any attributes.   To propose deletion of an existing shared accountIds, you can specify an empty list for accountIds in the RdsDbSnapshotAttributeValue.  
    */
  var accountIds: js.UndefOr[RdsDbSnapshotAccountIdsList] = js.undefined
}
object RdsDbSnapshotAttributeValue {
  
  inline def apply(): RdsDbSnapshotAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbSnapshotAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsDbSnapshotAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: RdsDbSnapshotAccountIdsList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: RdsDbSnapshotAccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
