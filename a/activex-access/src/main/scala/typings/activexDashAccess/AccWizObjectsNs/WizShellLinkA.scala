package typings.activexDashAccess.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WizShellLinkA Class */
@JSGlobal("AccWizObjects.WizShellLinkA")
@js.native
class WizShellLinkA protected () extends js.Object {
  var `AccWizObjects.WizShellLinkA_typekey`: WizShellLinkA = js.native
  /** GetArguments */
  def GetArguments(pszArgs: String, cchMaxPath: Double): Unit = js.native
  /** GetDescription */
  def GetDescription(pszName: String, cchMaxName: Double): Unit = js.native
  /** GetHotkey */
  def GetHotkey(pwHotkey: Double): Unit = js.native
  /** GetIDList */
  def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit = js.native
  /** GetIconLocation */
  def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit = js.native
  /** GetPath */
  def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit = js.native
  /** GetShowCmd */
  def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit = js.native
  /** GetWorkingDirectory */
  def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit = js.native
  /** Resolve */
  def Resolve(hWnd: Double, fflags: Double): Unit = js.native
  /** SetArguments */
  def SetArguments(pszArgs: String): Unit = js.native
  /** SetDescription */
  def SetDescription(pszName: String): Unit = js.native
  /** SetHotkey */
  def SetHotkey(wHotkey: Double): Unit = js.native
  /** SetIDList */
  def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit = js.native
  /** SetIconLocation */
  def SetIconLocation(pszIconPath: String, iIcon: Double): Unit = js.native
  /** SetPath */
  def SetPath(pszFile: String): Unit = js.native
  /** SetRelativePath */
  def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit = js.native
  /** SetShowCmd */
  def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit = js.native
  /** SetWorkingDirectory */
  def SetWorkingDirectory(pszDir: String): Unit = js.native
}

