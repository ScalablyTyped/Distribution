package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.std.Map
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscShimsApiMod {
  
  trait FactoryInfo extends StObject {
    
    var moduleSymbols: Map[String, ModuleInfo]
    
    var sourceFilePath: String
  }
  object FactoryInfo {
    
    inline def apply(moduleSymbols: Map[String, ModuleInfo], sourceFilePath: String): FactoryInfo = {
      val __obj = js.Dynamic.literal(moduleSymbols = moduleSymbols.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactoryInfo]
    }
    
    extension [Self <: FactoryInfo](x: Self) {
      
      inline def setModuleSymbols(value: Map[String, ModuleInfo]): Self = StObject.set(x, "moduleSymbols", value.asInstanceOf[js.Any])
      
      inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait FactoryTracker extends StObject {
    
    val sourceInfo: Map[String, FactoryInfo]
    
    def track(sf: SourceFile, moduleInfo: ModuleInfo): Unit
  }
  object FactoryTracker {
    
    inline def apply(sourceInfo: Map[String, FactoryInfo], track: (SourceFile, ModuleInfo) => Unit): FactoryTracker = {
      val __obj = js.Dynamic.literal(sourceInfo = sourceInfo.asInstanceOf[js.Any], track = js.Any.fromFunction2(track))
      __obj.asInstanceOf[FactoryTracker]
    }
    
    extension [Self <: FactoryTracker](x: Self) {
      
      inline def setSourceInfo(value: Map[String, FactoryInfo]): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: (SourceFile, ModuleInfo) => Unit): Self = StObject.set(x, "track", js.Any.fromFunction2(value))
    }
  }
  
  trait ModuleInfo extends StObject {
    
    var name: String
  }
  object ModuleInfo {
    
    inline def apply(name: String): ModuleInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleInfo]
    }
    
    extension [Self <: ModuleInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PerFileShimGenerator extends StObject {
    
    /**
      * The extension prefix which will be used for the shim.
      *
      * Knowing this allows the `ts.CompilerHost` implementation which is consuming this shim generator
      * to predict the shim filename, which is useful when a previous `ts.Program` already includes a
      * generated version of the shim.
      */
    val extensionPrefix: String = js.native
    
    /**
      * Generate the shim for a given original `ts.SourceFile`, with the given filename.
      */
    def generateShimForFile(sf: SourceFile, genFilePath: AbsoluteFsPath): SourceFile = js.native
    def generateShimForFile(sf: SourceFile, genFilePath: AbsoluteFsPath, priorShimSf: SourceFile): SourceFile = js.native
    
    /**
      * Whether shims produced by this generator should be emitted during TypeScript emit.
      */
    val shouldEmit: Boolean = js.native
  }
  
  trait TopLevelShimGenerator extends StObject {
    
    /**
      * Create a `ts.SourceFile` representing the shim, with the correct filename.
      */
    def makeTopLevelShim(): SourceFile
    
    /**
      * Whether this shim should be emitted during TypeScript emit.
      */
    val shouldEmit: Boolean
  }
  object TopLevelShimGenerator {
    
    inline def apply(makeTopLevelShim: () => SourceFile, shouldEmit: Boolean): TopLevelShimGenerator = {
      val __obj = js.Dynamic.literal(makeTopLevelShim = js.Any.fromFunction0(makeTopLevelShim), shouldEmit = shouldEmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelShimGenerator]
    }
    
    extension [Self <: TopLevelShimGenerator](x: Self) {
      
      inline def setMakeTopLevelShim(value: () => SourceFile): Self = StObject.set(x, "makeTopLevelShim", js.Any.fromFunction0(value))
      
      inline def setShouldEmit(value: Boolean): Self = StObject.set(x, "shouldEmit", value.asInstanceOf[js.Any])
    }
  }
}
