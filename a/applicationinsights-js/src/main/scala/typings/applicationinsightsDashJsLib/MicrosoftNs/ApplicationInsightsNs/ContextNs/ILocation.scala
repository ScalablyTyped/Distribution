package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocation extends js.Object {
  /**
    * Client IP address for reverse lookup
    */
  var ip: java.lang.String
}

object ILocation {
  @scala.inline
  def apply(ip: java.lang.String): ILocation = {
    val __obj = js.Dynamic.literal(ip = ip)
  
    __obj.asInstanceOf[ILocation]
  }
}

