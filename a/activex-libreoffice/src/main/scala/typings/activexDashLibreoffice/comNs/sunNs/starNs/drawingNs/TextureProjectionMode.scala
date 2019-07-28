package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines how the texture is mapped to the object.
  *
  * It can be set independently for X and Y texture directions.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait TextureProjectionMode extends js.Object

object TextureProjectionMode {
  /** This value specifies that the standard object projection method is used. */
  @scala.inline
  def OBJECTSPECIFIC: `0` = this.cast(0)
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  @scala.inline
  def PARALLEL: `1` = this.cast(1)
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

