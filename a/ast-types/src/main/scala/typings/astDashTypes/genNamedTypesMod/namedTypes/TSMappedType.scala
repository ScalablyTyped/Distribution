package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.Plussign
import typings.astDashTypes.astDashTypesStrings.`-_`
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genKindsMod.TSTypeParameterKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSMappedType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var optional: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  var readonly: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.TSMappedType
  var typeAnnotation: js.UndefOr[TSTypeKind | Null] = js.undefined
  var typeParameter: TSTypeParameterKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSMappedType")
@js.native
object TSMappedType extends TopLevel[Type[TSMappedType]]

