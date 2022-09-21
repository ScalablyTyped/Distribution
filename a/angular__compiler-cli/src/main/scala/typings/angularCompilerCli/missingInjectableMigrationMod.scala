package typings.angularCompilerCli

import typings.angularCompilerCli.migrationMod.Migration
import typings.angularCompilerCli.migrationMod.MigrationHost
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.Decorator
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingInjectableMigrationMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/missing_injectable_migration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/missing_injectable_migration", "MissingInjectableMigration")
  @js.native
  open class MissingInjectableMigration ()
    extends StObject
       with Migration {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(clazz: ClassDeclaration[DeclarationNode], host: MigrationHost): Diagnostic | Null = js.native
  }
  
  inline def getAngularCoreDecoratorName(decorator: Decorator): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngularCoreDecoratorName")(decorator.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
