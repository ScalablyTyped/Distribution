package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIndexFieldsRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  /**
    * A list of the index fields you want to describe. If not specified, information is returned for all configured index fields.
    */
  var FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined
}

object DescribeIndexFieldsRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    Deployed: js.UndefOr[Boolean] = js.undefined,
    FieldNames: DynamicFieldNameList = null
  ): DescribeIndexFieldsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed)
    if (FieldNames != null) __obj.updateDynamic("FieldNames")(FieldNames)
    __obj.asInstanceOf[DescribeIndexFieldsRequest]
  }
}

