package typings.apolloEngineReporting

import typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExceptNames extends SendValuesBaseOptions {
  var exceptNames: js.Array[String]
}

object AnonExceptNames {
  @scala.inline
  def apply(exceptNames: js.Array[String]): AnonExceptNames = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExceptNames]
  }
}

