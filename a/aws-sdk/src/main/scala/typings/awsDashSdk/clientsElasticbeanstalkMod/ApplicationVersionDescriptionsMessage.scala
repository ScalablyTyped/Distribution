package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionDescriptionsMessage extends js.Object {
  /**
    * List of ApplicationVersionDescription objects sorted in order of creation.
    */
  var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.undefined
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ApplicationVersionDescriptionsMessage {
  @scala.inline
  def apply(ApplicationVersions: ApplicationVersionDescriptionList = null, NextToken: Token = null): ApplicationVersionDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationVersions != null) __obj.updateDynamic("ApplicationVersions")(ApplicationVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
  }
}

