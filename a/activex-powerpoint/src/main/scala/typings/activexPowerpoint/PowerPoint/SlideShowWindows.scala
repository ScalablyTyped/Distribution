package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideShowWindows extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): SlideShowWindow = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.SlideShowWindows_typekey")
  var PowerPointDotSlideShowWindows_typekey: SlideShowWindows = js.native
}
object SlideShowWindows {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => SlideShowWindow,
    Parent: js.Any,
    PowerPointDotSlideShowWindows_typekey: SlideShowWindows
  ): SlideShowWindows = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindows_typekey")(PowerPointDotSlideShowWindows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindows]
  }
  
  @scala.inline
  implicit class SlideShowWindowsOps[Self <: SlideShowWindows] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => SlideShowWindow): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSlideShowWindows_typekey(value: SlideShowWindows): Self = this.set("PowerPoint.SlideShowWindows_typekey", value.asInstanceOf[js.Any])
  }
}
