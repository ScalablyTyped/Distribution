package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveAliasOutput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet resource that this alias points to. 
    */
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * The fleet identifier that the alias is pointing to.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
}

object ResolveAliasOutput {
  @scala.inline
  def apply(FleetArn: ArnStringModel = null, FleetId: FleetId = null): ResolveAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAliasOutput]
  }
}

