package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandID extends js.Object

/** String versions of globally unique identifiers (GUIDs) that identify common Device and Item commands. */
@JSGlobal("WIA.CommandID")
@js.native
object CommandID extends js.Object {
  @js.native
  sealed trait wiaCommandChangeDocument
    extends activexDashWiaLib.WIANs.CommandID
  
  @js.native
  sealed trait wiaCommandDeleteAllItems
    extends activexDashWiaLib.WIANs.CommandID
  
  @js.native
  sealed trait wiaCommandSynchronize
    extends activexDashWiaLib.WIANs.CommandID
  
  @js.native
  sealed trait wiaCommandTakePicture
    extends activexDashWiaLib.WIANs.CommandID
  
  @js.native
  sealed trait wiaCommandUnloadDocument
    extends activexDashWiaLib.WIANs.CommandID
  
  /* "{04E725B0-ACAE-11D2-A093-00C04F72DC3C}" */ val wiaCommandChangeDocument: wiaCommandChangeDocument with java.lang.String = js.native
  /* "{E208C170-ACAD-11D2-A093-00C04F72DC3C}" */ val wiaCommandDeleteAllItems: wiaCommandDeleteAllItems with java.lang.String = js.native
  /* "{9B26B7B2-ACAD-11D2-A093-00C04F72DC3C}" */ val wiaCommandSynchronize: wiaCommandSynchronize with java.lang.String = js.native
  /* "{AF933CAC-ACAD-11D2-A093-00C04F72DC3C}" */ val wiaCommandTakePicture: wiaCommandTakePicture with java.lang.String = js.native
  /* "{1F3B3D8E-ACAE-11D2-A093-00C04F72DC3C}" */ val wiaCommandUnloadDocument: wiaCommandUnloadDocument with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashWiaLib.WIANs.CommandID with java.lang.String] = js.native
}

