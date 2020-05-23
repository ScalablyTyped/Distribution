package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyNames extends SendValuesBaseOptions {
  var onlyNames: js.Array[String]
}

object OnlyNames {
  @scala.inline
  def apply(onlyNames: js.Array[String]): OnlyNames = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyNames]
  }
}

