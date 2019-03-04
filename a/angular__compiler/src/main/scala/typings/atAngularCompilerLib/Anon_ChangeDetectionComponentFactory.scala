package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeDetectionComponentFactory extends js.Object {
  var changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy | scala.Null
  var componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass | scala.Null
  var entryComponents: js.Array[
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
  ]
  var exportAs: java.lang.String | scala.Null
  var guards: org.scalablytyped.runtime.StringDictionary[js.Any]
  var hostAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var hostListeners: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var hostProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var isComponent: scala.Boolean
  var isHost: scala.Boolean
  var outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
  var queries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata]
  var rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var selector: java.lang.String | scala.Null
  var template: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata | scala.Null
  var `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
  var viewProviders: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
  var viewQueries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata]
}

object Anon_ChangeDetectionComponentFactory {
  @scala.inline
  def apply(
    entryComponents: js.Array[
      atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
    ],
    guards: org.scalablytyped.runtime.StringDictionary[js.Any],
    hostAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    hostListeners: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    hostProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    isComponent: scala.Boolean,
    isHost: scala.Boolean,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata],
    queries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata],
    `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata,
    viewProviders: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata],
    viewQueries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata],
    changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy = null,
    componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object = null,
    componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass = null,
    exportAs: java.lang.String = null,
    rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object = null,
    selector: java.lang.String = null,
    template: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata = null
  ): Anon_ChangeDetectionComponentFactory = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents, guards = guards, hostAttributes = hostAttributes, hostListeners = hostListeners, hostProperties = hostProperties, inputs = inputs, isComponent = isComponent, isHost = isHost, outputs = outputs, providers = providers, queries = queries, viewProviders = viewProviders, viewQueries = viewQueries)
    __obj.updateDynamic("type")(`type`)
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection)
    if (componentFactory != null) __obj.updateDynamic("componentFactory")(componentFactory.asInstanceOf[js.Any])
    if (componentViewType != null) __obj.updateDynamic("componentViewType")(componentViewType.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Anon_ChangeDetectionComponentFactory]
  }
}

