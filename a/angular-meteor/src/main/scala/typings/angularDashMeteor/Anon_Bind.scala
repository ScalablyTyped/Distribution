package typings.angularDashMeteor

import typings.angularDashMeteor.angularMod.meteorNs.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bind extends js.Object {
  /**
    * @param scope - The scope the document will be bound to.
    * @param model - The name of the scope's model variable that the document will be bound to.
    */
  def bind(scope: IScope, model: String): Unit
}

object Anon_Bind {
  @scala.inline
  def apply(bind: (IScope, String) => Unit): Anon_Bind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
  
    __obj.asInstanceOf[Anon_Bind]
  }
}

