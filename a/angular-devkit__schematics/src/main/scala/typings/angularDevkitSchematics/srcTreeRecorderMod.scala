package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcTreeInterfaceMod.FileEntry
import typings.angularDevkitSchematics.srcTreeInterfaceMod.UpdateRecorder
import typings.angularDevkitSchematics.srcUtilityUpdateBufferMod.UpdateBufferBase
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeRecorderMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/recorder", "UpdateRecorderBase")
  @js.native
  open class UpdateRecorderBase protected ()
    extends StObject
       with UpdateRecorder {
    def this(entry: FileEntry) = this()
    
    /* protected */ var _content: UpdateBufferBase = js.native
    
    /* protected */ var _original: Buffer = js.native
    
    /* protected */ var _path: String = js.native
    
    @JSName("apply")
    def apply(content: Buffer): Buffer = js.native
    
    def path: String = js.native
  }
  /* static members */
  object UpdateRecorderBase {
    
    @JSImport("@angular-devkit/schematics/src/tree/recorder", "UpdateRecorderBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromFileEntry(entry: FileEntry): UpdateRecorderBase = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFileEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[UpdateRecorderBase]
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/recorder", "UpdateRecorderBom")
  @js.native
  open class UpdateRecorderBom protected () extends UpdateRecorderBase {
    def this(entry: FileEntry) = this()
    def this(entry: FileEntry, _delta: Double) = this()
    
    /* private */ var _delta: Any = js.native
  }
}
