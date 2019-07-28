package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCopyProductStatusInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The token for the copy product operation. This token is returned by CopyProduct.
    */
  var CopyProductToken: Id
}

object DescribeCopyProductStatusInput {
  @scala.inline
  def apply(CopyProductToken: Id, AcceptLanguage: AcceptLanguage = null): DescribeCopyProductStatusInput = {
    val __obj = js.Dynamic.literal(CopyProductToken = CopyProductToken)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DescribeCopyProductStatusInput]
  }
}

