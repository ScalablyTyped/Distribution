package typings.awsDashSdk.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * A unique identifier for the entity that made the call. For Time To Live, the principalId is "dynamodb.amazonaws.com".
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
  /**
    * The type of the identity. For Time To Live, the type is "Service".
    */
  var Type: js.UndefOr[String] = js.undefined
}

object Identity {
  @scala.inline
  def apply(PrincipalId: String = null, Type: String = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Identity]
  }
}

