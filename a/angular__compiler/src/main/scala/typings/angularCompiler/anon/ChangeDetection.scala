package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileQueryMetadata
import typings.angularCompiler.compileMetadataMod.CompileTemplateMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileMetadataMod.ProxyClass
import typings.angularCompiler.coreMod.ChangeDetectionStrategy
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeDetection extends js.Object {
  var changeDetection: ChangeDetectionStrategy | Null = js.native
  var componentFactory: StaticSymbol | js.Object | Null = js.native
  var componentViewType: StaticSymbol | ProxyClass | Null = js.native
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportAs: String | Null = js.native
  var guards: StringDictionary[js.Any] = js.native
  var host: StringDictionary[String] = js.native
  var inputs: js.Array[String] = js.native
  var isComponent: Boolean = js.native
  var isHost: Boolean = js.native
  var outputs: js.Array[String] = js.native
  var providers: js.Array[CompileProviderMetadata] = js.native
  var queries: js.Array[CompileQueryMetadata] = js.native
  var rendererType: StaticSymbol | js.Object | Null = js.native
  var selector: String | Null = js.native
  var template: CompileTemplateMetadata = js.native
  var `type`: CompileTypeMetadata = js.native
  var viewProviders: js.Array[CompileProviderMetadata] = js.native
  var viewQueries: js.Array[CompileQueryMetadata] = js.native
}

object ChangeDetection {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: StringDictionary[js.Any],
    host: StringDictionary[String],
    inputs: js.Array[String],
    isComponent: Boolean,
    isHost: Boolean,
    outputs: js.Array[String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    template: CompileTemplateMetadata,
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata]
  ): ChangeDetection = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDetection]
  }
  @scala.inline
  implicit class ChangeDetectionOps[Self <: ChangeDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = this.set("entryComponents", js.Array(value :_*))
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuards(value: StringDictionary[js.Any]): Self = this.set("guards", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: StringDictionary[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: String*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComponent(value: Boolean): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHost(value: Boolean): Self = this.set("isHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: String*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersVarargs(value: CompileProviderMetadata*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[CompileProviderMetadata]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueriesVarargs(value: CompileQueryMetadata*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[CompileQueryMetadata]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: CompileTemplateMetadata): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewProvidersVarargs(value: CompileProviderMetadata*): Self = this.set("viewProviders", js.Array(value :_*))
    @scala.inline
    def setViewProviders(value: js.Array[CompileProviderMetadata]): Self = this.set("viewProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewQueriesVarargs(value: CompileQueryMetadata*): Self = this.set("viewQueries", js.Array(value :_*))
    @scala.inline
    def setViewQueries(value: js.Array[CompileQueryMetadata]): Self = this.set("viewQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = this.set("changeDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeDetectionNull: Self = this.set("changeDetection", null)
    @scala.inline
    def setComponentFactory(value: StaticSymbol | js.Object): Self = this.set("componentFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentFactoryNull: Self = this.set("componentFactory", null)
    @scala.inline
    def setComponentViewType(value: StaticSymbol | ProxyClass): Self = this.set("componentViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentViewTypeNull: Self = this.set("componentViewType", null)
    @scala.inline
    def setExportAs(value: String): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportAsNull: Self = this.set("exportAs", null)
    @scala.inline
    def setRendererType(value: StaticSymbol | js.Object): Self = this.set("rendererType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendererTypeNull: Self = this.set("rendererType", null)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorNull: Self = this.set("selector", null)
  }
  
}

