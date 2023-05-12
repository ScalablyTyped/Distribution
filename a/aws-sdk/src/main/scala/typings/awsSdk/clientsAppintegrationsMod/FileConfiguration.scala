package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConfiguration extends StObject {
  
  /**
    * Restrictions for what files should be pulled from the source.
    */
  var Filters: js.UndefOr[FieldsMap] = js.undefined
  
  /**
    * Identifiers for the source folders to pull all files from recursively.
    */
  var Folders: FolderList
}
object FileConfiguration {
  
  inline def apply(Folders: FolderList): FileConfiguration = {
    val __obj = js.Dynamic.literal(Folders = Folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FieldsMap): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFolders(value: FolderList): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersVarargs(value: NonBlankLongString*): Self = StObject.set(x, "Folders", js.Array(value*))
  }
}
