package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a link.
  * @see XCommandProcessor
  */
trait Link extends js.Object {
  /** contains the destination URI of the link. */
  var Destination: java.lang.String
  /** contains the source URI of the link. */
  var Source: java.lang.String
}

object Link {
  @scala.inline
  def apply(Destination: java.lang.String, Source: java.lang.String): Link = {
    val __obj = js.Dynamic.literal(Destination = Destination, Source = Source)
  
    __obj.asInstanceOf[Link]
  }
}

