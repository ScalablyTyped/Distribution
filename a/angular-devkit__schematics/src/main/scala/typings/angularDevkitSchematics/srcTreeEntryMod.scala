package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FileEntry
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeEntryMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/entry", "LazyFileEntry")
  @js.native
  open class LazyFileEntry protected ()
    extends StObject
       with FileEntry {
    def this(_path: Path_, _load: js.Function1[/* path */ js.UndefOr[Path_], Buffer]) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _load: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* CompleteClass */
    override val content: Buffer = js.native
    @JSName("content")
    def content_MLazyFileEntry: Buffer = js.native
    
    /* CompleteClass */
    override val path: Path_ = js.native
    @JSName("path")
    def path_MLazyFileEntry: Path_ = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/entry", "SimpleFileEntry")
  @js.native
  open class SimpleFileEntry protected ()
    extends StObject
       with FileEntry {
    def this(_path: Path_, _content: Buffer) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* CompleteClass */
    override val content: Buffer = js.native
    @JSName("content")
    def content_MSimpleFileEntry: Buffer = js.native
    
    /* CompleteClass */
    override val path: Path_ = js.native
    @JSName("path")
    def path_MSimpleFileEntry: Path_ = js.native
  }
}
