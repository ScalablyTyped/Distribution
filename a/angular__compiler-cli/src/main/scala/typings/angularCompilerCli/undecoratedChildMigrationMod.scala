package typings.angularCompilerCli

import typings.angularCompilerCli.migrationMod.Migration
import typings.angularCompilerCli.migrationMod.MigrationHost
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undecoratedChildMigrationMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/undecorated_child_migration", "UndecoratedChildMigration")
  @js.native
  open class UndecoratedChildMigration ()
    extends StObject
       with Migration {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(clazz: ClassDeclaration[DeclarationNode], host: MigrationHost): Diagnostic | Null = js.native
    
    def maybeMigrate(ref: Reference[ClassDeclaration[DeclarationNode]], host: MigrationHost): Unit = js.native
  }
}
