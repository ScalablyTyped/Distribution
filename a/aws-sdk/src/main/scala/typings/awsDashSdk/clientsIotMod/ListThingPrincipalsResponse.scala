package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingPrincipalsResponse extends js.Object {
  /**
    * The principals associated with the thing.
    */
  var principals: js.UndefOr[Principals] = js.undefined
}

object ListThingPrincipalsResponse {
  @scala.inline
  def apply(principals: Principals = null): ListThingPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    if (principals != null) __obj.updateDynamic("principals")(principals)
    __obj.asInstanceOf[ListThingPrincipalsResponse]
  }
}

