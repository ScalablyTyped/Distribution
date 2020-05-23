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

trait ChangeDetection extends js.Object {
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
    viewQueries: js.Array[CompileQueryMetadata],
    changeDetection: ChangeDetectionStrategy = null,
    componentFactory: StaticSymbol | js.Object = null,
    componentViewType: StaticSymbol | ProxyClass = null,
    exportAs: String = null,
    rendererType: StaticSymbol | js.Object = null,
    selector: String = null
  ): ChangeDetection = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], changeDetection = changeDetection.asInstanceOf[js.Any], componentFactory = componentFactory.asInstanceOf[js.Any], componentViewType = componentViewType.asInstanceOf[js.Any], exportAs = exportAs.asInstanceOf[js.Any], rendererType = rendererType.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDetection]
  }
}

