package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a single folder in a {@link FolderList} . */
trait FolderListEntry extends StObject {
  
  /**
    * A (unique) identifier for the folder (used by IMAP, where different folders with equal human-readable titles may exist; otherwise, it may be left
    * empty).
    */
  var ID: String
  
  /** The folder is new. */
  var New: Boolean
  
  /** The folder shall be purged (only used in conjunction with the FolderListCommand::SET). */
  var Purge: Boolean
  
  /** The folder has been removed. */
  var Removed: Boolean
  
  /** The folder is subscribed. */
  var Subscribed: Boolean
  
  /** The title of the folder. */
  var Title: String
}
object FolderListEntry {
  
  inline def apply(ID: String, New: Boolean, Purge: Boolean, Removed: Boolean, Subscribed: Boolean, Title: String): FolderListEntry = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], New = New.asInstanceOf[js.Any], Purge = Purge.asInstanceOf[js.Any], Removed = Removed.asInstanceOf[js.Any], Subscribed = Subscribed.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FolderListEntry] (val x: Self) extends AnyVal {
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setNew(value: Boolean): Self = StObject.set(x, "New", value.asInstanceOf[js.Any])
    
    inline def setPurge(value: Boolean): Self = StObject.set(x, "Purge", value.asInstanceOf[js.Any])
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "Removed", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "Subscribed", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
