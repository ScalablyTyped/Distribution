package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutatesVariables extends js.Object {
  /**
    * Sets the value of a metadata variable, throwing an error if the
    * variable name does not start with 'PMUSER_'
    */
  def setVariable(name: String, value: String): Unit = js.native
}

object MutatesVariables {
  @scala.inline
  def apply(setVariable: (String, String) => Unit): MutatesVariables = {
    val __obj = js.Dynamic.literal(setVariable = js.Any.fromFunction2(setVariable))
    __obj.asInstanceOf[MutatesVariables]
  }
  @scala.inline
  implicit class MutatesVariablesOps[Self <: MutatesVariables] (val x: Self) extends AnyVal {
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
    def setSetVariable(value: (String, String) => Unit): Self = this.set("setVariable", js.Any.fromFunction2(value))
  }
  
}

