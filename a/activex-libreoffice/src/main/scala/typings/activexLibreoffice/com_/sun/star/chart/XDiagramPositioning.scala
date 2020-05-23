package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allow for different positioning options for a diagram
  * @see Diagram
  */
trait XDiagramPositioning extends XInterface {
  /** @returns the position rectangle of the inner diagram part excluding any axes, labels and titles. Position and size are given in 100/th mm. It might be nec */
  def calculateDiagramPositionExcludingAxes(): Rectangle
  /** @returns the position rectangle of the diagram including the axes and axes labels, but excluding the axes titles. Position and size are given in 100/th mm */
  def calculateDiagramPositionIncludingAxes(): Rectangle
  /** @returns the position rectangle of the diagram including the axes, axes labels and axes titles. Position and size are given in 100/th mm. It might be nece */
  def calculateDiagramPositionIncludingAxesAndAxisTitles(): Rectangle
  /** @returns whether the diagram is placed automatically */
  def isAutomaticDiagramPositioning(): Boolean
  /** @returns true in case the diagram position was set with method setDiagramPositionExcludingAxes */
  def isExcludingDiagramPositioning(): Boolean
  /** the diagram will be placed automatically */
  def setAutomaticDiagramPositioning(): Unit
  /**
    * place the inner diagram part excluding any axes, labels and titles
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionExcludingAxes(PositionRect: Rectangle): Unit
  /**
    * place the outer diagram part including the axes and axes labels, but excluding the axes titles.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxes(PositionRect: Rectangle): Unit
  /**
    * place the diagram including the axes, axes labels and axes titles. For the placement the current axis titles are taken into account, so the titles
    * must be initialized properly before this method is called.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxesAndAxisTitles(PositionRect: Rectangle): Unit
}

object XDiagramPositioning {
  @scala.inline
  def apply(
    acquire: () => Unit,
    calculateDiagramPositionExcludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => Rectangle,
    isAutomaticDiagramPositioning: () => Boolean,
    isExcludingDiagramPositioning: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAutomaticDiagramPositioning: () => Unit,
    setDiagramPositionExcludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Unit
  ): XDiagramPositioning = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles))
    __obj.asInstanceOf[XDiagramPositioning]
  }
}

