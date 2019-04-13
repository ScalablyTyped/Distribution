package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlTranslation extends js.Object {
  /**
    * The override value for the owner of the replica object.
    */
  var Owner: OwnerOverride
}

object AccessControlTranslation {
  @scala.inline
  def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessControlTranslation]
  }
}

