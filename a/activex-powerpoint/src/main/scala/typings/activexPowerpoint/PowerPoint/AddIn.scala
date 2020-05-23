package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddIn extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var AutoLoad: MsoTriState
  var DisplayAlerts: MsoTriState
  val FullName: String
  var Loaded: MsoTriState
  val Name: String
  val Parent: js.Any
  val Path: String
  @JSName("PowerPoint.AddIn_typekey")
  var PowerPointDotAddIn_typekey: AddIn
  var Registered: MsoTriState
  val RegisteredInHKLM: MsoTriState
}

object AddIn {
  @scala.inline
  def apply(
    Application: Application,
    AutoLoad: MsoTriState,
    DisplayAlerts: MsoTriState,
    FullName: String,
    Loaded: MsoTriState,
    Name: String,
    Parent: js.Any,
    Path: String,
    PowerPointDotAddIn_typekey: AddIn,
    Registered: MsoTriState,
    RegisteredInHKLM: MsoTriState
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoLoad = AutoLoad.asInstanceOf[js.Any], DisplayAlerts = DisplayAlerts.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Loaded = Loaded.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Registered = Registered.asInstanceOf[js.Any], RegisteredInHKLM = RegisteredInHKLM.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AddIn_typekey")(PowerPointDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
}

