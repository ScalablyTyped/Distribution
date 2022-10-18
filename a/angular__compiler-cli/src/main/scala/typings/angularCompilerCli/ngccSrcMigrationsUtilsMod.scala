package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ExportAs
import typings.angularCompilerCli.ngccSrcMigrationsMigrationMod.MigrationHost
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcMigrationsUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/migrations/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createComponentDecorator(clazz: ClassDeclaration[DeclarationNode], metadata: ExportAs): Decorator = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponentDecorator")(clazz.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Decorator]
  
  inline def createDirectiveDecorator(clazz: ClassDeclaration[DeclarationNode]): Decorator = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectiveDecorator")(clazz.asInstanceOf[js.Any]).asInstanceOf[Decorator]
  inline def createDirectiveDecorator(clazz: ClassDeclaration[DeclarationNode], metadata: ExportAs): Decorator = (^.asInstanceOf[js.Dynamic].applyDynamic("createDirectiveDecorator")(clazz.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Decorator]
  
  inline def createInjectableDecorator(clazz: ClassDeclaration[DeclarationNode]): Decorator = ^.asInstanceOf[js.Dynamic].applyDynamic("createInjectableDecorator")(clazz.asInstanceOf[js.Any]).asInstanceOf[Decorator]
  
  inline def hasConstructor(host: MigrationHost, clazz: ClassDeclaration[DeclarationNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasConstructor")(host.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasDirectiveDecorator(host: MigrationHost, clazz: ClassDeclaration[DeclarationNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDirectiveDecorator")(host.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasPipeDecorator(host: MigrationHost, clazz: ClassDeclaration[DeclarationNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPipeDecorator")(host.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isClassDeclaration(clazz: Node): /* is @angular/compiler-cli.anon.ClassDeclarationDeclarati */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(clazz.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationDeclarati */ Boolean]
}
