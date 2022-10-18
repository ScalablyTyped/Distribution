package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcMigrationsMigrationMod.Migration
import typings.angularCompilerCli.ngccSrcMigrationsMigrationMod.MigrationHost
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcMigrationsUndecoratedParentMigrationMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/undecorated_parent_migration", "UndecoratedParentMigration")
  @js.native
  open class UndecoratedParentMigration ()
    extends StObject
       with Migration {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(clazz: ClassDeclaration[DeclarationNode], host: MigrationHost): Diagnostic | Null = js.native
  }
}
