package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.Expression
import typings.aureliaBinding.mod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetBinding extends StObject {
  
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
  implicit class LetBindingMutableBuilder[Self <: LetBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: Scope => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSourceExpression(value: Expression): Self = StObject.set(x, "sourceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateTarget(value: js.Any => Unit): Self = StObject.set(x, "updateTarget", js.Any.fromFunction1(value))
  }
}
