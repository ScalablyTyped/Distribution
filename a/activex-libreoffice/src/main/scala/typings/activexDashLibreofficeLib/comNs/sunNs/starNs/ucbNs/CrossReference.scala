package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct contains information describing a cross reference.
  *
  * Such references are kept by news servers for managing articles contained in multiple groups. An article can have a sequence of cross references.
  */
trait CrossReference extends js.Object {
  /** The name of a news group. */
  var Group: java.lang.String
  /** The unique identifier (relative to the server) of an article in the given group. */
  var Id: scala.Double
}

object CrossReference {
  @scala.inline
  def apply(Group: java.lang.String, Id: scala.Double): CrossReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Group")(Group)
    __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[CrossReference]
  }
}

