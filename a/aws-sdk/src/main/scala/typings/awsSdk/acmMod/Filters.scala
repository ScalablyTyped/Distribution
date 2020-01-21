package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /**
    * Specify one or more ExtendedKeyUsage extension values.
    */
  var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.native
  /**
    * Specify one or more algorithms that can be used to generate key pairs. Default filtering returns only RSA_2048 certificates. To return other certificate types, provide the desired type signatures in a comma-separated list. For example, "keyTypes": ["RSA_2048,RSA_4096"] returns both RSA_2048 and RSA_4096 certificates.
    */
  var keyTypes: js.UndefOr[KeyAlgorithmList] = js.native
  /**
    * Specify one or more KeyUsage extension values.
    */
  var keyUsage: js.UndefOr[KeyUsageFilterList] = js.native
}

object Filters {
  @scala.inline
  def apply(
    extendedKeyUsage: ExtendedKeyUsageFilterList = null,
    keyTypes: KeyAlgorithmList = null,
    keyUsage: KeyUsageFilterList = null
  ): Filters = {
    val __obj = js.Dynamic.literal()
    if (extendedKeyUsage != null) __obj.updateDynamic("extendedKeyUsage")(extendedKeyUsage.asInstanceOf[js.Any])
    if (keyTypes != null) __obj.updateDynamic("keyTypes")(keyTypes.asInstanceOf[js.Any])
    if (keyUsage != null) __obj.updateDynamic("keyUsage")(keyUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
}

