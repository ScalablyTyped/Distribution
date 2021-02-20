package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackedIntVector extends StObject {
  
  def adjustValuesBelow(startRow: Double, column: Double, delta: Double): Unit = js.native
  
  def deleteAt(row: Double, count: Double): Unit = js.native
  
  def getValue(row: Double, column: Double): Double = js.native
  
  /* private */ def growBuffer(): js.Any = js.native
  
  def insertAt(row: Double, values: js.Array[Double]): Unit = js.native
  
  var mColumns: js.Any = js.native
  
  var mRowGapLength: js.Any = js.native
  
  var mRowGapStart: js.Any = js.native
  
  var mRows: js.Any = js.native
  
  var mValueGap: js.Any = js.native
  
  var mValues: js.Any = js.native
  
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  
  /* private */ def moveValueGapTo(column: js.Any, where: js.Any): js.Any = js.native
  
  def setValue(row: Double, column: Double, value: Double): Unit = js.native
  
  /* private */ def setValueInternal(row: js.Any, column: js.Any, value: js.Any): js.Any = js.native
  
  def size(): Double = js.native
  
  def width(): Double = js.native
}
object PackedIntVector {
  
  @scala.inline
  def apply(
    adjustValuesBelow: (Double, Double, Double) => Unit,
    deleteAt: (Double, Double) => Unit,
    getValue: (Double, Double) => Double,
    growBuffer: () => js.Any,
    insertAt: (Double, js.Array[Double]) => Unit,
    mColumns: js.Any,
    mRowGapLength: js.Any,
    mRowGapStart: js.Any,
    mRows: js.Any,
    mValueGap: js.Any,
    mValues: js.Any,
    moveRowGapTo: js.Any => js.Any,
    moveValueGapTo: (js.Any, js.Any) => js.Any,
    setValue: (Double, Double, Double) => Unit,
    setValueInternal: (js.Any, js.Any, js.Any) => js.Any,
    size: () => Double,
    width: () => Double
  ): PackedIntVector = {
    val __obj = js.Dynamic.literal(adjustValuesBelow = js.Any.fromFunction3(adjustValuesBelow), deleteAt = js.Any.fromFunction2(deleteAt), getValue = js.Any.fromFunction2(getValue), growBuffer = js.Any.fromFunction0(growBuffer), insertAt = js.Any.fromFunction2(insertAt), mColumns = mColumns.asInstanceOf[js.Any], mRowGapLength = mRowGapLength.asInstanceOf[js.Any], mRowGapStart = mRowGapStart.asInstanceOf[js.Any], mRows = mRows.asInstanceOf[js.Any], mValueGap = mValueGap.asInstanceOf[js.Any], mValues = mValues.asInstanceOf[js.Any], moveRowGapTo = js.Any.fromFunction1(moveRowGapTo), moveValueGapTo = js.Any.fromFunction2(moveValueGapTo), setValue = js.Any.fromFunction3(setValue), setValueInternal = js.Any.fromFunction3(setValueInternal), size = js.Any.fromFunction0(size), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[PackedIntVector]
  }
  
  @scala.inline
  implicit class PackedIntVectorMutableBuilder[Self <: PackedIntVector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustValuesBelow(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "adjustValuesBelow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeleteAt(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValue(value: (Double, Double) => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrowBuffer(value: () => js.Any): Self = StObject.set(x, "growBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertAt(value: (Double, js.Array[Double]) => Unit): Self = StObject.set(x, "insertAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMColumns(value: js.Any): Self = StObject.set(x, "mColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRowGapLength(value: js.Any): Self = StObject.set(x, "mRowGapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRowGapStart(value: js.Any): Self = StObject.set(x, "mRowGapStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRows(value: js.Any): Self = StObject.set(x, "mRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMValueGap(value: js.Any): Self = StObject.set(x, "mValueGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMValues(value: js.Any): Self = StObject.set(x, "mValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveRowGapTo(value: js.Any => js.Any): Self = StObject.set(x, "moveRowGapTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveValueGapTo(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "moveValueGapTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetValueInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "setValueInternal", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
  }
}
