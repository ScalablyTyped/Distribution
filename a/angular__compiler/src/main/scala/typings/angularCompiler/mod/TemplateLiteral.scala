package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateLiteral")
@js.native
open class TemplateLiteral protected () extends StObject {
  def this(elements: js.Array[TemplateLiteralElement], expressions: js.Array[Expression]) = this()
  
  var elements: js.Array[TemplateLiteralElement] = js.native
  
  var expressions: js.Array[Expression] = js.native
}
