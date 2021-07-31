package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of folders. */
trait FolderList extends StObject {
  
  /** The command to process on this list of folders. */
  var Command: FolderListCommand
  
  /** The list of folders (only used in conjunction with FolderListCommand::SET). */
  var List: SafeArray[FolderListEntry]
}
object FolderList {
  
  @scala.inline
  def apply(Command: FolderListCommand, List: SafeArray[FolderListEntry]): FolderList = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderList]
  }
  
  @scala.inline
  implicit class FolderListMutableBuilder[Self <: FolderList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: FolderListCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: SafeArray[FolderListEntry]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
  }
}
