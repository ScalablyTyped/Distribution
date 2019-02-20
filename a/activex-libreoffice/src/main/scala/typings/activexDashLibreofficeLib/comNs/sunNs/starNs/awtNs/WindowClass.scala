package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WindowClass extends js.Object

/** specifies the class of a window. */
@JSGlobal("com.sun.star.awt.WindowClass")
@js.native
object WindowClass extends js.Object {
  /** is a container that may contain other components. It is not a top window. */
  @js.native
  sealed trait CONTAINER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.WindowClass
  
  /** is a modal top level window on the desktop. It is also a container. */
  @js.native
  sealed trait MODALTOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.WindowClass
  
  /** is the simplest window. It can be a container. */
  @js.native
  sealed trait SIMPLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.WindowClass
  
  /** specifies a top level window on the desktop. It is also a container. */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.WindowClass
  
  /* 2 */ val CONTAINER: CONTAINER with scala.Double = js.native
  /* 1 */ val MODALTOP: MODALTOP with scala.Double = js.native
  /* 3 */ val SIMPLE: SIMPLE with scala.Double = js.native
  /* 0 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.WindowClass with scala.Double] = js.native
}

