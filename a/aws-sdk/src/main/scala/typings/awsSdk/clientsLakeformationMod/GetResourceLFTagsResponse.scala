package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceLFTagsResponse extends StObject {
  
  /**
    * A list of LF-tags applied to a database resource.
    */
  var LFTagOnDatabase: js.UndefOr[LFTagsList] = js.undefined
  
  /**
    * A list of LF-tags applied to a column resource.
    */
  var LFTagsOnColumns: js.UndefOr[ColumnLFTagsList] = js.undefined
  
  /**
    * A list of LF-tags applied to a table resource.
    */
  var LFTagsOnTable: js.UndefOr[LFTagsList] = js.undefined
}
object GetResourceLFTagsResponse {
  
  inline def apply(): GetResourceLFTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceLFTagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceLFTagsResponse] (val x: Self) extends AnyVal {
    
    inline def setLFTagOnDatabase(value: LFTagsList): Self = StObject.set(x, "LFTagOnDatabase", value.asInstanceOf[js.Any])
    
    inline def setLFTagOnDatabaseUndefined: Self = StObject.set(x, "LFTagOnDatabase", js.undefined)
    
    inline def setLFTagOnDatabaseVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTagOnDatabase", js.Array(value*))
    
    inline def setLFTagsOnColumns(value: ColumnLFTagsList): Self = StObject.set(x, "LFTagsOnColumns", value.asInstanceOf[js.Any])
    
    inline def setLFTagsOnColumnsUndefined: Self = StObject.set(x, "LFTagsOnColumns", js.undefined)
    
    inline def setLFTagsOnColumnsVarargs(value: ColumnLFTag*): Self = StObject.set(x, "LFTagsOnColumns", js.Array(value*))
    
    inline def setLFTagsOnTable(value: LFTagsList): Self = StObject.set(x, "LFTagsOnTable", value.asInstanceOf[js.Any])
    
    inline def setLFTagsOnTableUndefined: Self = StObject.set(x, "LFTagsOnTable", js.undefined)
    
    inline def setLFTagsOnTableVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTagsOnTable", js.Array(value*))
  }
}
