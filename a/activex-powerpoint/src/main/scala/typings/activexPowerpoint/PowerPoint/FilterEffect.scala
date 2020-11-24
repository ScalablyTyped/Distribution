package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterEffect extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.FilterEffect_typekey")
  var PowerPointDotFilterEffect_typekey: FilterEffect = js.native
  
  var Reveal: MsoTriState = js.native
  
  var Subtype: MsoAnimFilterEffectSubtype = js.native
  
  var Type: MsoAnimFilterEffectType = js.native
}
object FilterEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotFilterEffect_typekey: FilterEffect,
    Reveal: MsoTriState,
    Subtype: MsoAnimFilterEffectSubtype,
    Type: MsoAnimFilterEffectType
  ): FilterEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reveal = Reveal.asInstanceOf[js.Any], Subtype = Subtype.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.FilterEffect_typekey")(PowerPointDotFilterEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEffect]
  }
  
  @scala.inline
  implicit class FilterEffectOps[Self <: FilterEffect] (val x: Self) extends AnyVal {
    
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
    def setPowerPointDotFilterEffect_typekey(value: FilterEffect): Self = this.set("PowerPoint.FilterEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReveal(value: MsoTriState): Self = this.set("Reveal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: MsoAnimFilterEffectSubtype): Self = this.set("Subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoAnimFilterEffectType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
