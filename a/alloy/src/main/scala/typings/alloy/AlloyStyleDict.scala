package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and TSS classes to apply to a Titanium UI element.
  */
trait AlloyStyleDict
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Array of TSS classes to apply to the Titanium UI object.
    */
  var classes: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * TSS ID style to apply to the Titanium UI object.
    */
  var id: js.UndefOr[String] = js.undefined
}

object AlloyStyleDict {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    classes: js.Array[String] | String = null,
    id: String = null
  ): AlloyStyleDict = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlloyStyleDict]
  }
}

