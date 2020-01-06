package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesRequest extends js.Object {
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * A JSON-formatted list of service codes available for AWS services.
    */
  var serviceCodeList: js.UndefOr[ServiceCodeList] = js.native
}

object DescribeServicesRequest {
  @scala.inline
  def apply(language: Language = null, serviceCodeList: ServiceCodeList = null): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (serviceCodeList != null) __obj.updateDynamic("serviceCodeList")(serviceCodeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServicesRequest]
  }
}

