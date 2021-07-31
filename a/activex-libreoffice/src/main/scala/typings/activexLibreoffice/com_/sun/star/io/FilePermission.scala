package typings.activexLibreoffice.com_.sun.star.io

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This permission represents access to a file or directory. A {@link FilePermission} consists of a file url and a set of actions valid for that url.
  *
  * The path of the file url that ends in `"/ *"` indicates all the files and directories contained in that directory. A path that ends with `"/-"`
  * indicates (recursively) all files and subdirectories contained in that directory. A file url string consisting of the special token `"<<ALL FILES>>"`
  * matches any file. ;  Note: A file url string consisting of a single `"*"` indicates all the files in the current directory, while a string consisting
  * of a single `"-"` indicates all the files in the current directory and (recursively) all files and subdirectories contained in the current directory.
  * ;  The actions to be granted is a list of one or more comma-separated keywords. The possible keywords are `"read"` , `"write"` , `"execute"` , and
  * `"delete"` . Their meaning is defined as follows: `read` -  read permission`write` -  write permission`execute` -  execute permission`delete` -
  * delete permission;  The actions string is processed case-insensitive.
  * @since OOo 1.1.2
  */
trait FilePermission extends StObject {
  
  /** comma separated actions list */
  var Actions: String
  
  /** target file url */
  var URL: String
}
object FilePermission {
  
  @scala.inline
  def apply(Actions: String, URL: String): FilePermission = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePermission]
  }
  
  @scala.inline
  implicit class FilePermissionMutableBuilder[Self <: FilePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: String): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
