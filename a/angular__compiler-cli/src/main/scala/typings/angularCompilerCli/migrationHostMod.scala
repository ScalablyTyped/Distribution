package typings.angularCompilerCli

import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.migrationMod.MigrationHost
import typings.angularCompilerCli.ngccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngccTraitCompilerMod.NgccTraitCompiler
import typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationHostMod {
  
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
