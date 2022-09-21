package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.SHA256
import typings.fsExtra.mod.Stats
import typings.node.bufferMod.global.Buffer
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asarMod {
  
  @JSImport("app-builder-lib/out/asar/asar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/asar/asar", "AsarFilesystem")
  @js.native
  open class AsarFilesystem protected () extends StObject {
    def this(src: String) = this()
    def this(src: String, header: Node) = this()
    def this(src: String, header: Unit, headerSize: Double) = this()
    def this(src: String, header: Node, headerSize: Double) = this()
    
    def addFileNode(file: String, dirNode: Node, size: Double, unpacked: Boolean, stat: Stats): Node = js.native
    def addFileNode(
      file: String,
      dirNode: Node,
      size: Double,
      unpacked: Boolean,
      stat: Stats,
      integrity: NodeIntegrity
    ): Node = js.native
    
    def getFile(p: String): Node = js.native
    def getFile(p: String, followLinks: Boolean): Node = js.native
    
    def getNode(p: String): Node | Null = js.native
    
    def getOrCreateNode(p: String): Node = js.native
    
    val header: Node = js.native
    
    val headerSize: Double = js.native
    
    /* private */ var offset: Any = js.native
    
    def readFile(file: String): js.Promise[Buffer] = js.native
    
    def readJson(file: String): js.Promise[Any] = js.native
    
    def searchNodeFromDirectory(p: String, isCreate: Boolean): Node | Null = js.native
    
    val src: String = js.native
  }
  
  inline def readAsar(archive: String): js.Promise[AsarFilesystem] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsar")(archive.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AsarFilesystem]]
  
  inline def readAsarHeader(archive: String): js.Promise[ReadAsarHeader_] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsarHeader")(archive.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadAsarHeader_]]
  
  inline def readAsarJson(archive: String, file: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsarJson")(archive.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait NodeIntegrity extends StObject {
    
    var algorithm: SHA256
    
    var blockSize: Double
    
    var blocks: js.Array[String]
    
    var hash: String
  }
  object NodeIntegrity {
    
    inline def apply(blockSize: Double, blocks: js.Array[String], hash: String): NodeIntegrity = {
      val __obj = js.Dynamic.literal(algorithm = "SHA256", blockSize = blockSize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeIntegrity]
    }
    
    extension [Self <: NodeIntegrity](x: Self) {
      
      inline def setAlgorithm(value: SHA256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: js.Array[String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: String*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadAsarHeader_ extends StObject {
    
    val header: String
    
    val size: Double
  }
  object ReadAsarHeader_ {
    
    inline def apply(header: String, size: Double): ReadAsarHeader_ = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadAsarHeader_]
    }
    
    extension [Self <: ReadAsarHeader_](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
