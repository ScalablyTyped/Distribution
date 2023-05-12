package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.magicString.mod.default
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilityUpdateBufferMod {
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "IndexOutOfBoundException")
  @js.native
  open class IndexOutOfBoundException protected () extends BaseException {
    def this(index: Double, min: Double) = this()
    def this(index: Double, min: Double, max: Double) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "UpdateBuffer")
  @js.native
  open class UpdateBuffer protected () extends UpdateBufferBase {
    def this(_originalContent: Buffer) = this()
    
    /* protected */ def _assertIndex(index: Double): Unit = js.native
    
    /* protected */ var _mutatableContent: default = js.native
  }
  
  /* note: abstract class */ @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "UpdateBufferBase")
  @js.native
  open class UpdateBufferBase protected () extends StObject {
    def this(_originalContent: Buffer) = this()
    
    /* protected */ var _originalContent: Buffer = js.native
    
    def generate(): Buffer = js.native
    
    def insertLeft(index: Double, content: Buffer): Unit = js.native
    def insertLeft(index: Double, content: Buffer, assert: Boolean): Unit = js.native
    
    def insertRight(index: Double, content: Buffer): Unit = js.native
    def insertRight(index: Double, content: Buffer, assert: Boolean): Unit = js.native
    
    def length: Double = js.native
    
    def original: Buffer = js.native
    
    def remove(index: Double, length: Double): Unit = js.native
    
    def toString(encoding: String): String = js.native
  }
  /* static members */
  object UpdateBufferBase {
    
    @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "UpdateBufferBase")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an UpdateBufferBase instance.
      *
      * @param contentPath The path of the update buffer instance.
      * @param originalContent The original content of the update buffer instance.
      * @returns An UpdateBufferBase instance.
      */
    inline def create(contentPath: String, originalContent: Buffer): UpdateBufferBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(contentPath.asInstanceOf[js.Any], originalContent.asInstanceOf[js.Any])).asInstanceOf[UpdateBufferBase]
  }
}
