package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionInfo extends js.Object {
  /** Unique string ID for this option. */
  var key: String
  /** Synonyms that can be used by the user to indicate this option if they do not use the key. */
  var synonyms: js.Array[String]
}

object OptionInfo {
  @scala.inline
  def apply(key: String, synonyms: js.Array[String]): OptionInfo = {
    val __obj = js.Dynamic.literal(key = key, synonyms = synonyms)
  
    __obj.asInstanceOf[OptionInfo]
  }
}

