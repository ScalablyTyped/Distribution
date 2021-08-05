package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the {@link Text} of a {@link TextFrame} .
  * @see TextFrame
  */
trait XTextFrame
  extends StObject
     with XTextContent {
  
  /** @returns the text within this frame. The returned interface belongs to an object which implements the service {@link Text} . */
  val Text: XText
  
  /** @returns the text within this frame. The returned interface belongs to an object which implements the service {@link Text} . */
  def getText(): XText
}
object XTextFrame {
  
  inline def apply(
    Anchor: XTextRange,
    Text: XText,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextFrame = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextFrame]
  }
  
  extension [Self <: XTextFrame](x: Self) {
    
    inline def setGetText(value: () => XText): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setText(value: XText): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
