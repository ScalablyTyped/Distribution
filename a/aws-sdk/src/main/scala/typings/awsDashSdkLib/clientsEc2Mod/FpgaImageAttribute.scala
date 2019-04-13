package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FpgaImageAttribute extends js.Object {
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
  /**
    * One or more load permissions.
    */
  var LoadPermissions: js.UndefOr[LoadPermissionList] = js.undefined
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * One or more product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
}

object FpgaImageAttribute {
  @scala.inline
  def apply(
    Description: String = null,
    FpgaImageId: String = null,
    LoadPermissions: LoadPermissionList = null,
    Name: String = null,
    ProductCodes: ProductCodeList = null
  ): FpgaImageAttribute = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId)
    if (LoadPermissions != null) __obj.updateDynamic("LoadPermissions")(LoadPermissions)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    __obj.asInstanceOf[FpgaImageAttribute]
  }
}

