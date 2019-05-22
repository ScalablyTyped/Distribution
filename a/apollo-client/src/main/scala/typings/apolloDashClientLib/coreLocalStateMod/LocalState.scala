package typings
package apolloDashClientLib.coreLocalStateMod

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
  var resolvers: js.UndefOr[js.Any] = js.native
  def addExportedVariables(document: graphqlLib.languageAstMod.DocumentNode): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def addExportedVariables(
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: apolloDashClientLib.coreTypesMod.OperationVariables
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def addExportedVariables(
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: apolloDashClientLib.coreTypesMod.OperationVariables,
    context: js.Object
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def addResolvers(resolvers: apolloDashClientLib.coreTypesMod.Resolvers): scala.Unit = js.native
  def addResolvers(resolvers: js.Array[apolloDashClientLib.coreTypesMod.Resolvers]): scala.Unit = js.native
  def clientQuery(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def getFragmentMatcher(): FragmentMatcher = js.native
  def getResolvers(): apolloDashClientLib.coreTypesMod.Resolvers = js.native
  def prepareContext(): apolloDashClientLib.Anon_Cache[TCacheShape] = js.native
  def prepareContext(context: js.Object): apolloDashClientLib.Anon_Cache[TCacheShape] = js.native
  def runResolvers[TData](
    hasDocumentRemoteResultContextVariablesOnlyRunForcedResolvers: apolloDashClientLib.Anon_Context[TData]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def serverQuery(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode | scala.Null = js.native
  def setFragmentMatcher(fragmentMatcher: FragmentMatcher): scala.Unit = js.native
  def setResolvers(resolvers: apolloDashClientLib.coreTypesMod.Resolvers): scala.Unit = js.native
  def setResolvers(resolvers: js.Array[apolloDashClientLib.coreTypesMod.Resolvers]): scala.Unit = js.native
  def shouldForceResolvers(document: graphqlLib.languageAstMod.ASTNode): scala.Boolean = js.native
}

