package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMergeTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.MailMergeType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FILE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMergeTypeNs.Constants
  
  @js.native
  sealed trait MAIL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMergeTypeNs.Constants
  
  @js.native
  sealed trait PRINTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMergeTypeNs.Constants
  
  @js.native
  sealed trait SHELL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMergeTypeNs.Constants
  
  /* 2 */ val FILE: FILE with scala.Double = js.native
  /* 3 */ val MAIL: MAIL with scala.Double = js.native
  /* 1 */ val PRINTER: PRINTER with scala.Double = js.native
  /* 4 */ val SHELL: SHELL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMergeTypeNs.Constants with scala.Double
  ] = js.native
}

