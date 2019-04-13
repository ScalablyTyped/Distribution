package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  /**
    * The name of the task list.
    */
  var name: Name
}

object TaskList {
  @scala.inline
  def apply(name: Name): TaskList = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[TaskList]
  }
}

