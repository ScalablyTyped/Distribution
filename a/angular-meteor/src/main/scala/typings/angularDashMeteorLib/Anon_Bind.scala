package typings
package angularDashMeteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bind extends js.Object {
  /**
    * @param scope - The scope the document will be bound to.
    * @param model - The name of the scope's model variable that the document will be bound to.
    */
  def bind(scope: angularDashMeteorLib.angularMod.meteorNs.IScope, model: java.lang.String): scala.Unit
}

object Anon_Bind {
  @scala.inline
  def apply(bind: js.Function2[angularDashMeteorLib.angularMod.meteorNs.IScope, java.lang.String, scala.Unit]): Anon_Bind = {
    val __obj = js.Dynamic.literal(bind = bind)
  
    __obj.asInstanceOf[Anon_Bind]
  }
}

