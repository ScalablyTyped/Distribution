package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRendererOptions extends js.Object {
  
  var animatedScroll: Boolean = js.native
  
  var displayIndentGuides: Boolean = js.native
  
  var fadeFoldWidgets: Boolean = js.native
  
  var fixedWidthGutter: Boolean = js.native
  
  var fontFamily: String = js.native
  
  var fontSize: Double = js.native
  
  var hScrollBarAlwaysVisible: Boolean = js.native
  
  var hasCssTransforms: Boolean = js.native
  
  var highlightGutterLine: Boolean = js.native
  
  var maxLines: Double = js.native
  
  var maxPixelHeight: Double = js.native
  
  var minLines: Double = js.native
  
  var printMargin: Boolean | Double = js.native
  
  var printMarginColumn: Double = js.native
  
  var scrollPastEnd: Boolean = js.native
  
  var showFoldWidgets: Boolean = js.native
  
  var showGutter: Boolean = js.native
  
  var showInvisibles: Boolean = js.native
  
  var showLineNumbers: Boolean = js.native
  
  var showPrintMargin: Boolean = js.native
  
  var theme: String = js.native
  
  var vScrollBarAlwaysVisible: Boolean = js.native
}
object VirtualRendererOptions {
  
  @scala.inline
  def apply(
    animatedScroll: Boolean,
    displayIndentGuides: Boolean,
    fadeFoldWidgets: Boolean,
    fixedWidthGutter: Boolean,
    fontFamily: String,
    fontSize: Double,
    hScrollBarAlwaysVisible: Boolean,
    hasCssTransforms: Boolean,
    highlightGutterLine: Boolean,
    maxLines: Double,
    maxPixelHeight: Double,
    minLines: Double,
    printMargin: Boolean | Double,
    printMarginColumn: Double,
    scrollPastEnd: Boolean,
    showFoldWidgets: Boolean,
    showGutter: Boolean,
    showInvisibles: Boolean,
    showLineNumbers: Boolean,
    showPrintMargin: Boolean,
    theme: String,
    vScrollBarAlwaysVisible: Boolean
  ): VirtualRendererOptions = {
    val __obj = js.Dynamic.literal(animatedScroll = animatedScroll.asInstanceOf[js.Any], displayIndentGuides = displayIndentGuides.asInstanceOf[js.Any], fadeFoldWidgets = fadeFoldWidgets.asInstanceOf[js.Any], fixedWidthGutter = fixedWidthGutter.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hScrollBarAlwaysVisible = hScrollBarAlwaysVisible.asInstanceOf[js.Any], hasCssTransforms = hasCssTransforms.asInstanceOf[js.Any], highlightGutterLine = highlightGutterLine.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], maxPixelHeight = maxPixelHeight.asInstanceOf[js.Any], minLines = minLines.asInstanceOf[js.Any], printMargin = printMargin.asInstanceOf[js.Any], printMarginColumn = printMarginColumn.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any], showFoldWidgets = showFoldWidgets.asInstanceOf[js.Any], showGutter = showGutter.asInstanceOf[js.Any], showInvisibles = showInvisibles.asInstanceOf[js.Any], showLineNumbers = showLineNumbers.asInstanceOf[js.Any], showPrintMargin = showPrintMargin.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], vScrollBarAlwaysVisible = vScrollBarAlwaysVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRendererOptions]
  }
  
  @scala.inline
  implicit class VirtualRendererOptionsOps[Self <: VirtualRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimatedScroll(value: Boolean): Self = this.set("animatedScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIndentGuides(value: Boolean): Self = this.set("displayIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeFoldWidgets(value: Boolean): Self = this.set("fadeFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthGutter(value: Boolean): Self = this.set("fixedWidthGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHScrollBarAlwaysVisible(value: Boolean): Self = this.set("hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCssTransforms(value: Boolean): Self = this.set("hasCssTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightGutterLine(value: Boolean): Self = this.set("highlightGutterLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPixelHeight(value: Double): Self = this.set("maxPixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLines(value: Double): Self = this.set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintMargin(value: Boolean | Double): Self = this.set("printMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintMarginColumn(value: Double): Self = this.set("printMarginColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFoldWidgets(value: Boolean): Self = this.set("showFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGutter(value: Boolean): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInvisibles(value: Boolean): Self = this.set("showInvisibles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLineNumbers(value: Boolean): Self = this.set("showLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVScrollBarAlwaysVisible(value: Boolean): Self = this.set("vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
  }
}
