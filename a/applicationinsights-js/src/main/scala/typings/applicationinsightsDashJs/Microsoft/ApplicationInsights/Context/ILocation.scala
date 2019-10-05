package typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocation extends js.Object {
  /**
    * Client IP address for reverse lookup
    */
  var ip: String
}

object ILocation {
  @scala.inline
  def apply(ip: String): ILocation = {
    val __obj = js.Dynamic.literal(ip = ip)
  
    __obj.asInstanceOf[ILocation]
  }
}

