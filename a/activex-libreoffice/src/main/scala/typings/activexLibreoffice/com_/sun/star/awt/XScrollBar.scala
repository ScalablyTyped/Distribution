package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a scroll bar and makes it possible to register adjustment event listeners. */
@js.native
trait XScrollBar extends XInterface {
  
  /** returns the currently set increment for a block move. */
  var BlockIncrement: Double = js.native
  
  /** returns the currently set increment for a single line move. */
  var LineIncrement: Double = js.native
  
  /** returns the currently set maximum scroll value of the scroll bar. */
  var Maximum: Double = js.native
  
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  var Orientation: Double = js.native
  
  /** returns the current scroll value of the scroll bar. */
  var Value: Double = js.native
  
  /** returns the currently visible size of the scroll bar. */
  var VisibleSize: Double = js.native
  
  /** registers an adjustment event listener. */
  def addAdjustmentListener(l: XAdjustmentListener): Unit = js.native
  
  /** returns the currently set increment for a block move. */
  def getBlockIncrement(): Double = js.native
  
  /** returns the currently set increment for a single line move. */
  def getLineIncrement(): Double = js.native
  
  /** returns the currently set maximum scroll value of the scroll bar. */
  def getMaximum(): Double = js.native
  
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  def getOrientation(): Double = js.native
  
  /** returns the current scroll value of the scroll bar. */
  def getValue(): Double = js.native
  
  /** returns the currently visible size of the scroll bar. */
  def getVisibleSize(): Double = js.native
  
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(l: XAdjustmentListener): Unit = js.native
  
  /** sets the increment for a block move. */
  def setBlockIncrement(n: Double): Unit = js.native
  
  /** sets the increment for a single line move. */
  def setLineIncrement(n: Double): Unit = js.native
  
  /** sets the maximum scroll value of the scroll bar. */
  def setMaximum(n: Double): Unit = js.native
  
  /** sets the {@link ScrollBarOrientation} of the scroll bar. */
  def setOrientation(n: Double): Unit = js.native
  
  /** sets the scroll value of the scroll bar. */
  def setValue(n: Double): Unit = js.native
  
  /** sets the scroll value, visible area and maximum scroll value of the scroll bar. */
  def setValues(nValue: Double, nVisible: Double, nMax: Double): Unit = js.native
  
  /** sets the visible size of the scroll bar. */
  def setVisibleSize(n: Double): Unit = js.native
}
object XScrollBar {
  
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
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
  
  @scala.inline
  implicit class XScrollBarOps[Self <: XScrollBar] (val x: Self) extends AnyVal {
    
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
    def setBlockIncrement(value: Double): Self = this.set("BlockIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineIncrement(value: Double): Self = this.set("LineIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleSize(value: Double): Self = this.set("VisibleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAdjustmentListener(value: XAdjustmentListener => Unit): Self = this.set("addAdjustmentListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBlockIncrement(value: () => Double): Self = this.set("getBlockIncrement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineIncrement(value: () => Double): Self = this.set("getLineIncrement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaximum(value: () => Double): Self = this.set("getMaximum", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrientation(value: () => Double): Self = this.set("getOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => Double): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleSize(value: () => Double): Self = this.set("getVisibleSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAdjustmentListener(value: XAdjustmentListener => Unit): Self = this.set("removeAdjustmentListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBlockIncrement(value: Double => Unit): Self = this.set("setBlockIncrement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLineIncrement(value: Double => Unit): Self = this.set("setLineIncrement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaximum(value: Double => Unit): Self = this.set("setMaximum", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrientation(value: Double => Unit): Self = this.set("setOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: Double => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValues(value: (Double, Double, Double) => Unit): Self = this.set("setValues", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetVisibleSize(value: Double => Unit): Self = this.set("setVisibleSize", js.Any.fromFunction1(value))
  }
}
