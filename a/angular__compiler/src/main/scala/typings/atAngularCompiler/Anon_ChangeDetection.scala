package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileQueryMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.ProxyClass
import typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeDetection extends js.Object {
  var changeDetection: ChangeDetectionStrategy | Null
  var componentFactory: StaticSymbol | js.Object | Null
  var componentViewType: StaticSymbol | ProxyClass | Null
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportAs: String | Null
  var guards: StringDictionary[js.Any]
  var host: StringDictionary[String]
  var inputs: js.Array[String]
  var isComponent: Boolean
  var isHost: Boolean
  var outputs: js.Array[String]
  var providers: js.Array[CompileProviderMetadata]
  var queries: js.Array[CompileQueryMetadata]
  var rendererType: StaticSymbol | js.Object | Null
  var selector: String | Null
  var template: CompileTemplateMetadata
  var `type`: CompileTypeMetadata
  var viewProviders: js.Array[CompileProviderMetadata]
  var viewQueries: js.Array[CompileQueryMetadata]
}

object Anon_ChangeDetection {
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
    viewQueries: js.Array[CompileQueryMetadata],
    changeDetection: ChangeDetectionStrategy = null,
    componentFactory: StaticSymbol | js.Object = null,
    componentViewType: StaticSymbol | ProxyClass = null,
    exportAs: String = null,
    rendererType: StaticSymbol | js.Object = null,
    selector: String = null
  ): Anon_ChangeDetection = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents, guards = guards, host = host, inputs = inputs, isComponent = isComponent, isHost = isHost, outputs = outputs, providers = providers, queries = queries, template = template, viewProviders = viewProviders, viewQueries = viewQueries)
    __obj.updateDynamic("type")(`type`)
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection)
    if (componentFactory != null) __obj.updateDynamic("componentFactory")(componentFactory.asInstanceOf[js.Any])
    if (componentViewType != null) __obj.updateDynamic("componentViewType")(componentViewType.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_ChangeDetection]
  }
}

