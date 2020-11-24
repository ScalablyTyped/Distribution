package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var ArtStyle: WdPageBorderArt = js.native
  
  var ArtWidth: Double = js.native
  
  var Color: WdColor = js.native
  
  var ColorIndex: WdColorIndex = js.native
  
  val Creator: Double = js.native
  
  val Inside: Boolean = js.native
  
  var LineStyle: WdLineStyle = js.native
  
  var LineWidth: WdLineWidth = js.native
  
  val Parent: js.Any = js.native
  
  var Visible: Boolean = js.native
  
  @JSName("Word.Border_typekey")
  var WordDotBorder_typekey: Border = js.native
}
object Border {
  
  @scala.inline
  def apply(
    Application: Application,
    ArtStyle: WdPageBorderArt,
    ArtWidth: Double,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    Creator: Double,
    Inside: Boolean,
    LineStyle: WdLineStyle,
    LineWidth: WdLineWidth,
    Parent: js.Any,
    Visible: Boolean,
    WordDotBorder_typekey: Border
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ArtStyle = ArtStyle.asInstanceOf[js.Any], ArtWidth = ArtWidth.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Inside = Inside.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Border_typekey")(WordDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    
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
    def setArtStyle(value: WdPageBorderArt): Self = this.set("ArtStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtWidth(value: Double): Self = this.set("ArtWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: WdColor): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: WdColorIndex): Self = this.set("ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside(value: Boolean): Self = this.set("Inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: WdLineStyle): Self = this.set("LineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: WdLineWidth): Self = this.set("LineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotBorder_typekey(value: Border): Self = this.set("Word.Border_typekey", value.asInstanceOf[js.Any])
  }
}
