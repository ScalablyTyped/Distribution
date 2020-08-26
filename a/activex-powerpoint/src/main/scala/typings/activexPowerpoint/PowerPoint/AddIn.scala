package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIn extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var AutoLoad: MsoTriState = js.native
  var DisplayAlerts: MsoTriState = js.native
  val FullName: String = js.native
  var Loaded: MsoTriState = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  @JSName("PowerPoint.AddIn_typekey")
  var PowerPointDotAddIn_typekey: AddIn = js.native
  var Registered: MsoTriState = js.native
  val RegisteredInHKLM: MsoTriState = js.native
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
  @scala.inline
  implicit class AddInOps[Self <: AddIn] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoLoad(value: MsoTriState): Self = this.set("AutoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayAlerts(value: MsoTriState): Self = this.set("DisplayAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: MsoTriState): Self = this.set("Loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotAddIn_typekey(value: AddIn): Self = this.set("PowerPoint.AddIn_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistered(value: MsoTriState): Self = this.set("Registered", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisteredInHKLM(value: MsoTriState): Self = this.set("RegisteredInHKLM", value.asInstanceOf[js.Any])
  }
  
}

