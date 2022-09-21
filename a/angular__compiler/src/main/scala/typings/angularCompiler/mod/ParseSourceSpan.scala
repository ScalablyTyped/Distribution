package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParseSourceSpan")
@js.native
open class ParseSourceSpan protected () extends StObject {
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
  def this(start: ParseLocation, end: ParseLocation, fullStart: Unit, details: String) = this()
  def this(start: ParseLocation, end: ParseLocation, fullStart: ParseLocation, details: String) = this()
  
  var details: String | Null = js.native
  
  var end: ParseLocation = js.native
  
  var fullStart: ParseLocation = js.native
  
  var start: ParseLocation = js.native
}
