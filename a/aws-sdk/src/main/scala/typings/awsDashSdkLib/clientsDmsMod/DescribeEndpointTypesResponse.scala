package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointTypesResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The types of endpoints that are supported.
    */
  var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.undefined
}

object DescribeEndpointTypesResponse {
  @scala.inline
  def apply(Marker: String = null, SupportedEndpointTypes: SupportedEndpointTypeList = null): DescribeEndpointTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (SupportedEndpointTypes != null) __obj.updateDynamic("SupportedEndpointTypes")(SupportedEndpointTypes)
    __obj.asInstanceOf[DescribeEndpointTypesResponse]
  }
}

