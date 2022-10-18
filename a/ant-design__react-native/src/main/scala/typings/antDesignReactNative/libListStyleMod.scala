package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListStyleMod {
  
  @JSImport("@ant-design/react-native/lib/list/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(variables: Theme): ListStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(variables.asInstanceOf[js.Any]).asInstanceOf[ListStyle]
  
  trait ListStyle extends StObject {
    
    var Arrow: TextStyle
    
    var ArrowV: TextStyle
    
    var Body: ViewStyle
    
    var BodyBottomLine: ViewStyle
    
    var Brief: ViewStyle
    
    var BriefText: TextStyle
    
    var Content: TextStyle
    
    var Extra: TextStyle
    
    var Footer: TextStyle
    
    var Header: TextStyle
    
    var Item: ViewStyle
    
    var Line: ViewStyle
    
    var Thumb: ImageStyle
    
    var column: ViewStyle
    
    var multipleLine: ViewStyle
    
    var multipleThumb: ImageStyle
    
    var underlayColor: ViewStyle
  }
  object ListStyle {
    
    inline def apply(
      Arrow: TextStyle,
      ArrowV: TextStyle,
      Body: ViewStyle,
      BodyBottomLine: ViewStyle,
      Brief: ViewStyle,
      BriefText: TextStyle,
      Content: TextStyle,
      Extra: TextStyle,
      Footer: TextStyle,
      Header: TextStyle,
      Item: ViewStyle,
      Line: ViewStyle,
      Thumb: ImageStyle,
      column: ViewStyle,
      multipleLine: ViewStyle,
      multipleThumb: ImageStyle,
      underlayColor: ViewStyle
    ): ListStyle = {
      val __obj = js.Dynamic.literal(Arrow = Arrow.asInstanceOf[js.Any], ArrowV = ArrowV.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyBottomLine = BodyBottomLine.asInstanceOf[js.Any], Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Extra = Extra.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Thumb = Thumb.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], multipleLine = multipleLine.asInstanceOf[js.Any], multipleThumb = multipleThumb.asInstanceOf[js.Any], underlayColor = underlayColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStyle]
    }
    
    extension [Self <: ListStyle](x: Self) {
      
      inline def setArrow(value: TextStyle): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowV(value: TextStyle): Self = StObject.set(x, "ArrowV", value.asInstanceOf[js.Any])
      
      inline def setBody(value: ViewStyle): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyBottomLine(value: ViewStyle): Self = StObject.set(x, "BodyBottomLine", value.asInstanceOf[js.Any])
      
      inline def setBrief(value: ViewStyle): Self = StObject.set(x, "Brief", value.asInstanceOf[js.Any])
      
      inline def setBriefText(value: TextStyle): Self = StObject.set(x, "BriefText", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: ViewStyle): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setContent(value: TextStyle): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: TextStyle): Self = StObject.set(x, "Extra", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: TextStyle): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: TextStyle): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ViewStyle): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setLine(value: ViewStyle): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
      
      inline def setMultipleLine(value: ViewStyle): Self = StObject.set(x, "multipleLine", value.asInstanceOf[js.Any])
      
      inline def setMultipleThumb(value: ImageStyle): Self = StObject.set(x, "multipleThumb", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: ImageStyle): Self = StObject.set(x, "Thumb", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColor(value: ViewStyle): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    }
  }
}
