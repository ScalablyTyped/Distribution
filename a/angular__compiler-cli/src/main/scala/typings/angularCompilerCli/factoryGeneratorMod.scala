package typings.angularCompilerCli

import typings.angularCompilerCli.shimsApiMod.FactoryInfo
import typings.angularCompilerCli.shimsApiMod.FactoryTracker
import typings.angularCompilerCli.shimsApiMod.ModuleInfo
import typings.angularCompilerCli.shimsApiMod.PerFileShimGenerator
import typings.angularCompilerCli.srcCoreMod.ImportRewriter
import typings.std.Map
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryGeneratorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/factory_generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/factory_generator", "FactoryGenerator")
  @js.native
  open class FactoryGenerator ()
    extends StObject
       with PerFileShimGenerator
       with FactoryTracker {
    
    /* CompleteClass */
    override val sourceInfo: Map[String, FactoryInfo] = js.native
    
    /* private */ var sourceToFactorySymbols: Any = js.native
    
    /* CompleteClass */
    override def track(sf: SourceFile, moduleInfo: ModuleInfo): Unit = js.native
  }
  
  inline def generatedFactoryTransform(factoryMap: Map[String, FactoryInfo], importRewriter: ImportRewriter): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatedFactoryTransform")(factoryMap.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
