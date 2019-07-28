package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIdentitiesInput extends js.Object {
  /**
    * A list of 1-60 identities that you want to delete.
    */
  var IdentityIdsToDelete: IdentityIdList
}

object DeleteIdentitiesInput {
  @scala.inline
  def apply(IdentityIdsToDelete: IdentityIdList): DeleteIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityIdsToDelete = IdentityIdsToDelete)
  
    __obj.asInstanceOf[DeleteIdentitiesInput]
  }
}

