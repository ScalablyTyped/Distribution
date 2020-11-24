package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowV extends js.Object {
  
  var Arrow: MarginLeftMarginTop = js.native
  
  var ArrowV: MarginLeftWidth = js.native
  
  var Body: BorderTopColor = js.native
  
  var BodyBottomLine: BorderBottomWidth = js.native
  
  var Brief: MinHeightNumber = js.native
  
  var BriefText: FontSizePaddingTop = js.native
  
  var Content: FontSizeTextAlignVertical = js.native
  
  var Extra: FontSizeTextAlign = js.native
  
  var Footer: PaddingVertical = js.native
  
  var Header: PaddingTop = js.native
  
  var Item: FlexGrow = js.native
  
  var Line: MinHeight = js.native
  
  var Thumb: HeightMarginRight = js.native
  
  var column: FlexFlexDirection = js.native
  
  var multipleLine: PaddingVerticalNumber = js.native
  
  var multipleThumb: HeightWidth = js.native
  
  var underlayColor: BackgroundColorString = js.native
}
object ArrowV {
  
  @scala.inline
  def apply(
    Arrow: MarginLeftMarginTop,
    ArrowV: MarginLeftWidth,
    Body: BorderTopColor,
    BodyBottomLine: BorderBottomWidth,
    Brief: MinHeightNumber,
    BriefText: FontSizePaddingTop,
    Content: FontSizeTextAlignVertical,
    Extra: FontSizeTextAlign,
    Footer: PaddingVertical,
    Header: PaddingTop,
    Item: FlexGrow,
    Line: MinHeight,
    Thumb: HeightMarginRight,
    column: FlexFlexDirection,
    multipleLine: PaddingVerticalNumber,
    multipleThumb: HeightWidth,
    underlayColor: BackgroundColorString
  ): ArrowV = {
    val __obj = js.Dynamic.literal(Arrow = Arrow.asInstanceOf[js.Any], ArrowV = ArrowV.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyBottomLine = BodyBottomLine.asInstanceOf[js.Any], Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Extra = Extra.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Thumb = Thumb.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], multipleLine = multipleLine.asInstanceOf[js.Any], multipleThumb = multipleThumb.asInstanceOf[js.Any], underlayColor = underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowV]
  }
  
  @scala.inline
  implicit class ArrowVOps[Self <: ArrowV] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: MarginLeftMarginTop): Self = this.set("Arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowV(value: MarginLeftWidth): Self = this.set("ArrowV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: BorderTopColor): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyBottomLine(value: BorderBottomWidth): Self = this.set("BodyBottomLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrief(value: MinHeightNumber): Self = this.set("Brief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBriefText(value: FontSizePaddingTop): Self = this.set("BriefText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: FontSizeTextAlignVertical): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: FontSizeTextAlign): Self = this.set("Extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: PaddingVertical): Self = this.set("Footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: PaddingTop): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: FlexGrow): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: MinHeight): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: HeightMarginRight): Self = this.set("Thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: FlexFlexDirection): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleLine(value: PaddingVerticalNumber): Self = this.set("multipleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleThumb(value: HeightWidth): Self = this.set("multipleThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColor(value: BackgroundColorString): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
  }
}
