package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOperation extends StObject {
  
  /**
    * A transform operation that casts a column to a different type.
    */
  var CastColumnTypeOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CastColumnTypeOperation] = js.undefined
  
  /**
    * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  var CreateColumnsOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CreateColumnsOperation] = js.undefined
  
  /**
    * An operation that filters rows based on some condition.
    */
  var FilterOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FilterOperation] = js.undefined
  
  /**
    * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  var ProjectOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ProjectOperation] = js.undefined
  
  /**
    * An operation that renames a column.
    */
  var RenameColumnOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RenameColumnOperation] = js.undefined
  
  /**
    * An operation that tags a column with additional information.
    */
  var TagColumnOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TagColumnOperation] = js.undefined
  
  var UntagColumnOperation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.UntagColumnOperation] = js.undefined
}
object TransformOperation {
  
  inline def apply(): TransformOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOperation]
  }
  
  extension [Self <: TransformOperation](x: Self) {
    
    inline def setCastColumnTypeOperation(value: CastColumnTypeOperation): Self = StObject.set(x, "CastColumnTypeOperation", value.asInstanceOf[js.Any])
    
    inline def setCastColumnTypeOperationUndefined: Self = StObject.set(x, "CastColumnTypeOperation", js.undefined)
    
    inline def setCreateColumnsOperation(value: CreateColumnsOperation): Self = StObject.set(x, "CreateColumnsOperation", value.asInstanceOf[js.Any])
    
    inline def setCreateColumnsOperationUndefined: Self = StObject.set(x, "CreateColumnsOperation", js.undefined)
    
    inline def setFilterOperation(value: FilterOperation): Self = StObject.set(x, "FilterOperation", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationUndefined: Self = StObject.set(x, "FilterOperation", js.undefined)
    
    inline def setProjectOperation(value: ProjectOperation): Self = StObject.set(x, "ProjectOperation", value.asInstanceOf[js.Any])
    
    inline def setProjectOperationUndefined: Self = StObject.set(x, "ProjectOperation", js.undefined)
    
    inline def setRenameColumnOperation(value: RenameColumnOperation): Self = StObject.set(x, "RenameColumnOperation", value.asInstanceOf[js.Any])
    
    inline def setRenameColumnOperationUndefined: Self = StObject.set(x, "RenameColumnOperation", js.undefined)
    
    inline def setTagColumnOperation(value: TagColumnOperation): Self = StObject.set(x, "TagColumnOperation", value.asInstanceOf[js.Any])
    
    inline def setTagColumnOperationUndefined: Self = StObject.set(x, "TagColumnOperation", js.undefined)
    
    inline def setUntagColumnOperation(value: UntagColumnOperation): Self = StObject.set(x, "UntagColumnOperation", value.asInstanceOf[js.Any])
    
    inline def setUntagColumnOperationUndefined: Self = StObject.set(x, "UntagColumnOperation", js.undefined)
  }
}
