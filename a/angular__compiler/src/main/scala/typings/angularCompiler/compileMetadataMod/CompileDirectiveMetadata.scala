package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.ChangeDetection
import typings.angularCompiler.anon.ComponentFactory
import typings.angularCompiler.coreMod.ChangeDetectionStrategy
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compile_metadata", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected () extends StObject {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ComponentFactory) = this()
  
  var changeDetection: ChangeDetectionStrategy | Null = js.native
  
  var componentFactory: StaticSymbol | js.Object | Null = js.native
  
  var componentViewType: StaticSymbol | ProxyClass | Null = js.native
  
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  
  var exportAs: String | Null = js.native
  
  var guards: StringDictionary[js.Any] = js.native
  
  var hostAttributes: StringDictionary[String] = js.native
  
  var hostListeners: StringDictionary[String] = js.native
  
  var hostProperties: StringDictionary[String] = js.native
  
  var inputs: StringDictionary[String] = js.native
  
  var isComponent: Boolean = js.native
  
  var isHost: Boolean = js.native
  
  var outputs: StringDictionary[String] = js.native
  
  var providers: js.Array[CompileProviderMetadata] = js.native
  
  var queries: js.Array[CompileQueryMetadata] = js.native
  
  var rendererType: StaticSymbol | js.Object | Null = js.native
  
  var selector: String | Null = js.native
  
  var template: CompileTemplateMetadata | Null = js.native
  
  def toSummary(): CompileDirectiveSummary = js.native
  
  var `type`: CompileTypeMetadata = js.native
  
  var viewProviders: js.Array[CompileProviderMetadata] = js.native
  
  var viewQueries: js.Array[CompileQueryMetadata] = js.native
}
/* static members */
object CompileDirectiveMetadata {
  
  @JSImport("@angular/compiler/src/compile_metadata", "CompileDirectiveMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ChangeDetection
  ): CompileDirectiveMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory.asInstanceOf[js.Any]).asInstanceOf[CompileDirectiveMetadata]
}
