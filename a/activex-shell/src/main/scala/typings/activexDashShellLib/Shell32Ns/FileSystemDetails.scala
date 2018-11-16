package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemDetails extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.FileSystemDetails")
@js.native
object FileSystemDetails extends js.Object {
  @js.native
  sealed trait Attributes
    extends activexDashShellLib.Shell32Ns.FileSystemDetails
  
  @js.native
  sealed trait InfoTip
    extends activexDashShellLib.Shell32Ns.FileSystemDetails
  
  @js.native
  sealed trait LastModified
    extends activexDashShellLib.Shell32Ns.FileSystemDetails
  
  @js.native
  sealed trait Name
    extends activexDashShellLib.Shell32Ns.FileSystemDetails
  
  @js.native
  sealed trait Size
    extends activexDashShellLib.Shell32Ns.FileSystemDetails
  
  @js.native
  sealed trait Type
    extends activexDashShellLib.Shell32Ns.FileSystemDetails
  
  /* 4 */ val Attributes: Attributes with scala.Double = js.native
  /* -1 */ val InfoTip: InfoTip with scala.Double = js.native
  /* 3 */ val LastModified: LastModified with scala.Double = js.native
  /* 0 */ val Name: Name with scala.Double = js.native
  /* 1 */ val Size: Size with scala.Double = js.native
  /* 2 */ val Type: Type with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.FileSystemDetails with scala.Double] = js.native
}

