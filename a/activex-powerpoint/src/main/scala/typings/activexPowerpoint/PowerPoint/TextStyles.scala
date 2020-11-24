package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyles extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Type: PpTextStyleType): TextStyle = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextStyles_typekey")
  var PowerPointDotTextStyles_typekey: TextStyles = js.native
}
object TextStyles {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpTextStyleType => TextStyle,
    Parent: js.Any,
    PowerPointDotTextStyles_typekey: TextStyles
  ): TextStyles = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyles_typekey")(PowerPointDotTextStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyles]
  }
  
  @scala.inline
  implicit class TextStylesOps[Self <: TextStyles] (val x: Self) extends AnyVal {
    
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
    def setItem(value: PpTextStyleType => TextStyle): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextStyles_typekey(value: TextStyles): Self = this.set("PowerPoint.TextStyles_typekey", value.asInstanceOf[js.Any])
  }
}
