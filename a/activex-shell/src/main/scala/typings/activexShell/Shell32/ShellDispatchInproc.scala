package typings.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ShellDispatch Load in Shell Context */
@js.native
trait ShellDispatchInproc extends StObject {
  
  @JSName("Shell32.ShellDispatchInproc_typekey")
  var Shell32DotShellDispatchInproc_typekey: ShellDispatchInproc = js.native
}
object ShellDispatchInproc {
  
  @scala.inline
  def apply(Shell32DotShellDispatchInproc_typekey: ShellDispatchInproc): ShellDispatchInproc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell32.ShellDispatchInproc_typekey")(Shell32DotShellDispatchInproc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellDispatchInproc]
  }
  
  @scala.inline
  implicit class ShellDispatchInprocMutableBuilder[Self <: ShellDispatchInproc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShell32DotShellDispatchInproc_typekey(value: ShellDispatchInproc): Self = StObject.set(x, "Shell32.ShellDispatchInproc_typekey", value.asInstanceOf[js.Any])
  }
}
