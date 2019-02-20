package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldAccessMode extends js.Object

/** Denotes the access possibilities via {@link XIdlField2} to an interface attribute, enum or compound type (struct/exception). */
@JSGlobal("com.sun.star.reflection.FieldAccessMode")
@js.native
object FieldAccessMode extends js.Object {
  /**
    * Deprecated. Not used anymore.
    * @deprecated Deprecated
    */
  @js.native
  sealed trait CONST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.FieldAccessMode
  
  /** readable only */
  @js.native
  sealed trait READONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.FieldAccessMode
  
  /** readable and writeable */
  @js.native
  sealed trait READWRITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.FieldAccessMode
  
  /** writeable only */
  @js.native
  sealed trait WRITEONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.FieldAccessMode
  
  /* 3 */ val CONST: CONST with scala.Double = js.native
  /* 1 */ val READONLY: READONLY with scala.Double = js.native
  /* 0 */ val READWRITE: READWRITE with scala.Double = js.native
  /* 2 */ val WRITEONLY: WRITEONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.FieldAccessMode with scala.Double
  ] = js.native
}

