package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionDescriptionsMessage extends js.Object {
  /**
    * List of ApplicationVersionDescription objects sorted in order of creation.
    */
  var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.native
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ApplicationVersionDescriptionsMessage {
  @scala.inline
  def apply(ApplicationVersions: ApplicationVersionDescriptionList = null, NextToken: Token = null): ApplicationVersionDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationVersions != null) __obj.updateDynamic("ApplicationVersions")(ApplicationVersions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
  }
}

