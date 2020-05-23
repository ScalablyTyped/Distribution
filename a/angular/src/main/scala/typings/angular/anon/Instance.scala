package typings.angular.anon

import typings.angular.mod.IController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var instance: IController
}

object Instance {
  @scala.inline
  def apply(instance: IController): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

