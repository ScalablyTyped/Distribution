package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSIndexSignatureKind
import typings.astDashTypes.genKindsMod.TSMethodSignatureKind
import typings.astDashTypes.genKindsMod.TSPropertySignatureKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeLiteral
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var members: js.Array[
    TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeLiteral
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeLiteral")
@js.native
object TSTypeLiteral extends TopLevel[Type[TSTypeLiteral]]

