package typings.activexShell

import typings.activexShell.Shell32.ShellFolderView
import typings.activexShell.Shell32.ShellFolderViewOC
import typings.activexShell.activexShellStrings.BeginDrag
import typings.activexShell.activexShellStrings.DefaultVerbInvoked
import typings.activexShell.activexShellStrings.EnumDone
import typings.activexShell.activexShellStrings.SelectionChanged
import typings.activexShell.activexShellStrings.VerbInvoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: ShellFolderViewOC,
    event: BeginDrag | DefaultVerbInvoked | EnumDone | SelectionChanged | VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ShellFolderView,
    event: BeginDrag | DefaultVerbInvoked | EnumDone | SelectionChanged | VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
