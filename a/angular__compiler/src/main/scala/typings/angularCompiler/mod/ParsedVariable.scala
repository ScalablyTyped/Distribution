package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParsedVariable")
@js.native
open class ParsedVariable protected () extends StObject {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, keySpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  
  val keySpan: ParseSourceSpan = js.native
  
  val name: String = js.native
  
  val sourceSpan: ParseSourceSpan = js.native
  
  val value: String = js.native
  
  val valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}
