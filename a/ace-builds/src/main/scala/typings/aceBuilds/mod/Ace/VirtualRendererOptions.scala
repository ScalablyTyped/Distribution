package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRendererOptions extends StObject {
  
  var animatedScroll: Boolean
  
  var displayIndentGuides: Boolean
  
  var fadeFoldWidgets: Boolean
  
  var fixedWidthGutter: Boolean
  
  var fontFamily: String
  
  var fontSize: Double
  
  var hScrollBarAlwaysVisible: Boolean
  
  var hasCssTransforms: Boolean
  
  var highlightGutterLine: Boolean
  
  var maxLines: Double
  
  var maxPixelHeight: Double
  
  var minLines: Double
  
  var printMargin: Boolean | Double
  
  var printMarginColumn: Double
  
  var scrollPastEnd: Boolean
  
  var showFoldWidgets: Boolean
  
  var showGutter: Boolean
  
  var showInvisibles: Boolean
  
  var showLineNumbers: Boolean
  
  var showPrintMargin: Boolean
  
  var theme: String
  
  var vScrollBarAlwaysVisible: Boolean
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
  implicit class VirtualRendererOptionsMutableBuilder[Self <: VirtualRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedScroll(value: Boolean): Self = StObject.set(x, "animatedScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIndentGuides(value: Boolean): Self = StObject.set(x, "displayIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeFoldWidgets(value: Boolean): Self = StObject.set(x, "fadeFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthGutter(value: Boolean): Self = StObject.set(x, "fixedWidthGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCssTransforms(value: Boolean): Self = StObject.set(x, "hasCssTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightGutterLine(value: Boolean): Self = StObject.set(x, "highlightGutterLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPixelHeight(value: Double): Self = StObject.set(x, "maxPixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintMargin(value: Boolean | Double): Self = StObject.set(x, "printMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintMarginColumn(value: Double): Self = StObject.set(x, "printMarginColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFoldWidgets(value: Boolean): Self = StObject.set(x, "showFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInvisibles(value: Boolean): Self = StObject.set(x, "showInvisibles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
  }
}
