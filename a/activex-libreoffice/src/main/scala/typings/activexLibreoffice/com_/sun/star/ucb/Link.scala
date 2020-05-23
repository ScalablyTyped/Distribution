package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a link.
  * @see XCommandProcessor
  */
trait Link extends js.Object {
  /** contains the destination URI of the link. */
  var Destination: String
  /** contains the source URI of the link. */
  var Source: String
}

object Link {
  @scala.inline
  def apply(Destination: String, Source: String): Link = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

