package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitSchematics.srcUtilityLinkedListMod.LinkedList
import typings.magicString.mod.default
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilityUpdateBufferMod {
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "Chunk")
  @js.native
  open class Chunk protected () extends StObject {
    def this(start: Double, end: Double, originalContent: Buffer) = this()
    
    /* private */ var _assertLeft: Any = js.native
    
    /* private */ var _assertRight: Any = js.native
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _left: Any = js.native
    
    /* private */ var _right: Any = js.native
    
    def append(buffer: Buffer, essential: Boolean): Unit = js.native
    
    def assert(left: Boolean, _content: Boolean, right: Boolean): Unit = js.native
    
    def copy(target: Buffer, start: Double): Double = js.native
    
    var end: Double = js.native
    
    def length: Double = js.native
    
    var next: Chunk | Null = js.native
    
    var originalContent: Buffer = js.native
    
    def prepend(buffer: Buffer, essential: Boolean): Unit = js.native
    
    def remove(left: Boolean, content: Boolean, right: Boolean): Unit = js.native
    
    def slice(start: Double): Chunk = js.native
    
    var start: Double = js.native
    
    def toString(encoding: BufferEncoding): String = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "ContentCannotBeRemovedException")
  @js.native
  open class ContentCannotBeRemovedException () extends BaseException
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "IndexOutOfBoundException")
  @js.native
  open class IndexOutOfBoundException protected () extends BaseException {
    def this(index: Double, min: Double) = this()
    def this(index: Double, min: Double, max: Double) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "UpdateBuffer")
  @js.native
  open class UpdateBuffer protected () extends UpdateBufferBase {
    def this(originalContent: Buffer) = this()
    
    /* protected */ def _assertIndex(index: Double): Unit = js.native
    
    /**
      * Gets the position in the content based on the position in the string.
      * Some characters might be wider than one byte, thus we have to determine the position using
      * string functions.
      */
    /* protected */ def _getTextPosition(index: Double): Double = js.native
    
    /* protected */ var _linkedList: LinkedList[Chunk] = js.native
    
    /* protected */ def _slice(start: Double): js.Tuple2[Chunk, Chunk] = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/utility/update-buffer", "UpdateBuffer2")
  @js.native
  open class UpdateBuffer2 protected () extends UpdateBufferBase {
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
      * Creates an UpdateBufferBase instance. Depending on the NG_UPDATE_BUFFER_V2
      * environment variable, will either create an UpdateBuffer or an UpdateBuffer2
      * instance.
      *
      * See: https://github.com/angular/angular-cli/issues/21110
      *
      * @param originalContent The original content of the update buffer instance.
      * @returns An UpdateBufferBase instance.
      */
    inline def create(originalContent: Buffer): UpdateBufferBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(originalContent.asInstanceOf[js.Any]).asInstanceOf[UpdateBufferBase]
  }
}
