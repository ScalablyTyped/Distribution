package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorRootCauseService extends js.Object {
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[ErrorRootCauseEntityPath] = js.undefined
  /**
    * A Boolean value indicating if the service is inferred from the trace.
    */
  var Inferred: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The service name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A collection of associated service names.
    */
  var Names: js.UndefOr[ServiceNames] = js.undefined
  /**
    * The type associated to the service.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object ErrorRootCauseService {
  @scala.inline
  def apply(
    AccountId: String = null,
    EntityPath: ErrorRootCauseEntityPath = null,
    Inferred: js.UndefOr[NullableBoolean] = js.undefined,
    Name: String = null,
    Names: ServiceNames = null,
    Type: String = null
  ): ErrorRootCauseService = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (EntityPath != null) __obj.updateDynamic("EntityPath")(EntityPath)
    if (!js.isUndefined(Inferred)) __obj.updateDynamic("Inferred")(Inferred)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ErrorRootCauseService]
  }
}

