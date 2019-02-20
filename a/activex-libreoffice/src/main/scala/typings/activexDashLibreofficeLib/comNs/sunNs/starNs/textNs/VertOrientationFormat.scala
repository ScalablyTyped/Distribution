package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the vertical orientation of an object.
  *
  * If `VerticalOrientation == VERT_NONE` , then the value "YPos" describes the distance from the top of the context. Otherwise "YPos" is ignored.
  */
trait VertOrientationFormat extends js.Object {
  /** determines the vertical alignment of an object. The values refer to com::sun::star::VertOrientation. */
  var VerticalOrientation: scala.Double
  /**
    * determines the reference position of the vertical alignment.
    * @see com.sun.star.text.RelOrientation
    */
  var VerticalRelation: scala.Double
  /** contains the distance from top. Only valid if the property VerticalOrientation contains the value VERT_NONE. */
  var YPos: scala.Double
}

