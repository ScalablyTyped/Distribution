package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateLiteralElement")
@js.native
open class TemplateLiteralElement protected () extends StObject {
  def this(text: String) = this()
  def this(text: String, sourceSpan: ParseSourceSpan) = this()
  def this(text: String, sourceSpan: Unit, rawText: String) = this()
  def this(text: String, sourceSpan: ParseSourceSpan, rawText: String) = this()
  
  var rawText: String = js.native
  
  var sourceSpan: js.UndefOr[ParseSourceSpan] = js.native
  
  var text: String = js.native
}
