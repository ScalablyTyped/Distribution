package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a dimensioning shape. */
trait MeasureShape
  extends Text
     with Shape
     with MeasureProperties
     with LineProperties
     with ShadowProperties
     with RotationDescriptor {
  /** this point is the end of the measured distance */
  var EndPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** this point is the start of the measured distance */
  var StartPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
}

