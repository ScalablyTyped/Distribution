package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSMappedType extends ASTNode {
  var optional: Boolean | Plussign | `-_`
  var readonly: Boolean | Plussign | `-_`
  var `type`: typings.astTypes.astTypesStrings.TSMappedType
  var typeAnnotation: TSTypeKind | Null
  var typeParameter: TSTypeParameterKind
}

object TSMappedType {
  @scala.inline
  def apply(
    optional: Boolean | Plussign | `-_`,
    readonly: Boolean | Plussign | `-_`,
    `type`: typings.astTypes.astTypesStrings.TSMappedType,
    typeParameter: TSTypeParameterKind,
    typeAnnotation: TSTypeKind = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMappedType]
  }
}

