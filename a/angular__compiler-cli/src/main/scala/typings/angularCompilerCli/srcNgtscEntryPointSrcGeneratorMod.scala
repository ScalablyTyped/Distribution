package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscShimsApiMod.TopLevelShimGenerator
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscEntryPointSrcGeneratorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point/src/generator", "FlatIndexGenerator")
  @js.native
  open class FlatIndexGenerator protected ()
    extends StObject
       with TopLevelShimGenerator {
    def this(entryPoint: AbsoluteFsPath, relativeFlatIndexPath: String) = this()
    def this(entryPoint: AbsoluteFsPath, relativeFlatIndexPath: String, moduleName: String) = this()
    
    val entryPoint: AbsoluteFsPath = js.native
    
    val flatIndexPath: String = js.native
    
    /**
      * Create a `ts.SourceFile` representing the shim, with the correct filename.
      */
    /* CompleteClass */
    override def makeTopLevelShim(): SourceFile = js.native
    
    val moduleName: String | Null = js.native
    
    /**
      * Whether this shim should be emitted during TypeScript emit.
      */
    /* CompleteClass */
    override val shouldEmit: Boolean = js.native
  }
}
