package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaybeForwardRefExpression[T /* <: Expression */] extends StObject {
  
  /**
    * The unwrapped expression.
    */
  var expression: T
  
  /**
    * Specified whether the `expression` contains a reference to something that has not yet been
    * defined, and whether the expression is still wrapped in a `forwardRef()` call.
    *
    * If this value is `ForwardRefHandling.None` then the `expression` is safe to use as-is.
    *
    * Otherwise the `expression` was wrapped in a call to `forwardRef()` and must not be eagerly
    * evaluated. Instead it must be wrapped in a function closure that will be evaluated lazily to
    * allow the definition of the expression to be evaluated first.
    *
    * In full AOT compilation it can be safe to unwrap the `forwardRef()` call up front if the
    * expression will actually be evaluated lazily inside a function call after the value of
    * `expression` has been defined.
    *
    * But in other cases, such as partial AOT compilation or JIT compilation the expression will be
    * evaluated eagerly in top level code so will need to continue to be wrapped in a `forwardRef()`
    * call.
    *
    */
  var forwardRef: ForwardRefHandling
}
object MaybeForwardRefExpression {
  
  inline def apply[T /* <: Expression */](expression: T, forwardRef: ForwardRefHandling): MaybeForwardRefExpression[T] = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], forwardRef = forwardRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeForwardRefExpression[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaybeForwardRefExpression[?], T /* <: Expression */] (val x: Self & MaybeForwardRefExpression[T]) extends AnyVal {
    
    inline def setExpression(value: T): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setForwardRef(value: ForwardRefHandling): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
  }
}
