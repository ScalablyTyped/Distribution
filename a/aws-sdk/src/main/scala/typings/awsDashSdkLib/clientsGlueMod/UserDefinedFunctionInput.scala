package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunctionInput extends js.Object {
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.undefined
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.undefined
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.undefined
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.undefined
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
}

object UserDefinedFunctionInput {
  @scala.inline
  def apply(
    ClassName: NameString = null,
    FunctionName: NameString = null,
    OwnerName: NameString = null,
    OwnerType: PrincipalType = null,
    ResourceUris: ResourceUriList = null
  ): UserDefinedFunctionInput = {
    val __obj = js.Dynamic.literal()
    if (ClassName != null) __obj.updateDynamic("ClassName")(ClassName)
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName)
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName)
    if (OwnerType != null) __obj.updateDynamic("OwnerType")(OwnerType.asInstanceOf[js.Any])
    if (ResourceUris != null) __obj.updateDynamic("ResourceUris")(ResourceUris)
    __obj.asInstanceOf[UserDefinedFunctionInput]
  }
}

