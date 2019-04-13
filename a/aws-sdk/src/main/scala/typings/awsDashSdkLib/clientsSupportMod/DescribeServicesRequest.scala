package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServicesRequest extends js.Object {
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * A JSON-formatted list of service codes available for AWS services.
    */
  var serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined
}

object DescribeServicesRequest {
  @scala.inline
  def apply(language: Language = null, serviceCodeList: ServiceCodeList = null): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (serviceCodeList != null) __obj.updateDynamic("serviceCodeList")(serviceCodeList)
    __obj.asInstanceOf[DescribeServicesRequest]
  }
}

