package typings.atomWatcher

import typings.atomWatcher.mod.EntryAction
import typings.atomWatcher.mod.EntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atomWatcherStrings {
  
  @js.native
  sealed trait created
    extends StObject
       with EntryAction
  inline def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait deleted
    extends StObject
       with EntryAction
  inline def deleted: deleted = "deleted".asInstanceOf[deleted]
  
  @js.native
  sealed trait directory
    extends StObject
       with EntryType
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait file
    extends StObject
       with EntryType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait modified
    extends StObject
       with EntryAction
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait renamed
    extends StObject
       with EntryAction
  inline def renamed: renamed = "renamed".asInstanceOf[renamed]
  
  @js.native
  sealed trait symlink
    extends StObject
       with EntryType
  inline def symlink: symlink = "symlink".asInstanceOf[symlink]
  
  @js.native
  sealed trait unknown
    extends StObject
       with EntryType
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
}
