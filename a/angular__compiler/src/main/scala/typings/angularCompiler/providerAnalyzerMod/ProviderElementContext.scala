package typings.angularCompiler.providerAnalyzerMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.templateAstMod.AttrAst
import typings.angularCompiler.templateAstMod.DirectiveAst
import typings.angularCompiler.templateAstMod.ProviderAst
import typings.angularCompiler.templateAstMod.QueryMatch
import typings.angularCompiler.templateAstMod.ReferenceAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderElementContext")
@js.native
class ProviderElementContext protected () extends js.Object {
  def this(
    viewContext: ProviderViewContext,
    _parent: ProviderElementContext,
    _isViewRoot: Boolean,
    _directiveAsts: js.Array[DirectiveAst],
    attrs: js.Array[AttrAst],
    refs: js.Array[ReferenceAst],
    isTemplate: Boolean,
    contentQueryStartId: Double,
    _sourceSpan: ParseSourceSpan
  ) = this()
  var _addQueryReadsTo: js.Any = js.native
  var _allProviders: js.Any = js.native
  var _attrs: js.Any = js.native
  var _contentQueries: js.Any = js.native
  var _directiveAsts: js.Any = js.native
  var _getDependency: js.Any = js.native
  var _getLocalDependency: js.Any = js.native
  var _getOrCreateLocalProvider: js.Any = js.native
  var _getQueriesFor: js.Any = js.native
  var _isViewRoot: js.Any = js.native
  var _parent: js.Any = js.native
  var _queriedTokens: js.Any = js.native
  var _seenProviders: js.Any = js.native
  var _sourceSpan: js.Any = js.native
  var _transformedProviders: js.Any = js.native
  val transformedHasViewContainer: Boolean = js.native
  var viewContext: ProviderViewContext = js.native
  def afterElement(): Unit = js.native
  def queryMatches: js.Array[QueryMatch] = js.native
  def transformProviders: js.Array[ProviderAst] = js.native
  def transformedDirectiveAsts: js.Array[DirectiveAst] = js.native
}

