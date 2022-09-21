package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a scroll bar and makes it possible to register adjustment event listeners. */
trait XScrollBar
  extends StObject
     with XInterface {
  
  /** returns the currently set increment for a block move. */
  var BlockIncrement: Double
  
  /** returns the currently set increment for a single line move. */
  var LineIncrement: Double
  
  /** returns the currently set maximum scroll value of the scroll bar. */
  var Maximum: Double
  
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  var Orientation: Double
  
  /** returns the current scroll value of the scroll bar. */
  var Value: Double
  
  /** returns the currently visible size of the scroll bar. */
  var VisibleSize: Double
  
  /** registers an adjustment event listener. */
  def addAdjustmentListener(l: XAdjustmentListener): Unit
  
  /** returns the currently set increment for a block move. */
  def getBlockIncrement(): Double
  
  /** returns the currently set increment for a single line move. */
  def getLineIncrement(): Double
  
  /** returns the currently set maximum scroll value of the scroll bar. */
  def getMaximum(): Double
  
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  def getOrientation(): Double
  
  /** returns the current scroll value of the scroll bar. */
  def getValue(): Double
  
  /** returns the currently visible size of the scroll bar. */
  def getVisibleSize(): Double
  
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(l: XAdjustmentListener): Unit
  
  /** sets the increment for a block move. */
  def setBlockIncrement(n: Double): Unit
  
  /** sets the increment for a single line move. */
  def setLineIncrement(n: Double): Unit
  
  /** sets the maximum scroll value of the scroll bar. */
  def setMaximum(n: Double): Unit
  
  /** sets the {@link ScrollBarOrientation} of the scroll bar. */
  def setOrientation(n: Double): Unit
  
  /** sets the scroll value of the scroll bar. */
  def setValue(n: Double): Unit
  
  /** sets the scroll value, visible area and maximum scroll value of the scroll bar. */
  def setValues(nValue: Double, nVisible: Double, nMax: Double): Unit
  
  /** sets the visible size of the scroll bar. */
  def setVisibleSize(n: Double): Unit
}
object XScrollBar {
  
  inline def apply(
    BlockIncrement: Double,
    LineIncrement: Double,
    Maximum: Double,
    Orientation: Double,
    Value: Double,
    VisibleSize: Double,
    acquire: () => Unit,
    addAdjustmentListener: XAdjustmentListener => Unit,
    getBlockIncrement: () => Double,
    getLineIncrement: () => Double,
    getMaximum: () => Double,
    getOrientation: () => Double,
    getValue: () => Double,
    getVisibleSize: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeAdjustmentListener: XAdjustmentListener => Unit,
    setBlockIncrement: Double => Unit,
    setLineIncrement: Double => Unit,
    setMaximum: Double => Unit,
    setOrientation: Double => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit,
    setVisibleSize: Double => Unit
  ): XScrollBar = {
    val __obj = js.Dynamic.literal(BlockIncrement = BlockIncrement.asInstanceOf[js.Any], LineIncrement = LineIncrement.asInstanceOf[js.Any], Maximum = Maximum.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VisibleSize = VisibleSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), getBlockIncrement = js.Any.fromFunction0(getBlockIncrement), getLineIncrement = js.Any.fromFunction0(getLineIncrement), getMaximum = js.Any.fromFunction0(getMaximum), getOrientation = js.Any.fromFunction0(getOrientation), getValue = js.Any.fromFunction0(getValue), getVisibleSize = js.Any.fromFunction0(getVisibleSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), setBlockIncrement = js.Any.fromFunction1(setBlockIncrement), setLineIncrement = js.Any.fromFunction1(setLineIncrement), setMaximum = js.Any.fromFunction1(setMaximum), setOrientation = js.Any.fromFunction1(setOrientation), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisibleSize = js.Any.fromFunction1(setVisibleSize))
    __obj.asInstanceOf[XScrollBar]
  }
  
  extension [Self <: XScrollBar](x: Self) {
    
    inline def setAddAdjustmentListener(value: XAdjustmentListener => Unit): Self = StObject.set(x, "addAdjustmentListener", js.Any.fromFunction1(value))
    
    inline def setBlockIncrement(value: Double): Self = StObject.set(x, "BlockIncrement", value.asInstanceOf[js.Any])
    
    inline def setGetBlockIncrement(value: () => Double): Self = StObject.set(x, "getBlockIncrement", js.Any.fromFunction0(value))
    
    inline def setGetLineIncrement(value: () => Double): Self = StObject.set(x, "getLineIncrement", js.Any.fromFunction0(value))
    
    inline def setGetMaximum(value: () => Double): Self = StObject.set(x, "getMaximum", js.Any.fromFunction0(value))
    
    inline def setGetOrientation(value: () => Double): Self = StObject.set(x, "getOrientation", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetVisibleSize(value: () => Double): Self = StObject.set(x, "getVisibleSize", js.Any.fromFunction0(value))
    
    inline def setLineIncrement(value: Double): Self = StObject.set(x, "LineIncrement", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setRemoveAdjustmentListener(value: XAdjustmentListener => Unit): Self = StObject.set(x, "removeAdjustmentListener", js.Any.fromFunction1(value))
    
    inline def setSetBlockIncrement(value: Double => Unit): Self = StObject.set(x, "setBlockIncrement", js.Any.fromFunction1(value))
    
    inline def setSetLineIncrement(value: Double => Unit): Self = StObject.set(x, "setLineIncrement", js.Any.fromFunction1(value))
    
    inline def setSetMaximum(value: Double => Unit): Self = StObject.set(x, "setMaximum", js.Any.fromFunction1(value))
    
    inline def setSetOrientation(value: Double => Unit): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValues(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction3(value))
    
    inline def setSetVisibleSize(value: Double => Unit): Self = StObject.set(x, "setVisibleSize", js.Any.fromFunction1(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVisibleSize(value: Double): Self = StObject.set(x, "VisibleSize", value.asInstanceOf[js.Any])
  }
}
