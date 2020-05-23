package typings.angularMeteor.anon

import typings.angularMeteor.mod.meteor.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bind extends js.Object {
  /**
    * @param scope - The scope the document will be bound to.
    * @param model - The name of the scope's model variable that the document will be bound to.
    */
  def bind(scope: IScope, model: String): Unit
}

object Bind {
  @scala.inline
  def apply(bind: (IScope, String) => Unit): Bind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
    __obj.asInstanceOf[Bind]
  }
}

