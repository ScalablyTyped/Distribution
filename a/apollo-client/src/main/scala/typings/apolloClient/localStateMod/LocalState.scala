package typings.apolloClient.localStateMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloClient.anon.Cache
import typings.apolloClient.anon.Context
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.typesMod.Resolvers
import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.ASTNode
import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/LocalState", "LocalState")
@js.native
class LocalState[TCacheShape] protected () extends js.Object {
  def this(hasCacheClientResolversFragmentMatcher: LocalStateOptions[TCacheShape]) = this()
  var buildRootValueFromCache: js.Any = js.native
  var cache: js.Any = js.native
  var client: js.Any = js.native
  var fragmentMatcher: js.Any = js.native
  var resolveDocument: js.Any = js.native
  var resolveField: js.Any = js.native
  var resolveSelectionSet: js.Any = js.native
  var resolveSubSelectedArray: js.Any = js.native
  var resolvers: js.Any = js.native
  def addExportedVariables(document: DocumentNode): js.Promise[StringDictionary[_]] = js.native
  def addExportedVariables(document: DocumentNode, variables: js.UndefOr[scala.Nothing], context: js.Object): js.Promise[StringDictionary[_]] = js.native
  def addExportedVariables(document: DocumentNode, variables: OperationVariables): js.Promise[StringDictionary[_]] = js.native
  def addExportedVariables(document: DocumentNode, variables: OperationVariables, context: js.Object): js.Promise[StringDictionary[_]] = js.native
  def addResolvers(resolvers: js.Array[Resolvers]): Unit = js.native
  def addResolvers(resolvers: Resolvers): Unit = js.native
  def clientQuery(document: DocumentNode): DocumentNode | Null = js.native
  def getFragmentMatcher(): FragmentMatcher = js.native
  def getResolvers(): Resolvers = js.native
  def prepareContext(): Cache[TCacheShape] = js.native
  def prepareContext(context: js.Object): Cache[TCacheShape] = js.native
  def runResolvers[TData](hasDocumentRemoteResultContextVariablesOnlyRunForcedResolvers: Context[TData]): js.Promise[FetchResult[TData, Record[String, _], Record[String, _]]] = js.native
  def serverQuery(document: DocumentNode): DocumentNode | Null = js.native
  def setFragmentMatcher(fragmentMatcher: FragmentMatcher): Unit = js.native
  def setResolvers(resolvers: js.Array[Resolvers]): Unit = js.native
  def setResolvers(resolvers: Resolvers): Unit = js.native
  def shouldForceResolvers(document: ASTNode): Boolean = js.native
}

