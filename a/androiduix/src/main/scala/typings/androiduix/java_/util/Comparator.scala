package typings.androiduix.java_.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparator[T] extends js.Object {
  
  def compare(o1: T, o2: T): Double = js.native
}
object Comparator {
  
  @scala.inline
  def apply[T](compare: (T, T) => Double): Comparator[T] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
    __obj.asInstanceOf[Comparator[T]]
  }
  
  @scala.inline
  implicit class ComparatorOps[Self <: Comparator[_], T] (val x: Self with Comparator[T]) extends AnyVal {
    
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
    def setCompare(value: (T, T) => Double): Self = this.set("compare", js.Any.fromFunction2(value))
  }
}
