package typings.antDesignReactNative.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle> */
@js.native
trait PartialListStyle extends js.Object {
  
  var Arrow: js.UndefOr[TextStyle] = js.native
  
  var ArrowV: js.UndefOr[TextStyle] = js.native
  
  var Body: js.UndefOr[ViewStyle] = js.native
  
  var BodyBottomLine: js.UndefOr[ViewStyle] = js.native
  
  var Brief: js.UndefOr[ViewStyle] = js.native
  
  var BriefText: js.UndefOr[TextStyle] = js.native
  
  var Content: js.UndefOr[TextStyle] = js.native
  
  var Extra: js.UndefOr[TextStyle] = js.native
  
  var Footer: js.UndefOr[TextStyle] = js.native
  
  var Header: js.UndefOr[TextStyle] = js.native
  
  var Item: js.UndefOr[ViewStyle] = js.native
  
  var Line: js.UndefOr[ViewStyle] = js.native
  
  var Thumb: js.UndefOr[ImageStyle] = js.native
  
  var column: js.UndefOr[ViewStyle] = js.native
  
  var multipleLine: js.UndefOr[ViewStyle] = js.native
  
  var multipleThumb: js.UndefOr[ImageStyle] = js.native
  
  var underlayColor: js.UndefOr[ViewStyle] = js.native
}
object PartialListStyle {
  
  @scala.inline
  def apply(): PartialListStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListStyle]
  }
  
  @scala.inline
  implicit class PartialListStyleOps[Self <: PartialListStyle] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: TextStyle): Self = this.set("Arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("Arrow", js.undefined)
    
    @scala.inline
    def setArrowV(value: TextStyle): Self = this.set("ArrowV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowV: Self = this.set("ArrowV", js.undefined)
    
    @scala.inline
    def setBody(value: ViewStyle): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setBodyBottomLine(value: ViewStyle): Self = this.set("BodyBottomLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyBottomLine: Self = this.set("BodyBottomLine", js.undefined)
    
    @scala.inline
    def setBrief(value: ViewStyle): Self = this.set("Brief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrief: Self = this.set("Brief", js.undefined)
    
    @scala.inline
    def setBriefText(value: TextStyle): Self = this.set("BriefText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBriefText: Self = this.set("BriefText", js.undefined)
    
    @scala.inline
    def setContent(value: TextStyle): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setExtra(value: TextStyle): Self = this.set("Extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("Extra", js.undefined)
    
    @scala.inline
    def setFooter(value: TextStyle): Self = this.set("Footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("Footer", js.undefined)
    
    @scala.inline
    def setHeader(value: TextStyle): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("Header", js.undefined)
    
    @scala.inline
    def setItem(value: ViewStyle): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
    
    @scala.inline
    def setLine(value: ViewStyle): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("Line", js.undefined)
    
    @scala.inline
    def setThumb(value: ImageStyle): Self = this.set("Thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("Thumb", js.undefined)
    
    @scala.inline
    def setColumn(value: ViewStyle): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setMultipleLine(value: ViewStyle): Self = this.set("multipleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleLine: Self = this.set("multipleLine", js.undefined)
    
    @scala.inline
    def setMultipleThumb(value: ImageStyle): Self = this.set("multipleThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleThumb: Self = this.set("multipleThumb", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: ViewStyle): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
}
