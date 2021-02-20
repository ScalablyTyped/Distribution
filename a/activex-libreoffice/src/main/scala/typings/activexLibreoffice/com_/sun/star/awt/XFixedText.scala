package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text and formatting of a fixed text field. */
@js.native
trait XFixedText extends XInterface {
  
  /** returns the alignment of the text in the control. */
  var Alignment: Double = js.native
  
  /** returns the text of the control. */
  var Text: String = js.native
  
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double = js.native
  
  /** returns the text of the control. */
  def getText(): String = js.native
  
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit = js.native
  
  /** sets the text of the control. */
  def setText(Text: String): Unit = js.native
}
object XFixedText {
  
  @scala.inline
  def apply(
    Alignment: Double,
    Text: String,
    acquire: () => Unit,
    getAlignment: () => Double,
    getText: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAlignment: Double => Unit,
    setText: String => Unit
  ): XFixedText = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAlignment = js.Any.fromFunction0(getAlignment), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlignment = js.Any.fromFunction1(setAlignment), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XFixedText]
  }
  
  @scala.inline
  implicit class XFixedTextMutableBuilder[Self <: XFixedText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAlignment(value: () => Double): Self = StObject.set(x, "getAlignment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAlignment(value: Double => Unit): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
