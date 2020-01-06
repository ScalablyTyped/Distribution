package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationId extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[__integer] = js.native
}

object ConfigurationId {
  @scala.inline
  def apply(Id: __string = null, Revision: Int | Double = null): ConfigurationId = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Revision != null) __obj.updateDynamic("Revision")(Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationId]
  }
}

