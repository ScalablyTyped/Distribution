package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeMetadata extends js.Object {
  /**
    * The date and time when the thing type was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the thing type was deprecated.
    */
  var deprecationDate: js.UndefOr[DeprecationDate] = js.undefined
}

object ThingTypeMetadata {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    deprecationDate: DeprecationDate = null
  ): ThingTypeMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (deprecationDate != null) __obj.updateDynamic("deprecationDate")(deprecationDate)
    __obj.asInstanceOf[ThingTypeMetadata]
  }
}

