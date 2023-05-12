package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscShimsApiMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopLevelShimGenerator] (val x: Self) extends AnyVal {
      
      inline def setMakeTopLevelShim(value: () => SourceFile): Self = StObject.set(x, "makeTopLevelShim", js.Any.fromFunction0(value))
      
      inline def setShouldEmit(value: Boolean): Self = StObject.set(x, "shouldEmit", value.asInstanceOf[js.Any])
    }
  }
}
