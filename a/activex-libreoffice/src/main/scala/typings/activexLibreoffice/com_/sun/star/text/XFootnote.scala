package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a footnote within a {@link Text} .
  * @see Footnote
  */
@js.native
trait XFootnote extends XTextContent {
  
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  var Label: String = js.native
  
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  def getLabel(): String = js.native
  
  /** sets the label of the footnote. */
  def setLabel(aLabel: String): Unit = js.native
}
object XFootnote {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    Label: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getLabel: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setLabel: String => Unit
  ): XFootnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getLabel = js.Any.fromFunction0(getLabel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[XFootnote]
  }
  
  @scala.inline
  implicit class XFootnoteMutableBuilder[Self <: XFootnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLabel(value: String => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
  }
}
