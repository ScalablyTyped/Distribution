package typings
package apolloDashUtilitiesLib.libStoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/storeUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def argumentsObjectFromField(field: graphqlLib.languageAstMod.DirectiveNode, variables: js.Object): js.Object = js.native
  def argumentsObjectFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): js.Object = js.native
  def getStoreKeyName(fieldName: java.lang.String): java.lang.String = js.native
  def getStoreKeyName(fieldName: java.lang.String, args: js.Object): java.lang.String = js.native
  def getStoreKeyName(
    fieldName: java.lang.String,
    args: js.Object,
    directives: apolloDashUtilitiesLib.libStoreUtilsMod.Directives
  ): java.lang.String = js.native
  def isField(selection: graphqlLib.languageAstMod.SelectionNode): /* is graphql.graphql/language/ast.FieldNode */ scala.Boolean = js.native
  def isIdValue(idObject: apolloDashUtilitiesLib.libStoreUtilsMod.StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.IdValue */ scala.Boolean = js.native
  def isInlineFragment(selection: graphqlLib.languageAstMod.SelectionNode): /* is graphql.graphql/language/ast.InlineFragmentNode */ scala.Boolean = js.native
  def isJsonValue(jsonObject: apolloDashUtilitiesLib.libStoreUtilsMod.StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.JsonValue */ scala.Boolean = js.native
  def isNumberValue(value: graphqlLib.languageAstMod.ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.NumberValue */ scala.Boolean = js.native
  def isScalarValue(value: graphqlLib.languageAstMod.ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.ScalarValue */ scala.Boolean = js.native
  def resultKeyNameFromField(field: graphqlLib.languageAstMod.FieldNode): java.lang.String = js.native
  def storeKeyNameFromField(field: graphqlLib.languageAstMod.FieldNode): java.lang.String = js.native
  def storeKeyNameFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): java.lang.String = js.native
  def toIdValue(idConfig: apolloDashUtilitiesLib.libStoreUtilsMod.IdConfig): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def toIdValue(idConfig: apolloDashUtilitiesLib.libStoreUtilsMod.IdConfig, generated: scala.Boolean): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def toIdValue(idConfig: java.lang.String): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def toIdValue(idConfig: java.lang.String, generated: scala.Boolean): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def valueFromNode(node: graphqlLib.languageAstMod.ValueNode): js.Any = js.native
  def valueFromNode(
    node: graphqlLib.languageAstMod.ValueNode,
    onVariable: apolloDashUtilitiesLib.libStoreUtilsMod.VariableValue
  ): js.Any = js.native
  def valueToObjectRepresentation(
    argObj: js.Any,
    name: graphqlLib.languageAstMod.NameNode,
    value: graphqlLib.languageAstMod.ValueNode
  ): scala.Unit = js.native
  def valueToObjectRepresentation(
    argObj: js.Any,
    name: graphqlLib.languageAstMod.NameNode,
    value: graphqlLib.languageAstMod.ValueNode,
    variables: js.Object
  ): scala.Unit = js.native
}

