package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProvisioningArtifactsInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The product identifier.
    */
  var ProductId: Id
}

object ListProvisioningArtifactsInput {
  @scala.inline
  def apply(ProductId: Id, AcceptLanguage: AcceptLanguage = null): ListProvisioningArtifactsInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[ListProvisioningArtifactsInput]
  }
}

