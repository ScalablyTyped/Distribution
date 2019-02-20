package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageBoxType extends js.Object

/**
  * specifies the type of a {@link XMessageBox} .
  * @since LibreOffice 4.2
  */
@JSGlobal("com.sun.star.awt.MessageBoxType")
@js.native
object MessageBoxType extends js.Object {
  /** A message box to provide an error message to the user. */
  @js.native
  sealed trait ERRORBOX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MessageBoxType
  
  /** A message box to inform the user about a certain event */
  @js.native
  sealed trait INFOBOX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MessageBoxType
  
  /** A normal message box. */
  @js.native
  sealed trait MESSAGEBOX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MessageBoxType
  
  /** A message box to query information from the user. */
  @js.native
  sealed trait QUERYBOX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MessageBoxType
  
  /** A message to warn the user about a certain problem. */
  @js.native
  sealed trait WARNINGBOX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MessageBoxType
  
  /* 3 */ val ERRORBOX: ERRORBOX with scala.Double = js.native
  /* 1 */ val INFOBOX: INFOBOX with scala.Double = js.native
  /* 0 */ val MESSAGEBOX: MESSAGEBOX with scala.Double = js.native
  /* 4 */ val QUERYBOX: QUERYBOX with scala.Double = js.native
  /* 2 */ val WARNINGBOX: WARNINGBOX with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MessageBoxType with scala.Double
  ] = js.native
}

