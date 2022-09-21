package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParseSpan")
@js.native
open class ParseSpan protected () extends StObject {
  def this(start: Double, end: Double) = this()
  
  var end: Double = js.native
  
  var start: Double = js.native
  
  def toAbsolute(absoluteOffset: Double): AbsoluteSourceSpan = js.native
}
