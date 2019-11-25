package typings.apolloDashEngineDashReporting

import typings.apolloDashEngineDashReporting.distAgentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlyNames extends SendValuesBaseOptions {
  var onlyNames: js.Array[String]
}

object Anon_OnlyNames {
  @scala.inline
  def apply(onlyNames: js.Array[String]): Anon_OnlyNames = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OnlyNames]
  }
}

