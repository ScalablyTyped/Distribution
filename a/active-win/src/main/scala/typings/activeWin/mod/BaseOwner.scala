package typings.activeWin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOwner extends js.Object {
  /**
  		Name of the app.
  		*/
  var name: String
  /**
  		Path to the app.
  		*/
  var path: String
  /**
  		Process identifier
  		*/
  var processId: Double
}

object BaseOwner {
  @scala.inline
  def apply(name: String, path: String, processId: Double): BaseOwner = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOwner]
  }
}

