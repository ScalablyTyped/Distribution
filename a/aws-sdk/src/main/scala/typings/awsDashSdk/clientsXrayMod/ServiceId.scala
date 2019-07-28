package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceId extends js.Object {
  /**
    * 
    */
  var AccountId: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var Names: js.UndefOr[ServiceNames] = js.undefined
  /**
    * 
    */
  var Type: js.UndefOr[String] = js.undefined
}

object ServiceId {
  @scala.inline
  def apply(AccountId: String = null, Name: String = null, Names: ServiceNames = null, Type: String = null): ServiceId = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ServiceId]
  }
}

