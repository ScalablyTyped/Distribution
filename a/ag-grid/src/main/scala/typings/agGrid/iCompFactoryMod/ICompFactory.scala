package typings.agGrid.iCompFactoryMod

import typings.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompFactory extends js.Object {
  def create(): Component
}

object ICompFactory {
  @scala.inline
  def apply(create: () => Component): ICompFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[ICompFactory]
  }
}

