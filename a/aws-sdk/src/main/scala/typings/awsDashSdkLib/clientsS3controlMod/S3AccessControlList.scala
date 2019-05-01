package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3AccessControlList extends js.Object {
  /**
    * 
    */
  var Grants: js.UndefOr[S3GrantList] = js.undefined
  /**
    * 
    */
  var Owner: S3ObjectOwner
}

object S3AccessControlList {
  @scala.inline
  def apply(Owner: S3ObjectOwner, Grants: S3GrantList = null): S3AccessControlList = {
    val __obj = js.Dynamic.literal(Owner = Owner)
    if (Grants != null) __obj.updateDynamic("Grants")(Grants)
    __obj.asInstanceOf[S3AccessControlList]
  }
}

