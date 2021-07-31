package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleTextSelection
  extends StObject
     with XInterface {
  
  val SelectedPortionCount: Double
  
  def addSelection(selectionIndex: Double, startOffset: Double, endOffset: Double): Double
  
  def getSelectedPortionCount(): Double
  
  def getSeletedPositionEnd(nSelectedPortionIndex: Double): Double
  
  def getSeletedPositionStart(nSelectedPortionIndex: Double): Double
  
  def removeSelection(selectionIndex: Double): Boolean
  
  def scrollToPosition(aPoint: Point, isLeftTop: Boolean): Boolean
}
object XAccessibleTextSelection {
  
  @scala.inline
  def apply(
    SelectedPortionCount: Double,
    acquire: () => Unit,
    addSelection: (Double, Double, Double) => Double,
    getSelectedPortionCount: () => Double,
    getSeletedPositionEnd: Double => Double,
    getSeletedPositionStart: Double => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelection: Double => Boolean,
    scrollToPosition: (Point, Boolean) => Boolean
  ): XAccessibleTextSelection = {
    val __obj = js.Dynamic.literal(SelectedPortionCount = SelectedPortionCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelection = js.Any.fromFunction3(addSelection), getSelectedPortionCount = js.Any.fromFunction0(getSelectedPortionCount), getSeletedPositionEnd = js.Any.fromFunction1(getSeletedPositionEnd), getSeletedPositionStart = js.Any.fromFunction1(getSeletedPositionStart), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelection = js.Any.fromFunction1(removeSelection), scrollToPosition = js.Any.fromFunction2(scrollToPosition))
    __obj.asInstanceOf[XAccessibleTextSelection]
  }
  
  @scala.inline
  implicit class XAccessibleTextSelectionMutableBuilder[Self <: XAccessibleTextSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSelection(value: (Double, Double, Double) => Double): Self = StObject.set(x, "addSelection", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetSelectedPortionCount(value: () => Double): Self = StObject.set(x, "getSelectedPortionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeletedPositionEnd(value: Double => Double): Self = StObject.set(x, "getSeletedPositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSeletedPositionStart(value: Double => Double): Self = StObject.set(x, "getSeletedPositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSelection(value: Double => Boolean): Self = StObject.set(x, "removeSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollToPosition(value: (Point, Boolean) => Boolean): Self = StObject.set(x, "scrollToPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedPortionCount(value: Double): Self = StObject.set(x, "SelectedPortionCount", value.asInstanceOf[js.Any])
  }
}
