package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.mlParserParserMod.Parser
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlParserMod {
  
  @JSImport("@angular/compiler/src/ml_parser/xml_parser", "ParseTreeResult")
  @js.native
  class ParseTreeResult protected ()
    extends typings.angularCompiler.mlParserParserMod.ParseTreeResult {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  }
  
  @JSImport("@angular/compiler/src/ml_parser/xml_parser", "TreeError")
  @js.native
  class TreeError protected ()
    extends typings.angularCompiler.mlParserParserMod.TreeError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  }
  /* static members */
  object TreeError {
    
    @JSImport("@angular/compiler/src/ml_parser/xml_parser", "TreeError")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(elementName: String, span: ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserParserMod.TreeError]
    @scala.inline
    def create(elementName: Null, span: ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserParserMod.TreeError]
  }
  
  @JSImport("@angular/compiler/src/ml_parser/xml_parser", "XmlParser")
  @js.native
  class XmlParser () extends Parser
}
