package typings.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shell Link object */
@js.native
trait ShellLinkObject extends StObject {
  
  /** Arguments for the link */
  var Arguments: String = js.native
  
  /** Description of the link */
  var Description: String = js.native
  
  /** Get the IconLocation for the link */
  def GetIconLocation(pbs: String): Double = js.native
  
  /** Hotkey for the link */
  var Hotkey: Double = js.native
  
  /** Fully qualified path of the link */
  var Path: String = js.native
  
  /** Tell the link to resolve itself */
  def Resolve(fFlags: ShellLinkResolveFlags): Unit = js.native
  
  /**
    * Tell the link to save the changes
    * @param sFile The fully qualified path of the file where the new link information is to be saved. If no file is specified, the current file is used.
    */
  def Save(): Unit = js.native
  def Save(vWhere: String): Unit = js.native
  
  /**
    * Set the IconLocation for the link
    * @param sPath The fully qualified path of the file that contains the icon.
    * @param iIcon The index of the icon in the file specified by _sPath_.
    */
  def SetIconLocation(sPath: String, iIcon: Double): Unit = js.native
  
  /* private */ @JSName("Shell32.ShellLinkObject_typekey")
  var Shell32DotShellLinkObject_typekey: ShellLinkObject = js.native
  
  /** Get the Show Command for the link */
  var ShowCommand: LinkShowWindowState = js.native
  
  /** Get the target of a link object */
  val Target: ShellFolderItem | Null = js.native
  
  /** Get the working directory for the link */
  var WorkingDirectory: String = js.native
}
