package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParametersByPathRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Filters to limit the request results.  You can't filter using the parameter name. 
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
  /**
    * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: /Finance/Prod/IAD/WinServ2016/license33 
    */
  var Path: PSParameterName
  /**
    * Retrieve all parameters within a hierarchy.  If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path /a, then the user can also access /a/b. Even if a user has explicitly been denied access in IAM for parameter /a/b, they can still call the GetParametersByPath API action recursively for /a and view /a/b. 
    */
  var Recursive: js.UndefOr[Boolean] = js.undefined
  /**
    * Retrieve all parameters in a hierarchy with their value decrypted.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}

object GetParametersByPathRequest {
  @scala.inline
  def apply(
    Path: PSParameterName,
    MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined,
    NextToken: NextToken = null,
    ParameterFilters: ParameterStringFilterList = null,
    Recursive: js.UndefOr[Boolean] = js.undefined,
    WithDecryption: js.UndefOr[Boolean] = js.undefined
  ): GetParametersByPathRequest = {
    val __obj = js.Dynamic.literal(Path = Path)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ParameterFilters != null) __obj.updateDynamic("ParameterFilters")(ParameterFilters)
    if (!js.isUndefined(Recursive)) __obj.updateDynamic("Recursive")(Recursive)
    if (!js.isUndefined(WithDecryption)) __obj.updateDynamic("WithDecryption")(WithDecryption)
    __obj.asInstanceOf[GetParametersByPathRequest]
  }
}

