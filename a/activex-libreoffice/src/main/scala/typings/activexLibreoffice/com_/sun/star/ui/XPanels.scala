package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Panels of a Deck.
  * @since LibreOffice 5.1
  */
trait XPanels
  extends StObject
     with XIndexAccess
     with XNameAccess {
  
  /** The deck Id that contains the Panels */
  val DeckId: String
  
  /** The deck Id that contains the Panels */
  def getDeckId(): String
}
object XPanels {
  
  inline def apply(
    Count: Double,
    DeckId: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: () => Double,
    getDeckId: () => String,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPanels = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DeckId = DeckId.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getDeckId = js.Any.fromFunction0(getDeckId), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPanels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPanels] (val x: Self) extends AnyVal {
    
    inline def setDeckId(value: String): Self = StObject.set(x, "DeckId", value.asInstanceOf[js.Any])
    
    inline def setGetDeckId(value: () => String): Self = StObject.set(x, "getDeckId", js.Any.fromFunction0(value))
  }
}
