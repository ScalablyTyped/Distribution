package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.Expression
import typings.aureliaBinding.mod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetBinding extends StObject {
  
  /**
  	 * Connects the binding to a scope.
  	 */
  def bind(source: Scope): Unit
  
  var isBound: Boolean
  
  var source: Scope
  
  /**
  	 * The expression to access/assign/connect the binding source property.
  	 */
  var sourceExpression: Expression
  
  /**
  	 * Disconnects the binding from a scope.
  	 */
  def unbind(): Unit
  
  /**
  	 * Assigns a value to the target.
  	 */
  def updateTarget(value: Any): Unit
}
object LetBinding {
  
  inline def apply(
    bind: Scope => Unit,
    isBound: Boolean,
    source: Scope,
    sourceExpression: Expression,
    unbind: () => Unit,
    updateTarget: Any => Unit
  ): LetBinding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceExpression = sourceExpression.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind), updateTarget = js.Any.fromFunction1(updateTarget))
    __obj.asInstanceOf[LetBinding]
  }
  
  extension [Self <: LetBinding](x: Self) {
    
    inline def setBind(value: Scope => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setIsBound(value: Boolean): Self = StObject.set(x, "isBound", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Scope): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceExpression(value: Expression): Self = StObject.set(x, "sourceExpression", value.asInstanceOf[js.Any])
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    
    inline def setUpdateTarget(value: Any => Unit): Self = StObject.set(x, "updateTarget", js.Any.fromFunction1(value))
  }
}
