package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeDetection extends js.Object {
  var changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy | scala.Null
  var componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass | scala.Null
  var entryComponents: js.Array[
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
  ]
  var exportAs: java.lang.String | scala.Null
  var guards: org.scalablytyped.runtime.StringDictionary[js.Any]
  var host: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var inputs: js.Array[java.lang.String]
  var isComponent: scala.Boolean
  var isHost: scala.Boolean
  var outputs: js.Array[java.lang.String]
  var providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
  var queries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata]
  var rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var selector: java.lang.String | scala.Null
  var template: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata
  var `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
  var viewProviders: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
  var viewQueries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata]
}

object Anon_ChangeDetection {
  @scala.inline
  def apply(
    entryComponents: js.Array[
      atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
    ],
    guards: org.scalablytyped.runtime.StringDictionary[js.Any],
    host: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputs: js.Array[java.lang.String],
    isComponent: scala.Boolean,
    isHost: scala.Boolean,
    outputs: js.Array[java.lang.String],
    providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata],
    queries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata],
    template: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata,
    `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata,
    viewProviders: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata],
    viewQueries: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileQueryMetadata],
    changeDetection: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy = null,
    componentFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object = null,
    componentViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass = null,
    exportAs: java.lang.String = null,
    rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object = null,
    selector: java.lang.String = null
  ): Anon_ChangeDetection = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("entryComponents")(entryComponents)
    __obj.updateDynamic("guards")(guards)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("isComponent")(isComponent)
    __obj.updateDynamic("isHost")(isHost)
    __obj.updateDynamic("outputs")(outputs)
    __obj.updateDynamic("providers")(providers)
    __obj.updateDynamic("queries")(queries)
    __obj.updateDynamic("template")(template)
    __obj.updateDynamic("viewProviders")(viewProviders)
    __obj.updateDynamic("viewQueries")(viewQueries)
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection)
    if (componentFactory != null) __obj.updateDynamic("componentFactory")(componentFactory.asInstanceOf[js.Any])
    if (componentViewType != null) __obj.updateDynamic("componentViewType")(componentViewType.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_ChangeDetection]
  }
}

