package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutatesVariables extends js.Object {
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
}

