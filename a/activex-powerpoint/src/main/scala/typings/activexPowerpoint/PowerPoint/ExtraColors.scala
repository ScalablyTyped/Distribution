package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraColors extends js.Object {
  
  def Add(Type: MsoRGBType): Unit = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): MsoRGBType = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors = js.native
}
object ExtraColors {
  
  @scala.inline
  def apply(
    Add: MsoRGBType => Unit,
    Application: Application,
    Clear: () => Unit,
    Count: Double,
    Item: Double => MsoRGBType,
    Parent: js.Any,
    PowerPointDotExtraColors_typekey: ExtraColors
  ): ExtraColors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ExtraColors_typekey")(PowerPointDotExtraColors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraColors]
  }
  
  @scala.inline
  implicit class ExtraColorsOps[Self <: ExtraColors] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: MsoRGBType => Unit): Self = this.set("Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => MsoRGBType): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotExtraColors_typekey(value: ExtraColors): Self = this.set("PowerPoint.ExtraColors_typekey", value.asInstanceOf[js.Any])
  }
}
