package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var Id: typings.awsDashSdk.clientsServicecatalogMod.Id
}

object DeleteServiceActionInput {
  @scala.inline
  def apply(Id: Id, AcceptLanguage: AcceptLanguage = null): DeleteServiceActionInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DeleteServiceActionInput]
  }
}

