package typings.antDesignReactNative.buttonStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonStyles extends js.Object {
  
  var container: ViewStyle = js.native
  
  var defaultDisabledRaw: ViewStyle = js.native
  
  var defaultDisabledRawText: TextStyle = js.native
  
  var defaultHighlight: ViewStyle = js.native
  
  var defaultHighlightText: TextStyle = js.native
  
  var defaultRaw: ViewStyle = js.native
  
  var defaultRawText: TextStyle = js.native
  
  var ghostDisabledRaw: ViewStyle = js.native
  
  var ghostDisabledRawText: TextStyle = js.native
  
  var ghostHighlight: ViewStyle = js.native
  
  var ghostHighlightText: TextStyle = js.native
  
  var ghostRaw: ViewStyle = js.native
  
  var ghostRawText: TextStyle = js.native
  
  var indicator: ViewStyle = js.native
  
  var largeRaw: ViewStyle = js.native
  
  var largeRawText: TextStyle = js.native
  
  var primaryDisabledRaw: ViewStyle = js.native
  
  var primaryDisabledRawText: TextStyle = js.native
  
  var primaryHighlight: ViewStyle = js.native
  
  var primaryHighlightText: TextStyle = js.native
  
  var primaryRaw: ViewStyle = js.native
  
  var primaryRawText: TextStyle = js.native
  
  var smallRaw: ViewStyle = js.native
  
  var smallRawText: TextStyle = js.native
  
  var warningDisabledRaw: ViewStyle = js.native
  
  var warningDisabledRawText: TextStyle = js.native
  
  var warningHighlight: ViewStyle = js.native
  
  var warningHighlightText: TextStyle = js.native
  
  var warningRaw: ViewStyle = js.native
  
  var warningRawText: TextStyle = js.native
  
  var wrapperStyle: ViewStyle = js.native
}
object ButtonStyles {
  
  @scala.inline
  def apply(
    container: ViewStyle,
    defaultDisabledRaw: ViewStyle,
    defaultDisabledRawText: TextStyle,
    defaultHighlight: ViewStyle,
    defaultHighlightText: TextStyle,
    defaultRaw: ViewStyle,
    defaultRawText: TextStyle,
    ghostDisabledRaw: ViewStyle,
    ghostDisabledRawText: TextStyle,
    ghostHighlight: ViewStyle,
    ghostHighlightText: TextStyle,
    ghostRaw: ViewStyle,
    ghostRawText: TextStyle,
    indicator: ViewStyle,
    largeRaw: ViewStyle,
    largeRawText: TextStyle,
    primaryDisabledRaw: ViewStyle,
    primaryDisabledRawText: TextStyle,
    primaryHighlight: ViewStyle,
    primaryHighlightText: TextStyle,
    primaryRaw: ViewStyle,
    primaryRawText: TextStyle,
    smallRaw: ViewStyle,
    smallRawText: TextStyle,
    warningDisabledRaw: ViewStyle,
    warningDisabledRawText: TextStyle,
    warningHighlight: ViewStyle,
    warningHighlightText: TextStyle,
    warningRaw: ViewStyle,
    warningRawText: TextStyle,
    wrapperStyle: ViewStyle
  ): ButtonStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyles]
  }
  
  @scala.inline
  implicit class ButtonStylesOps[Self <: ButtonStyles] (val x: Self) extends AnyVal {
    
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
    def setDefaultDisabledRaw(value: ViewStyle): Self = this.set("defaultDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDisabledRawText(value: TextStyle): Self = this.set("defaultDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighlight(value: ViewStyle): Self = this.set("defaultHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighlightText(value: TextStyle): Self = this.set("defaultHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRaw(value: ViewStyle): Self = this.set("defaultRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRawText(value: TextStyle): Self = this.set("defaultRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostDisabledRaw(value: ViewStyle): Self = this.set("ghostDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostDisabledRawText(value: TextStyle): Self = this.set("ghostDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostHighlight(value: ViewStyle): Self = this.set("ghostHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostHighlightText(value: TextStyle): Self = this.set("ghostHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostRaw(value: ViewStyle): Self = this.set("ghostRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostRawText(value: TextStyle): Self = this.set("ghostRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicator(value: ViewStyle): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeRaw(value: ViewStyle): Self = this.set("largeRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeRawText(value: TextStyle): Self = this.set("largeRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryDisabledRaw(value: ViewStyle): Self = this.set("primaryDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryDisabledRawText(value: TextStyle): Self = this.set("primaryDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryHighlight(value: ViewStyle): Self = this.set("primaryHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryHighlightText(value: TextStyle): Self = this.set("primaryHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRaw(value: ViewStyle): Self = this.set("primaryRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRawText(value: TextStyle): Self = this.set("primaryRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallRaw(value: ViewStyle): Self = this.set("smallRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallRawText(value: TextStyle): Self = this.set("smallRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningDisabledRaw(value: ViewStyle): Self = this.set("warningDisabledRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningDisabledRawText(value: TextStyle): Self = this.set("warningDisabledRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningHighlight(value: ViewStyle): Self = this.set("warningHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningHighlightText(value: TextStyle): Self = this.set("warningHighlightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningRaw(value: ViewStyle): Self = this.set("warningRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningRawText(value: TextStyle): Self = this.set("warningRawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyle(value: ViewStyle): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
  }
}
