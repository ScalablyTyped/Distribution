package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Link object */
@JSGlobal("Shell32.ShellLinkObject")
@js.native
class ShellLinkObject protected () extends js.Object {
  /** Arguments for the link */
  var Arguments: java.lang.String = js.native
  /** Description of the link */
  var Description: java.lang.String = js.native
  /** Hotkey for the link */
  var Hotkey: scala.Double = js.native
  /** Fully qualified path of the link */
  var Path: java.lang.String = js.native
  var `Shell32.ShellLinkObject_typekey`: ShellLinkObject = js.native
  /** Get the Show Command for the link */
  var ShowCommand: LinkShowWindowState = js.native
  /** Get the target of a link object */
  val Target: ShellFolderItem | scala.Null = js.native
  /** Get the working directory for the link */
  var WorkingDirectory: java.lang.String = js.native
  /** Get the IconLocation for the link */
  def GetIconLocation(pbs: java.lang.String): scala.Double = js.native
  /** Tell the link to resolve itself */
  def Resolve(fFlags: ShellLinkResolveFlags): scala.Unit = js.native
  /**
           * Tell the link to save the changes
           * @param sFile The fully qualified path of the file where the new link information is to be saved. If no file is specified, the current file is used.
           */
  def Save(): scala.Unit = js.native
  /**
           * Tell the link to save the changes
           * @param sFile The fully qualified path of the file where the new link information is to be saved. If no file is specified, the current file is used.
           */
  def Save(vWhere: java.lang.String): scala.Unit = js.native
  /**
           * Set the IconLocation for the link
           * @param sPath The fully qualified path of the file that contains the icon.
           * @param iIcon The index of the icon in the file specified by _sPath_.
           */
  def SetIconLocation(sPath: java.lang.String, iIcon: scala.Double): scala.Unit = js.native
}

