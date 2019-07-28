package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import typings.actionsDashOnDashGoogle.Anon_Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  /** Action to take when selected. */
  var openUrlAction: Anon_Url
  /** Text shown on the button. */
  var title: String
}

object Button {
  @scala.inline
  def apply(openUrlAction: Anon_Url, title: String): Button = {
    val __obj = js.Dynamic.literal(openUrlAction = openUrlAction, title = title)
  
    __obj.asInstanceOf[Button]
  }
}

