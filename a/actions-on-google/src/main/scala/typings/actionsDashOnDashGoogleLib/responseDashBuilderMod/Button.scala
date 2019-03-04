package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  /** Action to take when selected. */
  var openUrlAction: actionsDashOnDashGoogleLib.Anon_Url
  /** Text shown on the button. */
  var title: java.lang.String
}

object Button {
  @scala.inline
  def apply(openUrlAction: actionsDashOnDashGoogleLib.Anon_Url, title: java.lang.String): Button = {
    val __obj = js.Dynamic.literal(openUrlAction = openUrlAction, title = title)
  
    __obj.asInstanceOf[Button]
  }
}

