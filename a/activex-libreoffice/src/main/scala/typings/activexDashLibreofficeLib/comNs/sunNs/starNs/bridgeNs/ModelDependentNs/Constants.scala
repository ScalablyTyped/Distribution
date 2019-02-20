package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.ModelDependentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.bridge.ModelDependent.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CORBA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.ModelDependentNs.Constants
  
  @js.native
  sealed trait JAVA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.ModelDependentNs.Constants
  
  @js.native
  sealed trait OLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.ModelDependentNs.Constants
  
  @js.native
  sealed trait UNO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.ModelDependentNs.Constants
  
  /* 4 */ val CORBA: CORBA with scala.Double = js.native
  /* 3 */ val JAVA: JAVA with scala.Double = js.native
  /* 2 */ val OLE: OLE with scala.Double = js.native
  /* 1 */ val UNO: UNO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.ModelDependentNs.Constants with scala.Double
  ] = js.native
}

