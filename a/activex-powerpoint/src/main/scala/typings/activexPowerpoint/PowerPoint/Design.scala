package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Design extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val HasTitleMaster: MsoTriState
  val Index: Double
  var Name: String
  val Parent: js.Any
  @JSName("PowerPoint.Design_typekey")
  var PowerPointDotDesign_typekey: Design
  var Preserved: MsoTriState
  val SlideMaster: Master
  val TitleMaster: Master
  def AddTitleMaster(): Master
  def Delete(): Unit
  def MoveTo(toPos: Double): Unit
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
}

