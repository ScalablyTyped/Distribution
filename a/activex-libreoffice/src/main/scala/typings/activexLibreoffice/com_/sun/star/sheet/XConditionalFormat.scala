package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XConditionalFormat
  extends StObject
     with XIndexAccess {
  
  /**
    * Creates a new conditional format entry and insert its at the position.
    * @param Type a com.sun.star.sheet.ConditionFormatEntryType specifying the type of the new entry
    * @param Position the position in the conditional format
    */
  def createEntry(Type: Double, Position: Double): Unit
  
  def removeByIndex(Index: Double): Unit
}
object XConditionalFormat {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    createEntry: (Double, Double) => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XConditionalFormat = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEntry = js.Any.fromFunction2(createEntry), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XConditionalFormat]
  }
  
  @scala.inline
  implicit class XConditionalFormatMutableBuilder[Self <: XConditionalFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateEntry(value: (Double, Double) => Unit): Self = StObject.set(x, "createEntry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveByIndex(value: Double => Unit): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1(value))
  }
}
