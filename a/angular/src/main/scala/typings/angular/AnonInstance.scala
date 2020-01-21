package typings.angular

import typings.angular.mod.IController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstance extends js.Object {
  var instance: IController
}

object AnonInstance {
  @scala.inline
  def apply(instance: IController): AnonInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInstance]
  }
}

