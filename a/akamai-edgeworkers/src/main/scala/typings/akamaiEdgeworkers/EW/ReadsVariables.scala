package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadsVariables extends js.Object {
  /**
    * Get's the value of a request variable
    */
  def getVariable(name: String): js.UndefOr[String]
}

object ReadsVariables {
  @scala.inline
  def apply(getVariable: String => js.UndefOr[String]): ReadsVariables = {
    val __obj = js.Dynamic.literal(getVariable = js.Any.fromFunction1(getVariable))
  
    __obj.asInstanceOf[ReadsVariables]
  }
}

