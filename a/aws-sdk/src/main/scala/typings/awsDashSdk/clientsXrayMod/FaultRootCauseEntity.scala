package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultRootCauseEntity extends js.Object {
  /**
    * The types and messages of the exceptions.
    */
  var Exceptions: js.UndefOr[RootCauseExceptions] = js.native
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}

object FaultRootCauseEntity {
  @scala.inline
  def apply(
    Exceptions: RootCauseExceptions = null,
    Name: String = null,
    Remote: js.UndefOr[scala.Boolean] = js.undefined
  ): FaultRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    if (Exceptions != null) __obj.updateDynamic("Exceptions")(Exceptions.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Remote)) __obj.updateDynamic("Remote")(Remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaultRootCauseEntity]
  }
}

