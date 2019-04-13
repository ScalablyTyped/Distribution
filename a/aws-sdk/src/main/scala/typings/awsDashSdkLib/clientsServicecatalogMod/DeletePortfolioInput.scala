package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The portfolio identifier.
    */
  var Id: awsDashSdkLib.clientsServicecatalogMod.Id
}

object DeletePortfolioInput {
  @scala.inline
  def apply(Id: Id, AcceptLanguage: AcceptLanguage = null): DeletePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DeletePortfolioInput]
  }
}

