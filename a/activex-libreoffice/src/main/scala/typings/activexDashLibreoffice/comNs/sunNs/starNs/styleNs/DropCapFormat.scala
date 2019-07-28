package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct describes drop caps at a paragraph object. */
trait DropCapFormat extends js.Object {
  /** This is the number of characters in the drop cap. */
  var Count: Double
  /** This is the distance between the drop cap in the following text. */
  var Distance: Double
  /** This is the number of lines used for a drop cap. */
  var Lines: Double
}

object DropCapFormat {
  @scala.inline
  def apply(Count: Double, Distance: Double, Lines: Double): DropCapFormat = {
    val __obj = js.Dynamic.literal(Count = Count, Distance = Distance, Lines = Lines)
  
    __obj.asInstanceOf[DropCapFormat]
  }
}

