package typings.antvDataSet.imputeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imputations extends js.Object {
  
  def max(row: js.Any, values: js.Array[_]): Double = js.native
  
  def mean(row: js.Any, values: js.Array[_]): Double = js.native
  
  def median(row: js.Any, values: js.Array[_]): Double = js.native
  
  def min(row: js.Any, values: js.Array[_]): Double = js.native
  
  def value(row: js.Any, values: js.Array[_], value: js.Any): js.Any = js.native
}
object Imputations {
  
  @scala.inline
  def apply(
    max: (js.Any, js.Array[_]) => Double,
    mean: (js.Any, js.Array[_]) => Double,
    median: (js.Any, js.Array[_]) => Double,
    min: (js.Any, js.Array[_]) => Double,
    value: (js.Any, js.Array[_], js.Any) => js.Any
  ): Imputations = {
    val __obj = js.Dynamic.literal(max = js.Any.fromFunction2(max), mean = js.Any.fromFunction2(mean), median = js.Any.fromFunction2(median), min = js.Any.fromFunction2(min), value = js.Any.fromFunction3(value))
    __obj.asInstanceOf[Imputations]
  }
  
  @scala.inline
  implicit class ImputationsOps[Self <: Imputations] (val x: Self) extends AnyVal {
    
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
    def setMax(value: (js.Any, js.Array[_]) => Double): Self = this.set("max", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMean(value: (js.Any, js.Array[_]) => Double): Self = this.set("mean", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMedian(value: (js.Any, js.Array[_]) => Double): Self = this.set("median", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMin(value: (js.Any, js.Array[_]) => Double): Self = this.set("min", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValue(value: (js.Any, js.Array[_], js.Any) => js.Any): Self = this.set("value", js.Any.fromFunction3(value))
  }
}
