package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseTimeRootCauseEntity extends js.Object {
  /**
    * The types and messages of the exceptions.
    */
  var Coverage: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.undefined
}

object ResponseTimeRootCauseEntity {
  @scala.inline
  def apply(
    Coverage: js.UndefOr[NullableDouble] = js.undefined,
    Name: String = null,
    Remote: js.UndefOr[NullableBoolean] = js.undefined
  ): ResponseTimeRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Coverage)) __obj.updateDynamic("Coverage")(Coverage)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Remote)) __obj.updateDynamic("Remote")(Remote)
    __obj.asInstanceOf[ResponseTimeRootCauseEntity]
  }
}

