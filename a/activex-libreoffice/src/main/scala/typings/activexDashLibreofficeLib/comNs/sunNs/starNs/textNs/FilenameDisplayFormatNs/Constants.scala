package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FilenameDisplayFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.FilenameDisplayFormat.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FULL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FilenameDisplayFormatNs.Constants
  
  @js.native
  sealed trait NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FilenameDisplayFormatNs.Constants
  
  @js.native
  sealed trait NAME_AND_EXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FilenameDisplayFormatNs.Constants
  
  @js.native
  sealed trait PATH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FilenameDisplayFormatNs.Constants
  
  /* 0 */ val FULL: FULL with scala.Double = js.native
  /* 2 */ val NAME: NAME with scala.Double = js.native
  /* 3 */ val NAME_AND_EXT: NAME_AND_EXT with scala.Double = js.native
  /* 1 */ val PATH: PATH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FilenameDisplayFormatNs.Constants with scala.Double
  ] = js.native
}

