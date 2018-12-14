package typings
package apolloDashClientLib.dataMutationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/mutations", "MutationStore")
@js.native
class MutationStore () extends js.Object {
  var store: js.Any = js.native
  def get(mutationId: java.lang.String): MutationStoreValue = js.native
  def getStore(): org.scalablytyped.runtime.StringDictionary[MutationStoreValue] = js.native
  def initMutation(mutationId: java.lang.String, mutationString: java.lang.String): scala.Unit = js.native
  def initMutation(mutationId: java.lang.String, mutationString: java.lang.String, variables: js.Object): scala.Unit = js.native
  def markMutationError(mutationId: java.lang.String, error: stdLib.Error): scala.Unit = js.native
  def markMutationResult(mutationId: java.lang.String): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

