package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Grantee extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.native
}

object S3Grantee {
  @scala.inline
  def apply(
    DisplayName: NonEmptyMaxLength1024String = null,
    Identifier: NonEmptyMaxLength1024String = null,
    TypeIdentifier: S3GranteeTypeIdentifier = null
  ): S3Grantee = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (TypeIdentifier != null) __obj.updateDynamic("TypeIdentifier")(TypeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Grantee]
  }
}

