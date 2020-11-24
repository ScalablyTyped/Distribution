package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repeater extends js.Object {
  
  def column(ngBindingExpression: String): Future = js.native
  
  def count(): Future = js.native
  
  def row(index: Double): Future = js.native
}
object Repeater {
  
  @scala.inline
  def apply(column: String => Future, count: () => Future, row: Double => Future): Repeater = {
    val __obj = js.Dynamic.literal(column = js.Any.fromFunction1(column), count = js.Any.fromFunction0(count), row = js.Any.fromFunction1(row))
    __obj.asInstanceOf[Repeater]
  }
  
  @scala.inline
  implicit class RepeaterOps[Self <: Repeater] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: String => Future): Self = this.set("column", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Future): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRow(value: Double => Future): Self = this.set("row", js.Any.fromFunction1(value))
  }
}
