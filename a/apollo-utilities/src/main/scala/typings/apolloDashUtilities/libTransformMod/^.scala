package typings.apolloDashUtilities.libTransformMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addTypenameToDocument(doc: DocumentNode): DocumentNode = js.native
  def buildQueryFromSelectionSet(document: DocumentNode): DocumentNode = js.native
  def getDirectivesFromDocument(directives: js.Array[GetDirectiveConfig], doc: DocumentNode): DocumentNode = js.native
  def removeArgumentsFromDocument(config: js.Array[RemoveArgumentsConfig], doc: DocumentNode): DocumentNode = js.native
  def removeClientSetsFromDocument(document: DocumentNode): DocumentNode | Null = js.native
  def removeConnectionDirectiveFromDocument(doc: DocumentNode): DocumentNode = js.native
  def removeDirectivesFromDocument(directives: js.Array[RemoveDirectiveConfig], doc: DocumentNode): DocumentNode | Null = js.native
  def removeFragmentSpreadFromDocument(config: js.Array[RemoveFragmentSpreadConfig], doc: DocumentNode): DocumentNode = js.native
}

