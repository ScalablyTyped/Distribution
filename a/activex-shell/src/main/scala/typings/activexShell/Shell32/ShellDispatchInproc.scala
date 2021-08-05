package typings.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ShellDispatch Load in Shell Context */
trait ShellDispatchInproc extends StObject {
  
  /* private */ @JSName("Shell32.ShellDispatchInproc_typekey")
  var Shell32DotShellDispatchInproc_typekey: ShellDispatchInproc
}
object ShellDispatchInproc {
  
  inline def apply(Shell32DotShellDispatchInproc_typekey: ShellDispatchInproc): ShellDispatchInproc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell32.ShellDispatchInproc_typekey")(Shell32DotShellDispatchInproc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellDispatchInproc]
  }
  
  extension [Self <: ShellDispatchInproc](x: Self) {
    
    inline def setShell32DotShellDispatchInproc_typekey(value: ShellDispatchInproc): Self = StObject.set(x, "Shell32.ShellDispatchInproc_typekey", value.asInstanceOf[js.Any])
  }
}
