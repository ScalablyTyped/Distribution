package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyManagedPrefixListRequest extends StObject {
  
  /**
    * One or more entries to add to the prefix list.
    */
  var AddEntries: js.UndefOr[AddPrefixListEntries] = js.undefined
  
  /**
    * The current version of the prefix list.
    */
  var CurrentVersion: js.UndefOr[Long] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of entries for the prefix list. You cannot modify the entries of a prefix list and modify the size of a prefix list at the same time. If any of the resources that reference the prefix list cannot support the new maximum size, the modify operation fails. Check the state message for the IDs of the first ten resources that do not support the new maximum size.
    */
  var MaxEntries: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId
  
  /**
    * A name for the prefix list.
    */
  var PrefixListName: js.UndefOr[String] = js.undefined
  
  /**
    * One or more entries to remove from the prefix list.
    */
  var RemoveEntries: js.UndefOr[RemovePrefixListEntries] = js.undefined
}
object ModifyManagedPrefixListRequest {
  
  inline def apply(PrefixListId: PrefixListResourceId): ModifyManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyManagedPrefixListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyManagedPrefixListRequest] (val x: Self) extends AnyVal {
    
    inline def setAddEntries(value: AddPrefixListEntries): Self = StObject.set(x, "AddEntries", value.asInstanceOf[js.Any])
    
    inline def setAddEntriesUndefined: Self = StObject.set(x, "AddEntries", js.undefined)
    
    inline def setAddEntriesVarargs(value: AddPrefixListEntry*): Self = StObject.set(x, "AddEntries", js.Array(value*))
    
    inline def setCurrentVersion(value: Long): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxEntries(value: Integer): Self = StObject.set(x, "MaxEntries", value.asInstanceOf[js.Any])
    
    inline def setMaxEntriesUndefined: Self = StObject.set(x, "MaxEntries", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    inline def setPrefixListNameUndefined: Self = StObject.set(x, "PrefixListName", js.undefined)
    
    inline def setRemoveEntries(value: RemovePrefixListEntries): Self = StObject.set(x, "RemoveEntries", value.asInstanceOf[js.Any])
    
    inline def setRemoveEntriesUndefined: Self = StObject.set(x, "RemoveEntries", js.undefined)
    
    inline def setRemoveEntriesVarargs(value: RemovePrefixListEntry*): Self = StObject.set(x, "RemoveEntries", js.Array(value*))
  }
}
