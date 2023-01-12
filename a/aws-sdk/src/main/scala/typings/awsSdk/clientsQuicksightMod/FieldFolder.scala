package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldFolder extends StObject {
  
  /**
    * A folder has a list of columns. A column can only be in one folder.
    */
  var columns: js.UndefOr[FolderColumnList] = js.undefined
  
  /**
    * The description for a field folder.
    */
  var description: js.UndefOr[FieldFolderDescription] = js.undefined
}
object FieldFolder {
  
  inline def apply(): FieldFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldFolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldFolder] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: FolderColumnList): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDescription(value: FieldFolderDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
