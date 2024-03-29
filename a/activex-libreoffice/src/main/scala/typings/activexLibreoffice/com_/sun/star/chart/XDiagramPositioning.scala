package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allow for different positioning options for a diagram
  * @see Diagram
  */
trait XDiagramPositioning
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
    acquire: () => Unit,
    calculateDiagramPositionExcludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => Rectangle,
    isAutomaticDiagramPositioning: () => Boolean,
    isExcludingDiagramPositioning: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setAutomaticDiagramPositioning: () => Unit,
    setDiagramPositionExcludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Unit
  ): XDiagramPositioning = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles))
    __obj.asInstanceOf[XDiagramPositioning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDiagramPositioning] (val x: Self) extends AnyVal {
    
    inline def setCalculateDiagramPositionExcludingAxes(value: () => Rectangle): Self = StObject.set(x, "calculateDiagramPositionExcludingAxes", js.Any.fromFunction0(value))
    
    inline def setCalculateDiagramPositionIncludingAxes(value: () => Rectangle): Self = StObject.set(x, "calculateDiagramPositionIncludingAxes", js.Any.fromFunction0(value))
    
    inline def setCalculateDiagramPositionIncludingAxesAndAxisTitles(value: () => Rectangle): Self = StObject.set(x, "calculateDiagramPositionIncludingAxesAndAxisTitles", js.Any.fromFunction0(value))
    
    inline def setIsAutomaticDiagramPositioning(value: () => Boolean): Self = StObject.set(x, "isAutomaticDiagramPositioning", js.Any.fromFunction0(value))
    
    inline def setIsExcludingDiagramPositioning(value: () => Boolean): Self = StObject.set(x, "isExcludingDiagramPositioning", js.Any.fromFunction0(value))
    
    inline def setSetAutomaticDiagramPositioning(value: () => Unit): Self = StObject.set(x, "setAutomaticDiagramPositioning", js.Any.fromFunction0(value))
    
    inline def setSetDiagramPositionExcludingAxes(value: Rectangle => Unit): Self = StObject.set(x, "setDiagramPositionExcludingAxes", js.Any.fromFunction1(value))
    
    inline def setSetDiagramPositionIncludingAxes(value: Rectangle => Unit): Self = StObject.set(x, "setDiagramPositionIncludingAxes", js.Any.fromFunction1(value))
    
    inline def setSetDiagramPositionIncludingAxesAndAxisTitles(value: Rectangle => Unit): Self = StObject.set(x, "setDiagramPositionIncludingAxesAndAxisTitles", js.Any.fromFunction1(value))
  }
}
