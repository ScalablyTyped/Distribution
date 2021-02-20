package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This structure is used to specify a single tabulator stop. */
@js.native
trait TabStop extends StObject {
  
  /** This field specifies the alignment of the text range before the tabulator. */
  var Alignment: TabAlign = js.native
  
  /** This field specifies which delimiter is used for the decimal. */
  var DecimalChar: String = js.native
  
  /** This field specifies the character that is used to fill up the space between the text in the text range and the tabulators. */
  var FillChar: String = js.native
  
  /** This field specifies the position of the tabulator in relation to the left border. */
  var Position: Double = js.native
}
object TabStop {
  
  @scala.inline
  def apply(Alignment: TabAlign, DecimalChar: String, FillChar: String, Position: Double): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DecimalChar = DecimalChar.asInstanceOf[js.Any], FillChar = FillChar.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  
  @scala.inline
  implicit class TabStopMutableBuilder[Self <: TabStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: TabAlign): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalChar(value: String): Self = StObject.set(x, "DecimalChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillChar(value: String): Self = StObject.set(x, "FillChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
