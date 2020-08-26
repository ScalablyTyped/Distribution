package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAccessibleTextSelection extends XInterface {
  val SelectedPortionCount: Double = js.native
  def addSelection(selectionIndex: Double, startOffset: Double, endOffset: Double): Double = js.native
  def getSelectedPortionCount(): Double = js.native
  def getSeletedPositionEnd(nSelectedPortionIndex: Double): Double = js.native
  def getSeletedPositionStart(nSelectedPortionIndex: Double): Double = js.native
  def removeSelection(selectionIndex: Double): Boolean = js.native
  def scrollToPosition(aPoint: Point, isLeftTop: Boolean): Boolean = js.native
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
  implicit class XAccessibleTextSelectionOps[Self <: XAccessibleTextSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectedPortionCount(value: Double): Self = this.set("SelectedPortionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddSelection(value: (Double, Double, Double) => Double): Self = this.set("addSelection", js.Any.fromFunction3(value))
    @scala.inline
    def setGetSelectedPortionCount(value: () => Double): Self = this.set("getSelectedPortionCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSeletedPositionEnd(value: Double => Double): Self = this.set("getSeletedPositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSeletedPositionStart(value: Double => Double): Self = this.set("getSeletedPositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSelection(value: Double => Boolean): Self = this.set("removeSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollToPosition(value: (Point, Boolean) => Boolean): Self = this.set("scrollToPosition", js.Any.fromFunction2(value))
  }
  
}

