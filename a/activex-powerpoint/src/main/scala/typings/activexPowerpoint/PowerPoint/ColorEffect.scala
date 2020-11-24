package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorEffect extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val By: ColorFormat = js.native
  
  val From: ColorFormat = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ColorEffect_typekey")
  var PowerPointDotColorEffect_typekey: ColorEffect = js.native
  
  val To: ColorFormat = js.native
}
object ColorEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    By: ColorFormat,
    From: ColorFormat,
    Parent: js.Any,
    PowerPointDotColorEffect_typekey: ColorEffect,
    To: ColorFormat
  ): ColorEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorEffect_typekey")(PowerPointDotColorEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEffect]
  }
  
  @scala.inline
  implicit class ColorEffectOps[Self <: ColorEffect] (val x: Self) extends AnyVal {
    
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
    def setBy(value: ColorFormat): Self = this.set("By", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: ColorFormat): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotColorEffect_typekey(value: ColorEffect): Self = this.set("PowerPoint.ColorEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: ColorFormat): Self = this.set("To", value.asInstanceOf[js.Any])
  }
}
