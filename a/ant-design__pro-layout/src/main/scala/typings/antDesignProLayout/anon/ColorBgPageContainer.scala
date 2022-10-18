package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorBgPageContainer extends StObject {
  
  /**
    * pageContainer 的背景颜色
    */
  var colorBgPageContainer: String
  
  /**
    * pageContainer 被固定时的背景颜色
    */
  var colorBgPageContainerFixed: String
  
  /**
    * pageContainer 自带的 margin block
    * @deprecated 请使用 paddingBlockPageContainerContent
    */
  var marginBlockPageContainerContent: Double
  
  /**
    * pageContainer 自带的 margin inline
    * @deprecated 请使用 paddingInlinePageContainerContent
    */
  var marginInlinePageContainerContent: Double
  
  /**
    * pageContainer 自带的 padding block
    */
  var paddingBlockPageContainerContent: Double
  
  /**
    * pageContainer 自带的 padding inline
    */
  var paddingInlinePageContainerContent: Double
}
object ColorBgPageContainer {
  
  inline def apply(
    colorBgPageContainer: String,
    colorBgPageContainerFixed: String,
    marginBlockPageContainerContent: Double,
    marginInlinePageContainerContent: Double,
    paddingBlockPageContainerContent: Double,
    paddingInlinePageContainerContent: Double
  ): ColorBgPageContainer = {
    val __obj = js.Dynamic.literal(colorBgPageContainer = colorBgPageContainer.asInstanceOf[js.Any], colorBgPageContainerFixed = colorBgPageContainerFixed.asInstanceOf[js.Any], marginBlockPageContainerContent = marginBlockPageContainerContent.asInstanceOf[js.Any], marginInlinePageContainerContent = marginInlinePageContainerContent.asInstanceOf[js.Any], paddingBlockPageContainerContent = paddingBlockPageContainerContent.asInstanceOf[js.Any], paddingInlinePageContainerContent = paddingInlinePageContainerContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBgPageContainer]
  }
  
  extension [Self <: ColorBgPageContainer](x: Self) {
    
    inline def setColorBgPageContainer(value: String): Self = StObject.set(x, "colorBgPageContainer", value.asInstanceOf[js.Any])
    
    inline def setColorBgPageContainerFixed(value: String): Self = StObject.set(x, "colorBgPageContainerFixed", value.asInstanceOf[js.Any])
    
    inline def setMarginBlockPageContainerContent(value: Double): Self = StObject.set(x, "marginBlockPageContainerContent", value.asInstanceOf[js.Any])
    
    inline def setMarginInlinePageContainerContent(value: Double): Self = StObject.set(x, "marginInlinePageContainerContent", value.asInstanceOf[js.Any])
    
    inline def setPaddingBlockPageContainerContent(value: Double): Self = StObject.set(x, "paddingBlockPageContainerContent", value.asInstanceOf[js.Any])
    
    inline def setPaddingInlinePageContainerContent(value: Double): Self = StObject.set(x, "paddingInlinePageContainerContent", value.asInstanceOf[js.Any])
  }
}
