package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineVersion extends js.Object {
  /**
    * Id for the version.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object EngineVersion {
  @scala.inline
  def apply(Name: __string = null): EngineVersion = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[EngineVersion]
  }
}

