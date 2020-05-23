package typings.activexAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WizShellLinkA Class */
trait WizShellLinkA extends js.Object {
  @JSName("AccWizObjects.WizShellLinkA_typekey")
  var AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA
  /** GetArguments */
  def GetArguments(pszArgs: String, cchMaxPath: Double): Unit
  /** GetDescription */
  def GetDescription(pszName: String, cchMaxName: Double): Unit
  /** GetHotkey */
  def GetHotkey(pwHotkey: Double): Unit
  /** GetIDList */
  def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit
  /** GetIconLocation */
  def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit
  /** GetPath */
  def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit
  /** GetShowCmd */
  def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit
  /** GetWorkingDirectory */
  def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit
  /** Resolve */
  def Resolve(hWnd: Double, fflags: Double): Unit
  /** SetArguments */
  def SetArguments(pszArgs: String): Unit
  /** SetDescription */
  def SetDescription(pszName: String): Unit
  /** SetHotkey */
  def SetHotkey(wHotkey: Double): Unit
  /** SetIDList */
  def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit
  /** SetIconLocation */
  def SetIconLocation(pszIconPath: String, iIcon: Double): Unit
  /** SetPath */
  def SetPath(pszFile: String): Unit
  /** SetRelativePath */
  def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit
  /** SetShowCmd */
  def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit
  /** SetWorkingDirectory */
  def SetWorkingDirectory(pszDir: String): Unit
}

object WizShellLinkA {
  @scala.inline
  def apply(
    AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA,
    GetArguments: (String, Double) => Unit,
    GetDescription: (String, Double) => Unit,
    GetHotkey: Double => Unit,
    GetIDList: WIZ_CSIDL_FLAGS => Unit,
    GetIconLocation: (String, Double, Double) => Unit,
    GetPath: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit,
    GetShowCmd: WIZ_SW_FLAGS => Unit,
    GetWorkingDirectory: (String, Double) => Unit,
    Resolve: (Double, Double) => Unit,
    SetArguments: String => Unit,
    SetDescription: String => Unit,
    SetHotkey: Double => Unit,
    SetIDList: WIZ_CSIDL_FLAGS => Unit,
    SetIconLocation: (String, Double) => Unit,
    SetPath: String => Unit,
    SetRelativePath: (String, Double) => Unit,
    SetShowCmd: WIZ_SW_FLAGS => Unit,
    SetWorkingDirectory: String => Unit
  ): WizShellLinkA = {
    val __obj = js.Dynamic.literal(GetArguments = js.Any.fromFunction2(GetArguments), GetDescription = js.Any.fromFunction2(GetDescription), GetHotkey = js.Any.fromFunction1(GetHotkey), GetIDList = js.Any.fromFunction1(GetIDList), GetIconLocation = js.Any.fromFunction3(GetIconLocation), GetPath = js.Any.fromFunction4(GetPath), GetShowCmd = js.Any.fromFunction1(GetShowCmd), GetWorkingDirectory = js.Any.fromFunction2(GetWorkingDirectory), Resolve = js.Any.fromFunction2(Resolve), SetArguments = js.Any.fromFunction1(SetArguments), SetDescription = js.Any.fromFunction1(SetDescription), SetHotkey = js.Any.fromFunction1(SetHotkey), SetIDList = js.Any.fromFunction1(SetIDList), SetIconLocation = js.Any.fromFunction2(SetIconLocation), SetPath = js.Any.fromFunction1(SetPath), SetRelativePath = js.Any.fromFunction2(SetRelativePath), SetShowCmd = js.Any.fromFunction1(SetShowCmd), SetWorkingDirectory = js.Any.fromFunction1(SetWorkingDirectory))
    __obj.updateDynamic("AccWizObjects.WizShellLinkA_typekey")(AccWizObjectsDotWizShellLinkA_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizShellLinkA]
  }
}

