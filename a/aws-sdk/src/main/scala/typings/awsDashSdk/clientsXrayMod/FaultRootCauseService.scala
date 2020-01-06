package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultRootCauseService extends js.Object {
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.native
  /**
    * A Boolean value indicating if the service is inferred from the trace.
    */
  var Inferred: js.UndefOr[NullableBoolean] = js.native
  /**
    * The service name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A collection of associated service names.
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  /**
    * The type associated to the service.
    */
  var Type: js.UndefOr[String] = js.native
}

object FaultRootCauseService {
  @scala.inline
  def apply(
    AccountId: String = null,
    EntityPath: FaultRootCauseEntityPath = null,
    Inferred: js.UndefOr[scala.Boolean] = js.undefined,
    Name: String = null,
    Names: ServiceNames = null,
    Type: String = null
  ): FaultRootCauseService = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (EntityPath != null) __obj.updateDynamic("EntityPath")(EntityPath.asInstanceOf[js.Any])
    if (!js.isUndefined(Inferred)) __obj.updateDynamic("Inferred")(Inferred.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaultRootCauseService]
  }
}

