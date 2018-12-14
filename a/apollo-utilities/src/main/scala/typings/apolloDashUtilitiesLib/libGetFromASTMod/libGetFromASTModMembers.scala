package typings
package apolloDashUtilitiesLib.libGetFromASTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/getFromAST", JSImport.Namespace)
@js.native
object libGetFromASTModMembers extends js.Object {
  def checkDocument(doc: graphqlLib.languageAstMod.DocumentNode): scala.Unit = js.native
  def createFragmentMap(): FragmentMap = js.native
  def createFragmentMap(fragments: js.Array[graphqlLib.languageAstMod.FragmentDefinitionNode]): FragmentMap = js.native
  def getDefaultValues(): org.scalablytyped.runtime.StringDictionary[apolloDashUtilitiesLib.libStoreUtilsMod.JsonValue] = js.native
  def getDefaultValues(definition: graphqlLib.languageAstMod.OperationDefinitionNode): org.scalablytyped.runtime.StringDictionary[apolloDashUtilitiesLib.libStoreUtilsMod.JsonValue] = js.native
  def getFragmentDefinition(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.FragmentDefinitionNode = js.native
  def getFragmentDefinitions(doc: graphqlLib.languageAstMod.DocumentNode): js.Array[graphqlLib.languageAstMod.FragmentDefinitionNode] = js.native
  def getMainDefinition(queryDoc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.FragmentDefinitionNode = js.native
  def getMutationDefinition(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  def getOperationDefinition(doc: graphqlLib.languageAstMod.DocumentNode): js.UndefOr[graphqlLib.languageAstMod.OperationDefinitionNode] = js.native
  def getOperationDefinitionOrDie(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  def getOperationName(doc: graphqlLib.languageAstMod.DocumentNode): java.lang.String | scala.Null = js.native
  def getQueryDefinition(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  def variablesInOperation(operation: graphqlLib.languageAstMod.OperationDefinitionNode): stdLib.Set[java.lang.String] = js.native
}

