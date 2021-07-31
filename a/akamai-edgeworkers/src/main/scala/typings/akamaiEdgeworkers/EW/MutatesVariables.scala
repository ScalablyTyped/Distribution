package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutatesVariables extends StObject {
  
  /**
    * Sets the value of a metadata variable, throwing an error if the
    * variable name does not start with 'PMUSER_'
    */
  def setVariable(name: String, value: String): Unit
}
object MutatesVariables {
  
  @scala.inline
  def apply(setVariable: (String, String) => Unit): MutatesVariables = {
    val __obj = js.Dynamic.literal(setVariable = js.Any.fromFunction2(setVariable))
    __obj.asInstanceOf[MutatesVariables]
  }
  
  @scala.inline
  implicit class MutatesVariablesMutableBuilder[Self <: MutatesVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetVariable(value: (String, String) => Unit): Self = StObject.set(x, "setVariable", js.Any.fromFunction2(value))
  }
}
