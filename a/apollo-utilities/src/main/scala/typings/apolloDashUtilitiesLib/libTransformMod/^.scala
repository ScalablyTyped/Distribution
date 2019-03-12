package typings
package apolloDashUtilitiesLib.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addTypenameToDocument(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def buildQueryFromSelectionSet(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def getDirectivesFromDocument(directives: js.Array[GetDirectiveConfig], doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def removeArgumentsFromDocument(config: js.Array[RemoveArgumentsConfig], doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def removeClientSetsFromDocument(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def removeConnectionDirectiveFromDocument(doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def removeDirectivesFromDocument(directives: js.Array[RemoveDirectiveConfig], doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def removeFragmentSpreadFromDocument(config: js.Array[RemoveFragmentSpreadConfig], doc: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
}

