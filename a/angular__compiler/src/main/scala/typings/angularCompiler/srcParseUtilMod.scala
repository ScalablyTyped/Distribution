package typings.angularCompiler

import typings.angularCompiler.anon.After
import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParseUtilMod {
  
  @JSImport("@angular/compiler/src/parse_util", "ParseError")
  @js.native
  class ParseError protected () extends StObject {
    def this(span: ParseSourceSpan, msg: String) = this()
    def this(span: ParseSourceSpan, msg: String, level: ParseErrorLevel) = this()
    
    def contextualMessage(): String = js.native
    
    var level: ParseErrorLevel = js.native
    
    var msg: String = js.native
    
    var span: ParseSourceSpan = js.native
  }
  
  @js.native
  sealed trait ParseErrorLevel extends StObject
  @JSImport("@angular/compiler/src/parse_util", "ParseErrorLevel")
  @js.native
  object ParseErrorLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ParseErrorLevel with Double] = js.native
    
    @js.native
    sealed trait ERROR extends ParseErrorLevel
    /* 1 */ val ERROR: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel.ERROR with Double = js.native
    
    @js.native
    sealed trait WARNING extends ParseErrorLevel
    /* 0 */ val WARNING: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel.WARNING with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/parse_util", "ParseLocation")
  @js.native
  class ParseLocation protected () extends StObject {
    def this(file: ParseSourceFile, offset: Double, line: Double, col: Double) = this()
    
    var col: Double = js.native
    
    var file: ParseSourceFile = js.native
    
    def getContext(maxChars: Double, maxLines: Double): After | Null = js.native
    
    var line: Double = js.native
    
    def moveBy(delta: Double): ParseLocation = js.native
    
    var offset: Double = js.native
  }
  
  @JSImport("@angular/compiler/src/parse_util", "ParseSourceFile")
  @js.native
  class ParseSourceFile protected () extends StObject {
    def this(content: String, url: String) = this()
    
    var content: String = js.native
    
    var url: String = js.native
  }
  
  @JSImport("@angular/compiler/src/parse_util", "ParseSourceSpan")
  @js.native
  class ParseSourceSpan protected () extends StObject {
    /**
      * Create an object that holds information about spans of tokens/nodes captured during
      * lexing/parsing of text.
      *
      * @param start
      * The location of the start of the span (having skipped leading trivia).
      * Skipping leading trivia makes source-spans more "user friendly", since things like HTML
      * elements will appear to begin at the start of the opening tag, rather than at the start of any
      * leading trivia, which could include newlines.
      *
      * @param end
      * The location of the end of the span.
      *
      * @param fullStart
      * The start of the token without skipping the leading trivia.
      * This is used by tooling that splits tokens further, such as extracting Angular interpolations
      * from text tokens. Such tooling creates new source-spans relative to the original token's
      * source-span. If leading trivia characters have been skipped then the new source-spans may be
      * incorrectly offset.
      *
      * @param details
      * Additional information (such as identifier names) that should be associated with the span.
      */
    def this(start: ParseLocation, end: ParseLocation) = this()
    def this(start: ParseLocation, end: ParseLocation, fullStart: ParseLocation) = this()
    def this(start: ParseLocation, end: ParseLocation, fullStart: js.UndefOr[scala.Nothing], details: String) = this()
    def this(start: ParseLocation, end: ParseLocation, fullStart: ParseLocation, details: String) = this()
    
    var details: String | Null = js.native
    
    var end: ParseLocation = js.native
    
    var fullStart: ParseLocation = js.native
    
    var start: ParseLocation = js.native
  }
  
  @JSImport("@angular/compiler/src/parse_util", "r3JitTypeSourceSpan")
  @js.native
  def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  
  @JSImport("@angular/compiler/src/parse_util", "typeSourceSpan")
  @js.native
  def typeSourceSpan(kind: String, `type`: CompileIdentifierMetadata): ParseSourceSpan = js.native
}
