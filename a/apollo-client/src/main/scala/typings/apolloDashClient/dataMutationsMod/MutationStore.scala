package typings.apolloDashClient.dataMutationsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DocumentNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/mutations", "MutationStore")
@js.native
class MutationStore () extends js.Object {
  var store: js.Any = js.native
  def get(mutationId: String): MutationStoreValue = js.native
  def getStore(): StringDictionary[MutationStoreValue] = js.native
  def initMutation(mutationId: String, mutation: DocumentNode): Unit = js.native
  def initMutation(mutationId: String, mutation: DocumentNode, variables: js.Object): Unit = js.native
  def markMutationError(mutationId: String, error: Error): Unit = js.native
  def markMutationResult(mutationId: String): Unit = js.native
  def reset(): Unit = js.native
}

