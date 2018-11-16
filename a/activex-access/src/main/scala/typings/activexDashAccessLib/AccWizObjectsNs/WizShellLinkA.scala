package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WizShellLinkA Class */
@JSGlobal("AccWizObjects.WizShellLinkA")
@js.native
class WizShellLinkA protected () extends js.Object {
  var `AccWizObjects.WizShellLinkA_typekey`: WizShellLinkA = js.native
  /** GetArguments */
  def GetArguments(pszArgs: java.lang.String, cchMaxPath: scala.Double): scala.Unit = js.native
  /** GetDescription */
  def GetDescription(pszName: java.lang.String, cchMaxName: scala.Double): scala.Unit = js.native
  /** GetHotkey */
  def GetHotkey(pwHotkey: scala.Double): scala.Unit = js.native
  /** GetIDList */
  def GetIDList(ppidl: WIZ_CSIDL_FLAGS): scala.Unit = js.native
  /** GetIconLocation */
  def GetIconLocation(pszIconPath: java.lang.String, cchIconPath: scala.Double, piIcon: scala.Double): scala.Unit = js.native
  /** GetPath */
  def GetPath(
    pszFile: java.lang.String,
    cchMaxPath: scala.Double,
    pfd: WIZ_WIN32_FIND_DATA,
    fflags: scala.Double
  ): scala.Unit = js.native
  /** GetShowCmd */
  def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): scala.Unit = js.native
  /** GetWorkingDirectory */
  def GetWorkingDirectory(pszDir: java.lang.String, cchMaxPath: scala.Double): scala.Unit = js.native
  /** Resolve */
  def Resolve(hWnd: scala.Double, fflags: scala.Double): scala.Unit = js.native
  /** SetArguments */
  def SetArguments(pszArgs: java.lang.String): scala.Unit = js.native
  /** SetDescription */
  def SetDescription(pszName: java.lang.String): scala.Unit = js.native
  /** SetHotkey */
  def SetHotkey(wHotkey: scala.Double): scala.Unit = js.native
  /** SetIDList */
  def SetIDList(pidl: WIZ_CSIDL_FLAGS): scala.Unit = js.native
  /** SetIconLocation */
  def SetIconLocation(pszIconPath: java.lang.String, iIcon: scala.Double): scala.Unit = js.native
  /** SetPath */
  def SetPath(pszFile: java.lang.String): scala.Unit = js.native
  /** SetRelativePath */
  def SetRelativePath(pszPathRel: java.lang.String, dwReserved: scala.Double): scala.Unit = js.native
  /** SetShowCmd */
  def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): scala.Unit = js.native
  /** SetWorkingDirectory */
  def SetWorkingDirectory(pszDir: java.lang.String): scala.Unit = js.native
}

