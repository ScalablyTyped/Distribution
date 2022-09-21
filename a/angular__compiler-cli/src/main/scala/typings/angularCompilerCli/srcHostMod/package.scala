package typings.angularCompilerCli.srcHostMod

import typings.angularCompilerCli.angularCompilerCliNumbers.`0`
import typings.angularCompilerCli.anon.Name
import typings.angularCompilerCli.srcHostMod.^
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def isConcreteDeclaration(decl: Declaration[typings.typescript.mod.Declaration]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ConcreteDeclaration<typescript.typescript.Declaration> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConcreteDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ConcreteDeclaration<typescript.typescript.Declaration> */ Boolean]

inline def isDecoratorIdentifier(exp: Expression): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecoratorIdentifier")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean]

type ClassDeclaration[T /* <: DeclarationNode */] = T & Name

type DeclarationNode = typings.typescript.mod.Declaration | Expression

type DecoratorIdentifier = Identifier | NamespacedIdentifier

type SpecialDeclarationIdentity = DownleveledEnum

type SpecialDeclarationKind = `0`
