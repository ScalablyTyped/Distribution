package typings.activexShell.Shell32

import typings.activexShell.activexShellNumbers.`1`
import typings.activexShell.activexShellNumbers.`2`
import typings.activexShell.activexShellNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShell.activexShellNumbers.`1`
  - typings.activexShell.activexShellNumbers.`2`
  - typings.activexShell.activexShellNumbers.`3`
*/
trait LinkShowWindowState extends StObject
object LinkShowWindowState {
  
  /** Activates the window and displays it as a maximized window. */
  @scala.inline
  def Maximized: `3` = 3.asInstanceOf[`3`]
  
  /** Activates the window and displays it as a minimized window. */
  @scala.inline
  def Minimized: `2` = 2.asInstanceOf[`2`]
  
  /** Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. */
  @scala.inline
  def Normal: `1` = 1.asInstanceOf[`1`]
}
