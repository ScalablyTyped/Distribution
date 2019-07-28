package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  /**
    * Specify one or more ExtendedKeyUsage extension values.
    */
  var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.undefined
  /**
    * Specify one or more algorithms that can be used to generate key pairs.
    */
  var keyTypes: js.UndefOr[KeyAlgorithmList] = js.undefined
  /**
    * Specify one or more KeyUsage extension values.
    */
  var keyUsage: js.UndefOr[KeyUsageFilterList] = js.undefined
}

object Filters {
  @scala.inline
  def apply(
    extendedKeyUsage: ExtendedKeyUsageFilterList = null,
    keyTypes: KeyAlgorithmList = null,
    keyUsage: KeyUsageFilterList = null
  ): Filters = {
    val __obj = js.Dynamic.literal()
    if (extendedKeyUsage != null) __obj.updateDynamic("extendedKeyUsage")(extendedKeyUsage)
    if (keyTypes != null) __obj.updateDynamic("keyTypes")(keyTypes)
    if (keyUsage != null) __obj.updateDynamic("keyUsage")(keyUsage)
    __obj.asInstanceOf[Filters]
  }
}

