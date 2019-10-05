package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFunctionsRequest extends js.Object {
  /**
    * Set to ALL to include entries for all published versions of each function.
    */
  var FunctionVersion: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.FunctionVersion] = js.undefined
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * For Lambda@Edge functions, the AWS Region of the master function. For example, us-east-2 or ALL. If specified, you must set FunctionVersion to ALL.
    */
  var MasterRegion: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.MasterRegion] = js.undefined
  /**
    * Specify a value between 1 and 50 to limit the number of functions in the response.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}

object ListFunctionsRequest {
  @scala.inline
  def apply(
    FunctionVersion: FunctionVersion = null,
    Marker: String = null,
    MasterRegion: MasterRegion = null,
    MaxItems: Int | Double = null
  ): ListFunctionsRequest = {
    val __obj = js.Dynamic.literal()
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MasterRegion != null) __obj.updateDynamic("MasterRegion")(MasterRegion)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionsRequest]
  }
}

