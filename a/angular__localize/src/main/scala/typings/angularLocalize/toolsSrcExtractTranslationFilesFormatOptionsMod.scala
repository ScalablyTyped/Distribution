package typings.angularLocalize

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesFormatOptionsMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/format_options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFormatOptions(): FormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFormatOptions")().asInstanceOf[FormatOptions]
  inline def parseFormatOptions(optionString: String): FormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFormatOptions")(optionString.asInstanceOf[js.Any]).asInstanceOf[FormatOptions]
  
  inline def validateOptions(name: String, validOptions: ValidOptions, options: FormatOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(name.asInstanceOf[js.Any], validOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FormatOptions = Record[String, String]
  
  type ValidOption = js.Tuple2[/* key */ String, /* values */ js.Array[String]]
  
  type ValidOptions = js.Array[ValidOption]
}
