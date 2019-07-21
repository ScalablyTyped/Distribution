package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOwner extends js.Object {
  /**
  		Name of the app.
  		*/
  var name: java.lang.String
  /**
  		Path to the app.
  		*/
  var path: java.lang.String
  /**
  		Process identifier
  		*/
  var processId: scala.Double
}

object BaseOwner {
  @scala.inline
  def apply(name: java.lang.String, path: java.lang.String, processId: scala.Double): BaseOwner = {
    val __obj = js.Dynamic.literal(name = name, path = path, processId = processId)
  
    __obj.asInstanceOf[BaseOwner]
  }
}

