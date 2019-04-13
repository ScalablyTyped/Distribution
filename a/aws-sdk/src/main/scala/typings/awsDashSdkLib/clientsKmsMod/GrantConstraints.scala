package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantConstraints extends js.Object {
  /**
    * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
    */
  var EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined
  /**
    * A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
    */
  var EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined
}

object GrantConstraints {
  @scala.inline
  def apply(
    EncryptionContextEquals: EncryptionContextType = null,
    EncryptionContextSubset: EncryptionContextType = null
  ): GrantConstraints = {
    val __obj = js.Dynamic.literal()
    if (EncryptionContextEquals != null) __obj.updateDynamic("EncryptionContextEquals")(EncryptionContextEquals)
    if (EncryptionContextSubset != null) __obj.updateDynamic("EncryptionContextSubset")(EncryptionContextSubset)
    __obj.asInstanceOf[GrantConstraints]
  }
}

