package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a mapping from a formula name (function name, operator, ...) to the OpCode used by the formula compiler. */
@js.native
trait FormulaOpCodeMapEntry extends StObject {
  
  /** The function name, or operator. */
  var Name: String = js.native
  
  /** The corresponding mapping. */
  var Token: FormulaToken = js.native
}
object FormulaOpCodeMapEntry {
  
  @scala.inline
  def apply(Name: String, Token: FormulaToken): FormulaOpCodeMapEntry = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaOpCodeMapEntry]
  }
  
  @scala.inline
  implicit class FormulaOpCodeMapEntryMutableBuilder[Self <: FormulaOpCodeMapEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: FormulaToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
  }
}
