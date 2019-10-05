package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.InterfaceDeclarationKind
import typings.astDashTypes.genKindsMod.InterfaceExtendsKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait InterfaceDeclaration
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: ObjectTypeAnnotationKind
  var `extends`: js.Array[InterfaceExtendsKind]
  var id: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.InterfaceDeclaration
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.InterfaceDeclaration")
@js.native
object InterfaceDeclaration extends TopLevel[Type[InterfaceDeclaration]]

