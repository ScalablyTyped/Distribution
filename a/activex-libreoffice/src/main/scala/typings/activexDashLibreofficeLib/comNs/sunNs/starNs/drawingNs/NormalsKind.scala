package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NormalsKind extends js.Object

/** specifies in which way the standard normals for an object are produced. */
@JSGlobal("com.sun.star.drawing.NormalsKind")
@js.native
object NormalsKind extends js.Object {
  /**
    * forces one normal per flat part.
    *
    * With FLAT shading, the faces of the object are rendered in a solid color.
    */
  @js.native
  sealed trait FLAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.NormalsKind
  
  /** does not produce standard normals, but leaves the object-specific ones untouched. */
  @js.native
  sealed trait SPECIFIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.NormalsKind
  
  /**
    * forces normals to think that the object is a sphere.
    *
    * This value forces projection to wrapping in X and/or Y.
    */
  @js.native
  sealed trait SPHERE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.NormalsKind
  
  /* 1 */ val FLAT: FLAT with scala.Double = js.native
  /* 0 */ val SPECIFIC: SPECIFIC with scala.Double = js.native
  /* 2 */ val SPHERE: SPHERE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.NormalsKind with scala.Double
  ] = js.native
}

