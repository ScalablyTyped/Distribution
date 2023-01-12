package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedTable extends StObject {
  
  /**
    * A list of LF-tags attached to the database where the table resides.
    */
  var LFTagOnDatabase: js.UndefOr[LFTagsList] = js.undefined
  
  /**
    * A list of LF-tags attached to columns in the table.
    */
  var LFTagsOnColumns: js.UndefOr[ColumnLFTagsList] = js.undefined
  
  /**
    * A list of LF-tags attached to the table.
    */
  var LFTagsOnTable: js.UndefOr[LFTagsList] = js.undefined
  
  /**
    * A table that has LF-tags attached to it.
    */
  var Table: js.UndefOr[TableResource] = js.undefined
}
object TaggedTable {
  
  inline def apply(): TaggedTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaggedTable] (val x: Self) extends AnyVal {
    
    inline def setLFTagOnDatabase(value: LFTagsList): Self = StObject.set(x, "LFTagOnDatabase", value.asInstanceOf[js.Any])
    
    inline def setLFTagOnDatabaseUndefined: Self = StObject.set(x, "LFTagOnDatabase", js.undefined)
    
    inline def setLFTagOnDatabaseVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTagOnDatabase", js.Array(value*))
    
    inline def setLFTagsOnColumns(value: ColumnLFTagsList): Self = StObject.set(x, "LFTagsOnColumns", value.asInstanceOf[js.Any])
    
    inline def setLFTagsOnColumnsUndefined: Self = StObject.set(x, "LFTagsOnColumns", js.undefined)
    
    inline def setLFTagsOnColumnsVarargs(value: ColumnLFTag*): Self = StObject.set(x, "LFTagsOnColumns", js.Array(value*))
    
    inline def setLFTagsOnTable(value: LFTagsList): Self = StObject.set(x, "LFTagsOnTable", value.asInstanceOf[js.Any])
    
    inline def setLFTagsOnTableUndefined: Self = StObject.set(x, "LFTagsOnTable", js.undefined)
    
    inline def setLFTagsOnTableVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTagsOnTable", js.Array(value*))
    
    inline def setTable(value: TableResource): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
