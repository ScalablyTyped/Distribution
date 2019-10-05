package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSUndefinedKeyword
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSUndefinedKeyword
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSUndefinedKeyword")
@js.native
object TSUndefinedKeyword extends TopLevel[Type[TSUndefinedKeyword]]

