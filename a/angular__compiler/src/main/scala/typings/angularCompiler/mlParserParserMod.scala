package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.mlParserLexerMod.TokenizeOptions
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mlParserParserMod {
  
  @JSImport("@angular/compiler/src/ml_parser/parser", "ParseTreeResult")
  @js.native
  class ParseTreeResult protected () extends StObject {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
    
    var errors: js.Array[ParseError] = js.native
    
    var rootNodes: js.Array[Node] = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/parser", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]) = this()
    
    def getTagDefinition(tagName: String): TagDefinition = js.native
    
    def parse(source: String, url: String): ParseTreeResult = js.native
    def parse(source: String, url: String, options: TokenizeOptions): ParseTreeResult = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/parser", "TreeError")
  @js.native
  class TreeError protected () extends ParseError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
    
    var elementName: String | Null = js.native
  }
  /* static members */
  object TreeError {
    
    @JSImport("@angular/compiler/src/ml_parser/parser", "TreeError")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(elementName: String, span: ParseSourceSpan, msg: String): TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[TreeError]
    @scala.inline
    def create(elementName: Null, span: ParseSourceSpan, msg: String): TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[TreeError]
  }
}
