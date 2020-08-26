package typings.activexScripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Scripting extends js.Object {
    /** Drive Object */
    @js.native
    class Drive protected ()
      extends typings.activexScripting.Scripting.Drive
    
    /** File object */
    @js.native
    class File protected ()
      extends typings.activexScripting.Scripting.File
    
    /** FileSystem Object */
    @js.native
    class FileSystemObject protected ()
      extends typings.activexScripting.Scripting.FileSystemObject
    
    /** Folder object */
    @js.native
    class Folder protected ()
      extends typings.activexScripting.Scripting.Folder
    
    /** TextStream object */
    @js.native
    class TextStream protected ()
      extends typings.activexScripting.Scripting.TextStream
    
  }
  
}

