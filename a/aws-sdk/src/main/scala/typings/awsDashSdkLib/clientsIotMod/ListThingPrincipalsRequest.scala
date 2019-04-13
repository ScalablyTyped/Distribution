package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingPrincipalsRequest extends js.Object {
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object ListThingPrincipalsRequest {
  @scala.inline
  def apply(thingName: ThingName): ListThingPrincipalsRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
  
    __obj.asInstanceOf[ListThingPrincipalsRequest]
  }
}

