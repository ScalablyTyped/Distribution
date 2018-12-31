package typings
package apolloDashUtilitiesLib.apolloDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities", JSImport.Namespace)
@js.native
object apolloDashUtilitiesModMembers extends js.Object {
  def addTypenameToDocument(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def argumentsObjectFromField(field: graphqlLib.languageAstMod.DirectiveNode, variables: js.Object): js.Object = js.native
  def argumentsObjectFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): js.Object = js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def assign[A, B](a: A, b: B): A with B = js.native
  def assign[A, B, C](a: A, b: B, c: C): A with B with C = js.native
  def assign[A, B, C, D](a: A, b: B, c: C, d: D): A with B with C with D = js.native
  def assign[A, B, C, D, E](a: A, b: B, c: C, d: D, e: E): A with B with C with D with E = js.native
  def checkDocument(doc: graphqlLib.languageAstMod.DocumentNode): scala.Unit = js.native
  def cloneDeep[T](value: T): T = js.native
  def createFragmentMap(): apolloDashUtilitiesLib.libGetFromASTMod.FragmentMap = js.native
  def createFragmentMap(fragments: js.Array[graphqlLib.languageAstMod.FragmentDefinitionNode]): apolloDashUtilitiesLib.libGetFromASTMod.FragmentMap = js.native
  def flattenSelections(selection: graphqlLib.languageAstMod.SelectionNode): js.Array[graphqlLib.languageAstMod.SelectionNode] = js.native
  def getDefaultValues(): org.scalablytyped.runtime.StringDictionary[apolloDashUtilitiesLib.libStoreUtilsMod.JsonValue] = js.native
  def getDefaultValues(definition: graphqlLib.languageAstMod.OperationDefinitionNode): org.scalablytyped.runtime.StringDictionary[apolloDashUtilitiesLib.libStoreUtilsMod.JsonValue] = js.native
  def getDirectiveInfoFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): apolloDashUtilitiesLib.libDirectivesMod.DirectiveInfo = js.native
  def getDirectiveNames(doc: graphqlLib.languageAstMod.DocumentNode): js.Array[java.lang.String] = js.native
  def getDirectivesFromDocument(
    directives: js.Array[apolloDashUtilitiesLib.libTransformMod.GetDirectiveConfig],
    doc: graphqlLib.languageAstMod.DocumentNode
  ): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def getDirectivesFromDocument(
    directives: js.Array[apolloDashUtilitiesLib.libTransformMod.GetDirectiveConfig],
    doc: graphqlLib.languageAstMod.DocumentNode,
    includeAllFragments: scala.Boolean
  ): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def getEnv(): js.UndefOr[java.lang.String] = js.native
  def getFragmentDefinition(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.FragmentDefinitionNode = js.native
  def getFragmentDefinitions(doc: graphqlLib.languageAstMod.DocumentNode): js.Array[graphqlLib.languageAstMod.FragmentDefinitionNode] = js.native
  def getFragmentQueryDocument(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def getFragmentQueryDocument(document: graphqlLib.languageAstMod.DocumentNode, fragmentName: java.lang.String): graphqlLib.languageAstMod.DocumentNode = js.native
  def getMainDefinition(queryDoc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.FragmentDefinitionNode = js.native
  def getMutationDefinition(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  def getOperationDefinition(doc: graphqlLib.languageAstMod.DocumentNode): js.UndefOr[graphqlLib.languageAstMod.OperationDefinitionNode] = js.native
  def getOperationDefinitionOrDie(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  def getOperationName(doc: graphqlLib.languageAstMod.DocumentNode): java.lang.String | scala.Null = js.native
  def getQueryDefinition(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  def getStoreKeyName(fieldName: java.lang.String): java.lang.String = js.native
  def getStoreKeyName(fieldName: java.lang.String, args: js.Object): java.lang.String = js.native
  def getStoreKeyName(
    fieldName: java.lang.String,
    args: js.Object,
    directives: apolloDashUtilitiesLib.libStoreUtilsMod.Directives
  ): java.lang.String = js.native
  def graphQLResultHasError(
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ): scala.Double = js.native
  def hasDirectives(names: js.Array[java.lang.String], doc: graphqlLib.languageAstMod.DocumentNode): scala.Boolean = js.native
  def isDevelopment(): scala.Boolean = js.native
  def isEnv(env: java.lang.String): scala.Boolean = js.native
  def isEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  def isField(selection: graphqlLib.languageAstMod.SelectionNode): /* is graphql.graphql/language/ast.FieldNode */ scala.Boolean = js.native
  def isIdValue(idObject: apolloDashUtilitiesLib.libStoreUtilsMod.StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.IdValue */ scala.Boolean = js.native
  def isInlineFragment(selection: graphqlLib.languageAstMod.SelectionNode): /* is graphql.graphql/language/ast.InlineFragmentNode */ scala.Boolean = js.native
  def isJsonValue(jsonObject: apolloDashUtilitiesLib.libStoreUtilsMod.StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.JsonValue */ scala.Boolean = js.native
  def isNumberValue(value: graphqlLib.languageAstMod.ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.NumberValue */ scala.Boolean = js.native
  def isProduction(): scala.Boolean = js.native
  def isScalarValue(value: graphqlLib.languageAstMod.ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.ScalarValue */ scala.Boolean = js.native
  def isTest(): scala.Boolean = js.native
  def maybeDeepFreeze(obj: js.Any): js.Any = js.native
  def removeArgumentsFromDocument(
    config: js.Array[apolloDashUtilitiesLib.libTransformMod.RemoveArgumentsConfig],
    query: graphqlLib.languageAstMod.DocumentNode
  ): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def removeConnectionDirectiveFromDocument(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def removeDirectivesFromDocument(
    directives: js.Array[apolloDashUtilitiesLib.libTransformMod.RemoveDirectiveConfig],
    doc: graphqlLib.languageAstMod.DocumentNode
  ): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def removeFragmentSpreadFromDocument(
    config: js.Array[apolloDashUtilitiesLib.libTransformMod.RemoveFragmentSpreadConfig],
    query: graphqlLib.languageAstMod.DocumentNode
  ): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def resultKeyNameFromField(field: graphqlLib.languageAstMod.FieldNode): java.lang.String = js.native
  def shouldInclude(selection: graphqlLib.languageAstMod.SelectionNode): scala.Boolean = js.native
  def shouldInclude(
    selection: graphqlLib.languageAstMod.SelectionNode,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
  def storeKeyNameFromField(field: graphqlLib.languageAstMod.FieldNode): java.lang.String = js.native
  def storeKeyNameFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): java.lang.String = js.native
  def stripSymbols[T](data: T): T = js.native
  def toIdValue(idConfig: apolloDashUtilitiesLib.libStoreUtilsMod.IdConfig): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def toIdValue(idConfig: apolloDashUtilitiesLib.libStoreUtilsMod.IdConfig, generated: scala.Boolean): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def toIdValue(idConfig: java.lang.String): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def toIdValue(idConfig: java.lang.String, generated: scala.Boolean): apolloDashUtilitiesLib.libStoreUtilsMod.IdValue = js.native
  def tryFunctionOrLogError(f: js.Function): js.Any = js.native
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
  def variablesInOperation(operation: graphqlLib.languageAstMod.OperationDefinitionNode): stdLib.Set[java.lang.String] = js.native
  def warnOnceInDevelopment(msg: java.lang.String): scala.Unit = js.native
  def warnOnceInDevelopment(msg: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
}

