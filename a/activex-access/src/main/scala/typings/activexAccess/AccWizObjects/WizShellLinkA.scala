package typings.activexAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WizShellLinkA Class */
@js.native
trait WizShellLinkA extends js.Object {
  @JSName("AccWizObjects.WizShellLinkA_typekey")
  var AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA = js.native
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
  @scala.inline
  implicit class WizShellLinkAOps[Self <: WizShellLinkA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccWizObjectsDotWizShellLinkA_typekey(value: WizShellLinkA): Self = this.set("AccWizObjects.WizShellLinkA_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetArguments(value: (String, Double) => Unit): Self = this.set("GetArguments", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDescription(value: (String, Double) => Unit): Self = this.set("GetDescription", js.Any.fromFunction2(value))
    @scala.inline
    def setGetHotkey(value: Double => Unit): Self = this.set("GetHotkey", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = this.set("GetIDList", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIconLocation(value: (String, Double, Double) => Unit): Self = this.set("GetIconLocation", js.Any.fromFunction3(value))
    @scala.inline
    def setGetPath(value: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit): Self = this.set("GetPath", js.Any.fromFunction4(value))
    @scala.inline
    def setGetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = this.set("GetShowCmd", js.Any.fromFunction1(value))
    @scala.inline
    def setGetWorkingDirectory(value: (String, Double) => Unit): Self = this.set("GetWorkingDirectory", js.Any.fromFunction2(value))
    @scala.inline
    def setResolve(value: (Double, Double) => Unit): Self = this.set("Resolve", js.Any.fromFunction2(value))
    @scala.inline
    def setSetArguments(value: String => Unit): Self = this.set("SetArguments", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDescription(value: String => Unit): Self = this.set("SetDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHotkey(value: Double => Unit): Self = this.set("SetHotkey", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = this.set("SetIDList", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIconLocation(value: (String, Double) => Unit): Self = this.set("SetIconLocation", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPath(value: String => Unit): Self = this.set("SetPath", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRelativePath(value: (String, Double) => Unit): Self = this.set("SetRelativePath", js.Any.fromFunction2(value))
    @scala.inline
    def setSetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = this.set("SetShowCmd", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWorkingDirectory(value: String => Unit): Self = this.set("SetWorkingDirectory", js.Any.fromFunction1(value))
  }
  
}

