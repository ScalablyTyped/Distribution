package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies in which way the standard normals for an object are produced. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait NormalsKind extends js.Object

object NormalsKind {
  /**
    * forces one normal per flat part.
    *
    * With FLAT shading, the faces of the object are rendered in a solid color.
    */
  @scala.inline
  def FLAT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** does not produce standard normals, but leaves the object-specific ones untouched. */
  @scala.inline
  def SPECIFIC: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * forces normals to think that the object is a sphere.
    *
    * This value forces projection to wrapping in X and/or Y.
    */
  @scala.inline
  def SPHERE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

