package typings.activexDashShell

import typings.activexDashShell.Shell32.ShellFolderView
import typings.activexDashShell.Shell32.ShellFolderViewOC
import typings.activexDashShell.activexDashShellStrings.BeginDrag
import typings.activexDashShell.activexDashShellStrings.DefaultVerbInvoked
import typings.activexDashShell.activexDashShellStrings.EnumDone
import typings.activexDashShell.activexDashShellStrings.SelectionChanged
import typings.activexDashShell.activexDashShellStrings.VerbInvoked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  @JSName("on")
  def on_BeginDrag(
    obj: ShellFolderViewOC,
    event: BeginDrag,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeginDrag(
    obj: ShellFolderView,
    event: BeginDrag,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DefaultVerbInvoked(
    obj: ShellFolderViewOC,
    event: DefaultVerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DefaultVerbInvoked(
    obj: ShellFolderView,
    event: DefaultVerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnumDone(
    obj: ShellFolderViewOC,
    event: EnumDone,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnumDone(
    obj: ShellFolderView,
    event: EnumDone,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChanged(
    obj: ShellFolderViewOC,
    event: SelectionChanged,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChanged(
    obj: ShellFolderView,
    event: SelectionChanged,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_VerbInvoked(
    obj: ShellFolderViewOC,
    event: VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_VerbInvoked(
    obj: ShellFolderView,
    event: VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

