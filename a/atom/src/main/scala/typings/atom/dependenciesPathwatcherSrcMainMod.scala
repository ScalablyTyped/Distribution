package typings.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesPathwatcherSrcMainMod {
  
  @JSImport("atom/dependencies/pathwatcher/src/main", "Directory")
  @js.native
  open class Directory protected ()
    extends typings.atom.dependenciesPathwatcherSrcDirectoryMod.Directory {
    // Construction
    /** Configures a new Directory instance, no files are accessed. */
    def this(directoryPath: String) = this()
    def this(directoryPath: String, symlink: Boolean) = this()
  }
  
  @JSImport("atom/dependencies/pathwatcher/src/main", "File")
  @js.native
  open class File protected ()
    extends typings.atom.dependenciesPathwatcherSrcFileMod.File {
    // Construction
    /** Configures a new File instance, no files are accessed. */
    def this(filePath: String) = this()
    def this(filePath: String, symlink: Boolean) = this()
  }
}
