package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadsVariables extends StObject {
  
  /**
    * Gets the value of a metadata variable
    */
  def getVariable(name: String): js.UndefOr[String]
}
object ReadsVariables {
  
  @scala.inline
  def apply(getVariable: String => js.UndefOr[String]): ReadsVariables = {
    val __obj = js.Dynamic.literal(getVariable = js.Any.fromFunction1(getVariable))
    __obj.asInstanceOf[ReadsVariables]
  }
  
  @scala.inline
  implicit class ReadsVariablesMutableBuilder[Self <: ReadsVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVariable(value: String => js.UndefOr[String]): Self = StObject.set(x, "getVariable", js.Any.fromFunction1(value))
  }
}
