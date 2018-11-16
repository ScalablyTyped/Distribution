package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExplorerBarCLSID extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.ExplorerBarCLSID")
@js.native
object ExplorerBarCLSID extends js.Object {
  @js.native
  sealed trait Favorites
    extends activexDashShellLib.Shell32Ns.ExplorerBarCLSID
  
  @js.native
  sealed trait Folders
    extends activexDashShellLib.Shell32Ns.ExplorerBarCLSID
  
  @js.native
  sealed trait History
    extends activexDashShellLib.Shell32Ns.ExplorerBarCLSID
  
  @js.native
  sealed trait Search
    extends activexDashShellLib.Shell32Ns.ExplorerBarCLSID
  
  /* "{EFA24E61-B078-11d0-89E4-00C04FC9E26E}" */ val Favorites: Favorites with java.lang.String = js.native
  /* "{EFA24E64-B078-11d0-89E4-00C04FC9E26E}" */ val Folders: Folders with java.lang.String = js.native
  /* "{EFA24E62-B078-11d0-89E4-00C04FC9E26E}" */ val History: History with java.lang.String = js.native
  /* "{30D02401-6A81-11d0-8274-00C04FD5AE38}" */ val Search: Search with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashShellLib.Shell32Ns.ExplorerBarCLSID with java.lang.String] = js.native
}

