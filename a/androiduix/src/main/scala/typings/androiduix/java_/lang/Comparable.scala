package typings.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparable[T] extends js.Object {
  
  def compareTo(o: T): Double = js.native
}
object Comparable {
  
  @scala.inline
  def apply[T](compareTo: T => Double): Comparable[T] = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo))
    __obj.asInstanceOf[Comparable[T]]
  }
  
  @scala.inline
  implicit class ComparableOps[Self <: Comparable[_], T] (val x: Self with Comparable[T]) extends AnyVal {
    
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
    def setCompareTo(value: T => Double): Self = this.set("compareTo", js.Any.fromFunction1(value))
  }
}
