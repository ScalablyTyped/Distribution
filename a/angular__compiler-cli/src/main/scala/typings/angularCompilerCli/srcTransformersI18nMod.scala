package typings.angularCompilerCli

import typings.angularCompiler.mod.MessageBundle
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.typescript.mod.CompilerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersI18nMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def i18nExtract(
    formatName: String,
    outFile: String,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: String,
    outFile: String,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle,
    pathResolve: js.Function1[/* repeated */ String, String]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any], pathResolve.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: String,
    outFile: Null,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: String,
    outFile: Null,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle,
    pathResolve: js.Function1[/* repeated */ String, String]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any], pathResolve.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: Null,
    outFile: String,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: Null,
    outFile: String,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle,
    pathResolve: js.Function1[/* repeated */ String, String]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any], pathResolve.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: Null,
    outFile: Null,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def i18nExtract(
    formatName: Null,
    outFile: Null,
    host: CompilerHost,
    options: CompilerOptions,
    bundle: MessageBundle,
    pathResolve: js.Function1[/* repeated */ String, String]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nExtract")(formatName.asInstanceOf[js.Any], outFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], bundle.asInstanceOf[js.Any], pathResolve.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def i18nGetExtension(formatName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("i18nGetExtension")(formatName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def i18nSerialize(bundle: MessageBundle, formatName: String, options: CompilerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nSerialize")(bundle.asInstanceOf[js.Any], formatName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
