package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationId extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[__integer] = js.undefined
}

object ConfigurationId {
  @scala.inline
  def apply(Id: __string = null, Revision: js.UndefOr[__integer] = js.undefined): ConfigurationId = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(Revision)) __obj.updateDynamic("Revision")(Revision)
    __obj.asInstanceOf[ConfigurationId]
  }
}

