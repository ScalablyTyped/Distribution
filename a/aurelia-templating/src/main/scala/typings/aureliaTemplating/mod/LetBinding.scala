package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.Expression
import typings.aureliaBinding.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetBinding extends js.Object {
  
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit = js.native
  
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: Expression = js.native
  
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit = js.native
  
  /**
    * Assigns a value to the target.
    */
  def updateTarget(value: js.Any): Unit = js.native
}
object LetBinding {
  
  @scala.inline
  def apply(
    bind: Scope => Unit,
    sourceExpression: Expression,
    unbind: () => Unit,
    updateTarget: js.Any => Unit
  ): LetBinding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), sourceExpression = sourceExpression.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind), updateTarget = js.Any.fromFunction1(updateTarget))
    __obj.asInstanceOf[LetBinding]
  }
  
  @scala.inline
  implicit class LetBindingOps[Self <: LetBinding] (val x: Self) extends AnyVal {
    
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
    def setBind(value: Scope => Unit): Self = this.set("bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSourceExpression(value: Expression): Self = this.set("sourceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = this.set("unbind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateTarget(value: js.Any => Unit): Self = this.set("updateTarget", js.Any.fromFunction1(value))
  }
}
