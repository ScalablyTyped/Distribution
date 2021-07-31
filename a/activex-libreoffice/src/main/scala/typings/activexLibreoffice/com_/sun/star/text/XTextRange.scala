package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the object's position in a text.
  *
  * It represents a text range. The beginning and end of the range may be identical.
  */
trait XTextRange
  extends StObject
     with XInterface {
  
  /** @returns a text range which contains only the end of this text range. */
  val End: XTextRange
  
  /** @returns a text range which contains only the start of this text range. */
  val Start: XTextRange
  
  /** @returns the string that is included in this text range. */
  var String: java.lang.String
  
  /** @returns a text range which contains only the end of this text range. */
  def getEnd(): XTextRange
  
  /** @returns a text range which contains only the start of this text range. */
  def getStart(): XTextRange
  
  /** @returns the string that is included in this text range. */
  def getString(): String
  
  /** @returns the text interface in which the text position is contained. */
  def getText(): XText
  
  /**
    * the whole string of characters of this piece of text is replaced.
    *
    * All styles are removed when applying this method.
    */
  def setString(aString: String): Unit
}
object XTextRange {
  
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XTextRange = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XTextRange]
  }
  
  @scala.inline
  implicit class XTextRangeMutableBuilder[Self <: XTextRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: XTextRange): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEnd(value: () => XTextRange): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStart(value: () => XTextRange): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => XText): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: XTextRange): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
  }
}
