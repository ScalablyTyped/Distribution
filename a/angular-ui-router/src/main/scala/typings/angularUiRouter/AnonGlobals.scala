package typings.angularUiRouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobals extends js.Object {
  /**
    * Currently resolved "resolve" values from the current state
    */
  var globals: StringDictionary[js.Any]
}

object AnonGlobals {
  @scala.inline
  def apply(globals: StringDictionary[js.Any]): AnonGlobals = {
    val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlobals]
  }
}

