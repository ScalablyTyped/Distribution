package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsConfigurationType extends js.Object {
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var ApplicationId: HexStringType
  /**
    * The external ID.
    */
  var ExternalId: StringType
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var RoleArn: ArnType
  /**
    * If UserDataShared is true, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var UserDataShared: js.UndefOr[BooleanType] = js.undefined
}

object AnalyticsConfigurationType {
  @scala.inline
  def apply(
    ApplicationId: HexStringType,
    ExternalId: StringType,
    RoleArn: ArnType,
    UserDataShared: js.UndefOr[BooleanType] = js.undefined
  ): AnalyticsConfigurationType = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, ExternalId = ExternalId, RoleArn = RoleArn)
    if (!js.isUndefined(UserDataShared)) __obj.updateDynamic("UserDataShared")(UserDataShared)
    __obj.asInstanceOf[AnalyticsConfigurationType]
  }
}

