package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
@js.native
trait TSConditionalType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  
  var checkType: TSTypeKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var extendsType: TSTypeKind = js.native
  
  var falseType: TSTypeKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var trueType: TSTypeKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.TSConditionalType = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.TSConditionalType")
@js.native
object TSConditionalType extends TopLevel[Type[TSConditionalType]]
