package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct describes drop caps at a paragraph object. */
trait DropCapFormat extends js.Object {
  /** This is the number of characters in the drop cap. */
  var Count: scala.Double
  /** This is the distance between the drop cap in the following text. */
  var Distance: scala.Double
  /** This is the number of lines used for a drop cap. */
  var Lines: scala.Double
}

object DropCapFormat {
  @scala.inline
  def apply(Count: scala.Double, Distance: scala.Double, Lines: scala.Double): DropCapFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Distance")(Distance)
    __obj.updateDynamic("Lines")(Lines)
    __obj.asInstanceOf[DropCapFormat]
  }
}

