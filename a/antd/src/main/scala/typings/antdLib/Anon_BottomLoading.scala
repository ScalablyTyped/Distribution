package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomLoading extends js.Object {
  var loading: scala.Boolean
  var multiLines: scala.Boolean
  var notFoundContent: java.lang.String
  var placement: antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom
}

object Anon_BottomLoading {
  @scala.inline
  def apply(
    loading: scala.Boolean,
    multiLines: scala.Boolean,
    notFoundContent: java.lang.String,
    placement: antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom
  ): Anon_BottomLoading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("multiLines")(multiLines)
    __obj.updateDynamic("notFoundContent")(notFoundContent)
    __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomLoading]
  }
}

