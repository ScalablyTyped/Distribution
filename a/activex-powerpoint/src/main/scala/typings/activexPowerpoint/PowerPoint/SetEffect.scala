package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEffect extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.SetEffect_typekey")
  var PowerPointDotSetEffect_typekey: SetEffect = js.native
  
  var Property: MsoAnimProperty = js.native
  
  var To: js.Any = js.native
}
object SetEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotSetEffect_typekey: SetEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): SetEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SetEffect_typekey")(PowerPointDotSetEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffect]
  }
  
  @scala.inline
  implicit class SetEffectOps[Self <: SetEffect] (val x: Self) extends AnyVal {
    
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
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSetEffect_typekey(value: SetEffect): Self = this.set("PowerPoint.SetEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: MsoAnimProperty): Self = this.set("Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Any): Self = this.set("To", value.asInstanceOf[js.Any])
  }
}
