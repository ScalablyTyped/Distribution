package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadius extends StObject {
  
  var backgroundColor: String = js.native
  
  var borderRadius: String = js.native
  
  var boxShadow: String = js.native
  
  var color: String = js.native
  
  var display: js.UndefOr[scala.Nothing] = js.native
  
  var float: js.UndefOr[scala.Nothing] = js.native
  
  var fontFamily: String = js.native
  
  var fontSize: String = js.native
  
  var height: js.UndefOr[scala.Nothing] = js.native
  
  var lineHeight: String = js.native
  
  var listStyleType: js.UndefOr[scala.Nothing] = js.native
  
  var margin: js.UndefOr[scala.Nothing] = js.native
  
  var marginBottom: js.UndefOr[scala.Nothing] = js.native
  
  var marginLeft: js.UndefOr[scala.Nothing] = js.native
  
  var marginRight: js.UndefOr[scala.Nothing] = js.native
  
  var padding: String = js.native
  
  var position: String = js.native
  
  var transition: String = js.native
  
  var visibility: String = js.native
  
  var width: js.UndefOr[scala.Nothing] = js.native
  
  var zIndex: Double = js.native
}
object BorderRadius {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    borderRadius: String,
    boxShadow: String,
    color: String,
    fontFamily: String,
    fontSize: String,
    lineHeight: String,
    padding: String,
    position: String,
    transition: String,
    visibility: String,
    zIndex: Double
  ): BorderRadius = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], boxShadow = boxShadow.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadius]
  }
  
  @scala.inline
  implicit class BorderRadiusMutableBuilder[Self <: BorderRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
