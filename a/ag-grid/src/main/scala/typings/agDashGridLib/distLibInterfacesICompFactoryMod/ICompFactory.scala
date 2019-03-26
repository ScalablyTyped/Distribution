package typings
package agDashGridLib.distLibInterfacesICompFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompFactory extends js.Object {
  def create(): agDashGridLib.distLibWidgetsComponentMod.Component
}

object ICompFactory {
  @scala.inline
  def apply(create: () => agDashGridLib.distLibWidgetsComponentMod.Component): ICompFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
  
    __obj.asInstanceOf[ICompFactory]
  }
}

