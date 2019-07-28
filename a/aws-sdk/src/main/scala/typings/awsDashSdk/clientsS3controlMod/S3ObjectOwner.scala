package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ObjectOwner extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var ID: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}

object S3ObjectOwner {
  @scala.inline
  def apply(DisplayName: NonEmptyMaxLength1024String = null, ID: NonEmptyMaxLength1024String = null): S3ObjectOwner = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[S3ObjectOwner]
  }
}

