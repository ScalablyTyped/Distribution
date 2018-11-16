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
  var guards: ScalablyTyped.runtime.StringDictionary[js.Any]
  var hostAttributes: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var hostListeners: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var hostProperties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var inputs: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var isComponent: scala.Boolean
  var outputs: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var providers: js.Array[CompileProviderMetadata]
  var queries: js.Array[CompileQueryMetadata]
  var rendererType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | js.Object | scala.Null
  var selector: java.lang.String | scala.Null
  var template: CompileTemplateSummary | scala.Null
  var viewProviders: js.Array[CompileProviderMetadata]
  var viewQueries: js.Array[CompileQueryMetadata]
}

