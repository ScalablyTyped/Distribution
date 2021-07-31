package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text and formatting of a fixed hyperlink field. */
trait XFixedHyperlink
  extends StObject
     with XInterface {
  
  /** returns the alignment of the text in the control. */
  var Alignment: Double
  
  /** returns the text of the control. */
  var Text: String
  
  /** returns the url of the control. */
  var URL: String
  
  /** registers an event handler for click action event. */
  def addActionListener(l: XActionListener): Unit
  
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double
  
  /** returns the text of the control. */
  def getText(): String
  
  /** returns the url of the control. */
  def getURL(): String
  
  /** unregisters an event handler for click action event. */
  def removeActionListener(l: XActionListener): Unit
  
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit
  
  /** sets the text of the control. */
  def setText(Text: String): Unit
  
  /** sets the url of the control. */
  def setURL(URL: String): Unit
}
object XFixedHyperlink {
  
  @scala.inline
  def apply(
    Alignment: Double,
    Text: String,
    URL: String,
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    getAlignment: () => Double,
    getText: () => String,
    getURL: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setAlignment: Double => Unit,
    setText: String => Unit,
    setURL: String => Unit
  ): XFixedHyperlink = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), getAlignment = js.Any.fromFunction0(getAlignment), getText = js.Any.fromFunction0(getText), getURL = js.Any.fromFunction0(getURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setAlignment = js.Any.fromFunction1(setAlignment), setText = js.Any.fromFunction1(setText), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[XFixedHyperlink]
  }
  
  @scala.inline
  implicit class XFixedHyperlinkMutableBuilder[Self <: XFixedHyperlink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddActionListener(value: XActionListener => Unit): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAlignment(value: () => Double): Self = StObject.set(x, "getAlignment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveActionListener(value: XActionListener => Unit): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAlignment(value: Double => Unit): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetURL(value: String => Unit): Self = StObject.set(x, "setURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
