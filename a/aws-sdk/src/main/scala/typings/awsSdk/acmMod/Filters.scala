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
  def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtendedKeyUsageVarargs(value: ExtendedKeyUsageName*): Self = this.set("extendedKeyUsage", js.Array(value :_*))
    @scala.inline
    def setExtendedKeyUsage(value: ExtendedKeyUsageFilterList): Self = this.set("extendedKeyUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedKeyUsage: Self = this.set("extendedKeyUsage", js.undefined)
    @scala.inline
    def setKeyTypesVarargs(value: KeyAlgorithm*): Self = this.set("keyTypes", js.Array(value :_*))
    @scala.inline
    def setKeyTypes(value: KeyAlgorithmList): Self = this.set("keyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyTypes: Self = this.set("keyTypes", js.undefined)
    @scala.inline
    def setKeyUsageVarargs(value: KeyUsageName*): Self = this.set("keyUsage", js.Array(value :_*))
    @scala.inline
    def setKeyUsage(value: KeyUsageFilterList): Self = this.set("keyUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyUsage: Self = this.set("keyUsage", js.undefined)
  }
  
}

