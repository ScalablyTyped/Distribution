package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.ReflectionFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBackground extends js.Object {
  
  val Fill: FillFormat = js.native
  
  val Picture: PictureFormat = js.native
  
  @JSName("PowerPoint.TableBackground_typekey")
  var PowerPointDotTableBackground_typekey: TableBackground = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  val Shadow: ShadowFormat = js.native
}
object TableBackground {
  
  @scala.inline
  def apply(
    Fill: FillFormat,
    Picture: PictureFormat,
    PowerPointDotTableBackground_typekey: TableBackground,
    Reflection: ReflectionFormat,
    Shadow: ShadowFormat
  ): TableBackground = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableBackground_typekey")(PowerPointDotTableBackground_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBackground]
  }
  
  @scala.inline
  implicit class TableBackgroundOps[Self <: TableBackground] (val x: Self) extends AnyVal {
    
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
    def setFill(value: FillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: PictureFormat): Self = this.set("Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTableBackground_typekey(value: TableBackground): Self = this.set("PowerPoint.TableBackground_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflection(value: ReflectionFormat): Self = this.set("Reflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: ShadowFormat): Self = this.set("Shadow", value.asInstanceOf[js.Any])
  }
}
