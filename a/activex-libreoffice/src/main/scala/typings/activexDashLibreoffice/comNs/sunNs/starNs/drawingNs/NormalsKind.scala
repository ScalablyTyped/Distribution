package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies in which way the standard normals for an object are produced. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait NormalsKind extends js.Object

object NormalsKind {
  /**
    * forces one normal per flat part.
    *
    * With FLAT shading, the faces of the object are rendered in a solid color.
    */
  @scala.inline
  def FLAT: `1` = this.cast(1)
  /** does not produce standard normals, but leaves the object-specific ones untouched. */
  @scala.inline
  def SPECIFIC: `0` = this.cast(0)
  /**
    * forces normals to think that the object is a sphere.
    *
    * This value forces projection to wrapping in X and/or Y.
    */
  @scala.inline
  def SPHERE: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

