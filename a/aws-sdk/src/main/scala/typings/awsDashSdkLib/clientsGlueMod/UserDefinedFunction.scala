package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunction extends js.Object {
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.undefined
  /**
    * The time at which the function was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.undefined
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

object UserDefinedFunction {
  @scala.inline
  def apply(
    ClassName: NameString = null,
    CreateTime: Timestamp = null,
    FunctionName: NameString = null,
    OwnerName: NameString = null,
    OwnerType: PrincipalType = null,
    ResourceUris: ResourceUriList = null
  ): UserDefinedFunction = {
    val __obj = js.Dynamic.literal()
    if (ClassName != null) __obj.updateDynamic("ClassName")(ClassName)
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName)
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName)
    if (OwnerType != null) __obj.updateDynamic("OwnerType")(OwnerType.asInstanceOf[js.Any])
    if (ResourceUris != null) __obj.updateDynamic("ResourceUris")(ResourceUris)
    __obj.asInstanceOf[UserDefinedFunction]
  }
}

