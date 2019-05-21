package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPackagingConfigurationsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * A list of MediaPackage VOD PackagingConfiguration resources.
    */
  var PackagingConfigurations: js.UndefOr[__listOfPackagingConfiguration] = js.undefined
}

object ListPackagingConfigurationsResponse {
  @scala.inline
  def apply(NextToken: __string = null, PackagingConfigurations: __listOfPackagingConfiguration = null): ListPackagingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PackagingConfigurations != null) __obj.updateDynamic("PackagingConfigurations")(PackagingConfigurations)
    __obj.asInstanceOf[ListPackagingConfigurationsResponse]
  }
}

