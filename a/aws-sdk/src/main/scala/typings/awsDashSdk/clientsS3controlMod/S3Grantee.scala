package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Grantee extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.undefined
}

object S3Grantee {
  @scala.inline
  def apply(
    DisplayName: NonEmptyMaxLength1024String = null,
    Identifier: NonEmptyMaxLength1024String = null,
    TypeIdentifier: S3GranteeTypeIdentifier = null
  ): S3Grantee = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier)
    if (TypeIdentifier != null) __obj.updateDynamic("TypeIdentifier")(TypeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Grantee]
  }
}

