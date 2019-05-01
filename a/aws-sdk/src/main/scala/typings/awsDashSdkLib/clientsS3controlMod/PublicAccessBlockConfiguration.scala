package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicAccessBlockConfiguration extends js.Object {
  /**
    * 
    */
  var BlockPublicAcls: js.UndefOr[Setting] = js.undefined
  /**
    * 
    */
  var BlockPublicPolicy: js.UndefOr[Setting] = js.undefined
  /**
    * 
    */
  var IgnorePublicAcls: js.UndefOr[Setting] = js.undefined
  /**
    * 
    */
  var RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
}

object PublicAccessBlockConfiguration {
  @scala.inline
  def apply(
    BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
    BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
    IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
    RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
  ): PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockPublicAcls)) __obj.updateDynamic("BlockPublicAcls")(BlockPublicAcls)
    if (!js.isUndefined(BlockPublicPolicy)) __obj.updateDynamic("BlockPublicPolicy")(BlockPublicPolicy)
    if (!js.isUndefined(IgnorePublicAcls)) __obj.updateDynamic("IgnorePublicAcls")(IgnorePublicAcls)
    if (!js.isUndefined(RestrictPublicBuckets)) __obj.updateDynamic("RestrictPublicBuckets")(RestrictPublicBuckets)
    __obj.asInstanceOf[PublicAccessBlockConfiguration]
  }
}

