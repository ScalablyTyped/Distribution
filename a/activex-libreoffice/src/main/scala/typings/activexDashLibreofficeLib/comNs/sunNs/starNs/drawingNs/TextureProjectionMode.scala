package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureProjectionMode extends js.Object

/**
  * defines how the texture is mapped to the object.
  *
  * It can be set independently for X and Y texture directions.
  */
@JSGlobal("com.sun.star.drawing.TextureProjectionMode")
@js.native
object TextureProjectionMode extends js.Object {
  /** This value specifies that the standard object projection method is used. */
  @js.native
  sealed trait OBJECTSPECIFIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureProjectionMode
  
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  @js.native
  sealed trait PARALLEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureProjectionMode
  
  /**
    * forces normals to think that the object is a sphere.
    *
    * This value forces projection to wrapping in X and/or Y.
    */
  @js.native
  sealed trait SPHERE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureProjectionMode
  
  /* 0 */ val OBJECTSPECIFIC: OBJECTSPECIFIC with scala.Double = js.native
  /* 1 */ val PARALLEL: PARALLEL with scala.Double = js.native
  /* 2 */ val SPHERE: SPHERE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureProjectionMode with scala.Double
  ] = js.native
}

