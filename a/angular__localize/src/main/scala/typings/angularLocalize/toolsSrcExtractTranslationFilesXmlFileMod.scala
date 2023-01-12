package typings.angularLocalize

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesXmlFileMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/xml_file", "XmlFile")
  @js.native
  open class XmlFile () extends StObject {
    
    /* private */ var decIndent: Any = js.native
    
    /* private */ var elements: Any = js.native
    
    def endTag(name: String): this.type = js.native
    def endTag(name: String, param1: Options): this.type = js.native
    
    /* private */ var incIndent: Any = js.native
    
    /* private */ var indent: Any = js.native
    
    /* private */ var output: Any = js.native
    
    /* private */ var preservingWhitespace: Any = js.native
    
    def rawText(str: String): this.type = js.native
    
    def startTag(name: String): this.type = js.native
    def startTag(name: String, attributes: Unit, param2: Options): this.type = js.native
    def startTag(name: String, attributes: Record[String, js.UndefOr[String]]): this.type = js.native
    def startTag(name: String, attributes: Record[String, js.UndefOr[String]], param2: Options): this.type = js.native
    
    def text(str: String): this.type = js.native
  }
  
  trait Options extends StObject {
    
    var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var selfClosing: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    }
  }
}
