package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the mark of a document index entry.
  * @see DocumentIndexMark
  */
trait XDocumentIndexMark
  extends StObject
     with XTextContent {
  
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  var MarkEntry: String
  
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  def getMarkEntry(): String
  
  /**
    * sets an explicit string for this index mark to use in the index.
    *
    * If empty, the string of the {@link TextRange} to which the {@link TextContent} refers is used in the index.
    */
  def setMarkEntry(aIndexEntry: String): Unit
}
object XDocumentIndexMark {
  
  inline def apply(
    Anchor: XTextRange,
    MarkEntry: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getMarkEntry: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setMarkEntry: String => Unit
  ): XDocumentIndexMark = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], MarkEntry = MarkEntry.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getMarkEntry = js.Any.fromFunction0(getMarkEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setMarkEntry = js.Any.fromFunction1(setMarkEntry))
    __obj.asInstanceOf[XDocumentIndexMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDocumentIndexMark] (val x: Self) extends AnyVal {
    
    inline def setGetMarkEntry(value: () => String): Self = StObject.set(x, "getMarkEntry", js.Any.fromFunction0(value))
    
    inline def setMarkEntry(value: String): Self = StObject.set(x, "MarkEntry", value.asInstanceOf[js.Any])
    
    inline def setSetMarkEntry(value: String => Unit): Self = StObject.set(x, "setMarkEntry", js.Any.fromFunction1(value))
  }
}
