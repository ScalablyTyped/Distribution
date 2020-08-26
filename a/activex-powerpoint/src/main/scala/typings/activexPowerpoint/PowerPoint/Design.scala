package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Design extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val HasTitleMaster: MsoTriState = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Design_typekey")
  var PowerPointDotDesign_typekey: Design = js.native
  var Preserved: MsoTriState = js.native
  val SlideMaster: Master = js.native
  val TitleMaster: Master = js.native
  def AddTitleMaster(): Master = js.native
  def Delete(): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
}

object Design {
  @scala.inline
  def apply(
    AddTitleMaster: () => Master,
    Application: Application,
    Delete: () => Unit,
    HasTitleMaster: MsoTriState,
    Index: Double,
    MoveTo: Double => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotDesign_typekey: Design,
    Preserved: MsoTriState,
    SlideMaster: Master,
    TitleMaster: Master
  ): Design = {
    val __obj = js.Dynamic.literal(AddTitleMaster = js.Any.fromFunction0(AddTitleMaster), Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasTitleMaster = HasTitleMaster.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveTo = js.Any.fromFunction1(MoveTo), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Preserved = Preserved.asInstanceOf[js.Any], SlideMaster = SlideMaster.asInstanceOf[js.Any], TitleMaster = TitleMaster.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Design_typekey")(PowerPointDotDesign_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  @scala.inline
  implicit class DesignOps[Self <: Design] (val x: Self) extends AnyVal {
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
    def setAddTitleMaster(value: () => Master): Self = this.set("AddTitleMaster", js.Any.fromFunction0(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setHasTitleMaster(value: MsoTriState): Self = this.set("HasTitleMaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveTo(value: Double => Unit): Self = this.set("MoveTo", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotDesign_typekey(value: Design): Self = this.set("PowerPoint.Design_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserved(value: MsoTriState): Self = this.set("Preserved", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideMaster(value: Master): Self = this.set("SlideMaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleMaster(value: Master): Self = this.set("TitleMaster", value.asInstanceOf[js.Any])
  }
  
}

