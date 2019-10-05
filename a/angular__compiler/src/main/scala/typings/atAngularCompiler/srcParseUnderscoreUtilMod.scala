package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseLocation
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceFile
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", JSImport.Namespace)
@js.native
object srcParseUnderscoreUtilMod extends js.Object {
  @js.native
  class ParseError protected () extends js.Object {
    def this(span: ParseSourceSpan, msg: String) = this()
    def this(span: ParseSourceSpan, msg: String, level: ParseErrorLevel) = this()
    var level: ParseErrorLevel = js.native
    var msg: String = js.native
    var span: ParseSourceSpan = js.native
    def contextualMessage(): String = js.native
  }
  
  @js.native
  sealed trait ParseErrorLevel extends js.Object
  
  @js.native
  class ParseLocation protected () extends js.Object {
    def this(file: ParseSourceFile, offset: Double, line: Double, col: Double) = this()
    var col: Double = js.native
    var file: ParseSourceFile = js.native
    var line: Double = js.native
    var offset: Double = js.native
    def getContext(maxChars: Double, maxLines: Double): Anon_After | Null = js.native
    def moveBy(delta: Double): ParseLocation = js.native
  }
  
  @js.native
  class ParseSourceFile protected () extends js.Object {
    def this(content: String, url: String) = this()
    var content: String = js.native
    var url: String = js.native
  }
  
  @js.native
  class ParseSourceSpan protected () extends js.Object {
    def this(start: ParseLocation, end: ParseLocation) = this()
    def this(start: ParseLocation, end: ParseLocation, details: String) = this()
    var details: String | Null = js.native
    var end: ParseLocation = js.native
    var start: ParseLocation = js.native
  }
  
  val EMPTY_PARSE_LOCATION: ParseLocation = js.native
  val EMPTY_SOURCE_SPAN: ParseSourceSpan = js.native
  def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  def typeSourceSpan(kind: String, `type`: CompileIdentifierMetadata): ParseSourceSpan = js.native
  @js.native
  object ParseErrorLevel extends js.Object {
    @js.native
    sealed trait ERROR extends ParseErrorLevel
    
    @js.native
    sealed trait WARNING extends ParseErrorLevel
    
    /* 1 */ val ERROR: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel.ERROR with Double = js.native
    /* 0 */ val WARNING: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel.WARNING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ParseErrorLevel with Double] = js.native
  }
  
}

