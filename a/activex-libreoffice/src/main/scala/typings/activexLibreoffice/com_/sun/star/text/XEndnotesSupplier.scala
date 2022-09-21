package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the endnotes within the context (e.g. document). */
trait XEndnotesSupplier
  extends StObject
     with XInterface {
  
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: XPropertySet
  
  /** @returns a collection of endnotes. */
  val Endnotes: XIndexAccess
  
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): XPropertySet
  
  /** @returns a collection of endnotes. */
  def getEndnotes(): XIndexAccess
}
object XEndnotesSupplier {
  
  inline def apply(
    EndnoteSettings: XPropertySet,
    Endnotes: XIndexAccess,
    acquire: () => Unit,
    getEndnoteSettings: () => XPropertySet,
    getEndnotes: () => XIndexAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal(EndnoteSettings = EndnoteSettings.asInstanceOf[js.Any], Endnotes = Endnotes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEndnoteSettings = js.Any.fromFunction0(getEndnoteSettings), getEndnotes = js.Any.fromFunction0(getEndnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEndnotesSupplier]
  }
  
  extension [Self <: XEndnotesSupplier](x: Self) {
    
    inline def setEndnoteSettings(value: XPropertySet): Self = StObject.set(x, "EndnoteSettings", value.asInstanceOf[js.Any])
    
    inline def setEndnotes(value: XIndexAccess): Self = StObject.set(x, "Endnotes", value.asInstanceOf[js.Any])
    
    inline def setGetEndnoteSettings(value: () => XPropertySet): Self = StObject.set(x, "getEndnoteSettings", js.Any.fromFunction0(value))
    
    inline def setGetEndnotes(value: () => XIndexAccess): Self = StObject.set(x, "getEndnotes", js.Any.fromFunction0(value))
  }
}
