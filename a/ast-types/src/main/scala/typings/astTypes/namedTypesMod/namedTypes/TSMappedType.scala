package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
@js.native
trait TSMappedType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var optional: js.UndefOr[Boolean | Plussign | `-_`] = js.native
  
  var readonly: js.UndefOr[Boolean | Plussign | `-_`] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.TSMappedType = js.native
  
  var typeAnnotation: js.UndefOr[TSTypeKind | Null] = js.native
  
  var typeParameter: TSTypeParameterKind = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.TSMappedType")
@js.native
object TSMappedType extends TopLevel[Type[TSMappedType]]
