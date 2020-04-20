package typings.apolloEngineReporting

import typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyNames extends SendValuesBaseOptions {
  var onlyNames: js.Array[String]
}

object AnonOnlyNames {
  @scala.inline
  def apply(onlyNames: js.Array[String]): AnonOnlyNames = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyNames]
  }
}

