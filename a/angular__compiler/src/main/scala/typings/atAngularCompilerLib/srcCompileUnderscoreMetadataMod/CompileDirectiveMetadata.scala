package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected () extends js.Object {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: atAngularCompilerLib.Anon_ChangeDetectionComponentFactory) = this()
  var changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy | scala.Null = js.native
  var componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null = js.native
  var componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | ProxyClass | scala.Null = js.native
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportAs: java.lang.String | scala.Null = js.native
  var guards: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var hostAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var hostListeners: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var hostProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var isComponent: scala.Boolean = js.native
  var isHost: scala.Boolean = js.native
  var outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var providers: js.Array[CompileProviderMetadata] = js.native
  var queries: js.Array[CompileQueryMetadata] = js.native
  var rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null = js.native
  var selector: java.lang.String | scala.Null = js.native
  var template: CompileTemplateMetadata | scala.Null = js.native
  var `type`: CompileTypeMetadata = js.native
  var viewProviders: js.Array[CompileProviderMetadata] = js.native
  var viewQueries: js.Array[CompileQueryMetadata] = js.native
  def toSummary(): CompileDirectiveSummary = js.native
}

@JSImport("@angular/compiler/src/compile_metadata", "CompileDirectiveMetadata")
@js.native
object CompileDirectiveMetadata extends js.Object {
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: atAngularCompilerLib.Anon_ChangeDetection
  ): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata = js.native
}

