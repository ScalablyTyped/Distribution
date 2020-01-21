package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSConditionalType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var checkType: TSTypeKind
  var extendsType: TSTypeKind
  var falseType: TSTypeKind
  var trueType: TSTypeKind
  var `type`: typings.astTypes.astTypesStrings.TSConditionalType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSConditionalType")
@js.native
object TSConditionalType extends TopLevel[Type[TSConditionalType]]

