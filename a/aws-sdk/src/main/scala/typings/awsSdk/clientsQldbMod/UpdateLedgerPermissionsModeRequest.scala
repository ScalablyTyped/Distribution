package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLedgerPermissionsModeRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
  
  /**
    * The permissions mode to assign to the ledger. This parameter can have one of the following values:    ALLOW_ALL: A legacy permissions mode that enables access control with API-level granularity for ledgers. This mode allows users who have the SendCommand API permission for this ledger to run all PartiQL commands (hence, ALLOW_ALL) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.    STANDARD: (Recommended) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands. By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the SendCommand API permission for the ledger. For information, see Getting started with the standard permissions mode in the Amazon QLDB Developer Guide.    We strongly recommend using the STANDARD permissions mode to maximize the security of your ledger data. 
    */
  var PermissionsMode: typings.awsSdk.clientsQldbMod.PermissionsMode
}
object UpdateLedgerPermissionsModeRequest {
  
  inline def apply(Name: LedgerName, PermissionsMode: PermissionsMode): UpdateLedgerPermissionsModeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionsMode = PermissionsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLedgerPermissionsModeRequest]
  }
  
  extension [Self <: UpdateLedgerPermissionsModeRequest](x: Self) {
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPermissionsMode(value: PermissionsMode): Self = StObject.set(x, "PermissionsMode", value.asInstanceOf[js.Any])
  }
}
