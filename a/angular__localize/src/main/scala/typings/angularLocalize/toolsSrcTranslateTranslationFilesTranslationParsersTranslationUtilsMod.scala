package typings.angularLocalize

import typings.angularCompiler.mod.Element
import typings.angularCompiler.mod.Node2
import typings.angularCompiler.mod.ParseError
import typings.angularCompiler.mod.ParseErrorLevel
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.ParseTreeResult
import typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.ParseAnalysis
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.ParsedTranslationBundle
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersTranslationUtilsMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/translation_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addErrorsToBundle(bundle: ParsedTranslationBundle, errors: js.Array[ParseError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addErrorsToBundle")(bundle.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addParseDiagnostic(diagnostics: Diagnostics, sourceSpan: ParseSourceSpan, message: String, level: ParseErrorLevel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParseDiagnostic")(diagnostics.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addParseError(diagnostics: Diagnostics, parseError: ParseError): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParseError")(diagnostics.asInstanceOf[js.Any], parseError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def canParseXml(filePath: String, contents: String, rootNodeName: String, attributes: Record[String, String]): ParseAnalysis[XmlTranslationParserHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("canParseXml")(filePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], rootNodeName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ParseAnalysis[XmlTranslationParserHint]]
  
  inline def getAttrOrThrow(element: Element, attrName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttrOrThrow")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAttribute(element: Element, attrName: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def isNamedElement(name: String): js.Function1[/* node */ Node2, /* is @angular/compiler.@angular/compiler.Element */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ Node2, /* is @angular/compiler.@angular/compiler.Element */ Boolean]]
  
  inline def parseInnerRange(element: Element): ParseTreeResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInnerRange")(element.asInstanceOf[js.Any]).asInstanceOf[ParseTreeResult]
  
  trait XmlTranslationParserHint extends StObject {
    
    var element: Element
    
    var errors: js.Array[ParseError]
  }
  object XmlTranslationParserHint {
    
    inline def apply(element: Element, errors: js.Array[ParseError]): XmlTranslationParserHint = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlTranslationParserHint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlTranslationParserHint] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
}
