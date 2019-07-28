package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConstraintInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The identifier of the constraint.
    */
  var Id: typings.awsDashSdk.clientsServicecatalogMod.Id
}

object DeleteConstraintInput {
  @scala.inline
  def apply(Id: Id, AcceptLanguage: AcceptLanguage = null): DeleteConstraintInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DeleteConstraintInput]
  }
}

