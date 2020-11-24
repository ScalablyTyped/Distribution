package typings.antdMobileRn.anon

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  var container: ViewStyle = js.native
  
  var defaultDisabledRaw: BorderColor = js.native
  
  var defaultDisabledRawText: ColorString = js.native
  
  var defaultHighlight: BorderColor = js.native
  
  var defaultHighlightText: ColorString = js.native
  
  var defaultRaw: BorderColor = js.native
  
  var defaultRawText: ColorString = js.native
  
  var ghostDisabledRaw: BorderColorString = js.native
  
  var ghostDisabledRawText: ColorString = js.native
  
  var ghostHighlight: BorderColor = js.native
  
  var ghostHighlightText: ColorString = js.native
  
  var ghostRaw: BorderColor = js.native
  
  var ghostRawText: ColorString = js.native
  
  var indicator: MarginRight = js.native
  
  var largeRaw: PaddingLeft = js.native
  
  var largeRawText: FontSizeNumber = js.native
  
  var primaryDisabledRaw: Opacity = js.native
  
  var primaryDisabledRawText: ColorString = js.native
  
  var primaryHighlight: BorderColor = js.native
  
  var primaryHighlightText: ColorString = js.native
  
  var primaryRaw: BorderColor = js.native
  
  var primaryRawText: ColorString = js.native
  
  var smallRaw: PaddingLeft = js.native
  
  var smallRawText: FontSizeNumber = js.native
  
  var warningDisabledRaw: Opacity = js.native
  
  var warningDisabledRawText: ColorString = js.native
  
  var warningHighlight: BorderColor = js.native
  
  var warningHighlightText: ColorString = js.native
  
  var warningRaw: BorderColor = js.native
  
  var warningRawText: ColorString = js.native
  
  var wrapperStyle: BorderWidth = js.native
}
object Container {
  
  @scala.inline
  def apply(
    container: ViewStyle,
    defaultDisabledRaw: BorderColor,
    defaultDisabledRawText: ColorString,
    defaultHighlight: BorderColor,
    defaultHighlightText: ColorString,
    defaultRaw: BorderColor,
    defaultRawText: ColorString,
    ghostDisabledRaw: BorderColorString,
    ghostDisabledRawText: ColorString,
    ghostHighlight: BorderColor,
    ghostHighlightText: ColorString,
    ghostRaw: BorderColor,
    ghostRawText: ColorString,
    indicator: MarginRight,
    largeRaw: PaddingLeft,
    largeRawText: FontSizeNumber,
    primaryDisabledRaw: Opacity,
    primaryDisabledRawText: ColorString,
    primaryHighlight: BorderColor,
    primaryHighlightText: ColorString,
    primaryRaw: BorderColor,
    primaryRawText: ColorString,
    smallRaw: PaddingLeft,
    smallRawText: FontSizeNumber,
    warningDisabledRaw: Opacity,
    warningDisabledRawText: ColorString,
    warningHighlight: BorderColor,
    warningHighlightText: ColorString,
    warningRaw: BorderColor,
    warningRawText: ColorString,
    wrapperStyle: BorderWidth
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDisabledRaw(value: BorderColor): Self = this.set("defaultDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDisabledRawText(value: ColorString): Self = this.set("defaultDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighlight(value: BorderColor): Self = this.set("defaultHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighlightText(value: ColorString): Self = this.set("defaultHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRaw(value: BorderColor): Self = this.set("defaultRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRawText(value: ColorString): Self = this.set("defaultRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostDisabledRaw(value: BorderColorString): Self = this.set("ghostDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostDisabledRawText(value: ColorString): Self = this.set("ghostDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostHighlight(value: BorderColor): Self = this.set("ghostHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostHighlightText(value: ColorString): Self = this.set("ghostHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostRaw(value: BorderColor): Self = this.set("ghostRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostRawText(value: ColorString): Self = this.set("ghostRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicator(value: MarginRight): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeRaw(value: PaddingLeft): Self = this.set("largeRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeRawText(value: FontSizeNumber): Self = this.set("largeRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryDisabledRaw(value: Opacity): Self = this.set("primaryDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryDisabledRawText(value: ColorString): Self = this.set("primaryDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryHighlight(value: BorderColor): Self = this.set("primaryHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryHighlightText(value: ColorString): Self = this.set("primaryHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRaw(value: BorderColor): Self = this.set("primaryRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRawText(value: ColorString): Self = this.set("primaryRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallRaw(value: PaddingLeft): Self = this.set("smallRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallRawText(value: FontSizeNumber): Self = this.set("smallRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningDisabledRaw(value: Opacity): Self = this.set("warningDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningDisabledRawText(value: ColorString): Self = this.set("warningDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningHighlight(value: BorderColor): Self = this.set("warningHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningHighlightText(value: ColorString): Self = this.set("warningHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningRaw(value: BorderColor): Self = this.set("warningRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningRawText(value: ColorString): Self = this.set("warningRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyle(value: BorderWidth): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
  }
}
