package typings.apolloDashUtilities.libStoreUtilsMod

import typings.graphql.languageAstMod.DirectiveNode
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.NameNode
import typings.graphql.languageAstMod.SelectionNode
import typings.graphql.languageAstMod.ValueNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/storeUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def argumentsObjectFromField(field: DirectiveNode, variables: js.Object): js.Object = js.native
  def argumentsObjectFromField(field: FieldNode, variables: js.Object): js.Object = js.native
  def getStoreKeyName(fieldName: String): String = js.native
  def getStoreKeyName(fieldName: String, args: js.Object): String = js.native
  def getStoreKeyName(fieldName: String, args: js.Object, directives: Directives): String = js.native
  def isField(selection: SelectionNode): /* is graphql.graphql/language/ast.FieldNode */ Boolean = js.native
  def isIdValue(idObject: StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.IdValue */ Boolean = js.native
  def isInlineFragment(selection: SelectionNode): /* is graphql.graphql/language/ast.InlineFragmentNode */ Boolean = js.native
  def isJsonValue(jsonObject: StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.JsonValue */ Boolean = js.native
  def isNumberValue(value: ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.NumberValue */ Boolean = js.native
  def isScalarValue(value: ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.ScalarValue */ Boolean = js.native
  def resultKeyNameFromField(field: FieldNode): String = js.native
  def storeKeyNameFromField(field: FieldNode): String = js.native
  def storeKeyNameFromField(field: FieldNode, variables: js.Object): String = js.native
  def toIdValue(idConfig: String): IdValue = js.native
  def toIdValue(idConfig: String, generated: Boolean): IdValue = js.native
  def toIdValue(idConfig: IdConfig): IdValue = js.native
  def toIdValue(idConfig: IdConfig, generated: Boolean): IdValue = js.native
  def valueFromNode(node: ValueNode): js.Any = js.native
  def valueFromNode(node: ValueNode, onVariable: VariableValue): js.Any = js.native
  def valueToObjectRepresentation(argObj: js.Any, name: NameNode, value: ValueNode): Unit = js.native
  def valueToObjectRepresentation(argObj: js.Any, name: NameNode, value: ValueNode, variables: js.Object): Unit = js.native
}

