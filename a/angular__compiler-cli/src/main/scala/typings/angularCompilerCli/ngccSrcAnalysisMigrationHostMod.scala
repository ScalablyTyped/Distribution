package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcAnalysisNgccTraitCompilerMod.NgccTraitCompiler
import typings.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngccSrcMigrationsMigrationMod.MigrationHost
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisMigrationHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/migration_host", "DefaultMigrationHost")
  @js.native
  open class DefaultMigrationHost protected ()
    extends StObject
       with MigrationHost {
    def this(
      reflectionHost: NgccReflectionHost,
      metadata: MetadataReader,
      evaluator: PartialEvaluator,
      compiler: NgccTraitCompiler,
      entryPointPath: AbsoluteFsPath
    ) = this()
    
    /* private */ var compiler: Any = js.native
    
    /* private */ var entryPointPath: Any = js.native
  }
}
