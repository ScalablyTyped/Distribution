package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileDirectiveSummary extends CompileTypeSummary {
  var changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy | scala.Null
  var componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | ProxyClass | scala.Null
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportAs: java.lang.String | scala.Null
  var guards: org.scalablytyped.runtime.StringDictionary[js.Any]
  var hostAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var hostListeners: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var hostProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var isComponent: scala.Boolean
  var outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var providers: js.Array[CompileProviderMetadata]
  var queries: js.Array[CompileQueryMetadata]
  var rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var selector: java.lang.String | scala.Null
  var template: CompileTemplateSummary | scala.Null
  var viewProviders: js.Array[CompileProviderMetadata]
  var viewQueries: js.Array[CompileQueryMetadata]
}

object CompileDirectiveSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: org.scalablytyped.runtime.StringDictionary[js.Any],
    hostAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    hostListeners: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    hostProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    isComponent: scala.Boolean,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata],
    changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy = null,
    componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object = null,
    componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | ProxyClass = null,
    exportAs: java.lang.String = null,
    rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object = null,
    selector: java.lang.String = null,
    summaryKind: CompileSummaryKind = null,
    template: CompileTemplateSummary = null
  ): CompileDirectiveSummary = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("entryComponents")(entryComponents)
    __obj.updateDynamic("guards")(guards)
    __obj.updateDynamic("hostAttributes")(hostAttributes)
    __obj.updateDynamic("hostListeners")(hostListeners)
    __obj.updateDynamic("hostProperties")(hostProperties)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("isComponent")(isComponent)
    __obj.updateDynamic("outputs")(outputs)
    __obj.updateDynamic("providers")(providers)
    __obj.updateDynamic("queries")(queries)
    __obj.updateDynamic("viewProviders")(viewProviders)
    __obj.updateDynamic("viewQueries")(viewQueries)
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection)
    if (componentFactory != null) __obj.updateDynamic("componentFactory")(componentFactory.asInstanceOf[js.Any])
    if (componentViewType != null) __obj.updateDynamic("componentViewType")(componentViewType.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[CompileDirectiveSummary]
  }
}

