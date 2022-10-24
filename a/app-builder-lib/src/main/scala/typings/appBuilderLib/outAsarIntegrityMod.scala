package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.SHA256
import typings.appBuilderLib.outAsarAsarMod.NodeIntegrity
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAsarIntegrityMod {
  
  @JSImport("app-builder-lib/out/asar/integrity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeData(param0: AsarIntegrityOptions): js.Promise[AsarIntegrity] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AsarIntegrity]]
  
  inline def hashFile(file: String): js.Promise[NodeIntegrity] = ^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NodeIntegrity]]
  inline def hashFile(file: String, blockSize: Double): js.Promise[NodeIntegrity] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NodeIntegrity]]
  
  inline def hashFileContents(contents: String): NodeIntegrity = ^.asInstanceOf[js.Dynamic].applyDynamic("hashFileContents")(contents.asInstanceOf[js.Any]).asInstanceOf[NodeIntegrity]
  inline def hashFileContents(contents: String, blockSize: Double): NodeIntegrity = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFileContents")(contents.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[NodeIntegrity]
  inline def hashFileContents(contents: Buffer): NodeIntegrity = ^.asInstanceOf[js.Dynamic].applyDynamic("hashFileContents")(contents.asInstanceOf[js.Any]).asInstanceOf[NodeIntegrity]
  inline def hashFileContents(contents: Buffer, blockSize: Double): NodeIntegrity = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFileContents")(contents.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[NodeIntegrity]
  
  type AsarIntegrity = StringDictionary[HeaderHash]
  
  trait AsarIntegrityOptions extends StObject {
    
    val resourcesPath: String
    
    val resourcesRelativePath: String
  }
  object AsarIntegrityOptions {
    
    inline def apply(resourcesPath: String, resourcesRelativePath: String): AsarIntegrityOptions = {
      val __obj = js.Dynamic.literal(resourcesPath = resourcesPath.asInstanceOf[js.Any], resourcesRelativePath = resourcesRelativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsarIntegrityOptions]
    }
    
    extension [Self <: AsarIntegrityOptions](x: Self) {
      
      inline def setResourcesPath(value: String): Self = StObject.set(x, "resourcesPath", value.asInstanceOf[js.Any])
      
      inline def setResourcesRelativePath(value: String): Self = StObject.set(x, "resourcesRelativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeaderHash extends StObject {
    
    var algorithm: SHA256
    
    var hash: String
  }
  object HeaderHash {
    
    inline def apply(hash: String): HeaderHash = {
      val __obj = js.Dynamic.literal(algorithm = "SHA256", hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderHash]
    }
    
    extension [Self <: HeaderHash](x: Self) {
      
      inline def setAlgorithm(value: SHA256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
}
