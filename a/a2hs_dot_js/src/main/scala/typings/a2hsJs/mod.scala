package typings.a2hsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("a2hs.js", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("a2hs.js", JSImport.Namespace)
  @js.native
  def apply(settings: Settings): Unit = js.native
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * Background color for container
      * @default '#f9f9f9'
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Brand for default `htmlContent`
      * @default ''
      */
    var brandName: js.UndefOr[String] = js.native
    
    /**
      * Font color for content in container
      * @default '#5d5d5d'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Font family for content in container
      * @default '-apple-system, sans-serif'
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /**
      * Font size for content in container
      * @default '0.9rem'
      */
    var fontSize: js.UndefOr[String] = js.native
    
    /**
      * Content for container with HTML
      */
    var htmlContent: js.UndefOr[String] = js.native
    
    /**
      * Logo for container
      */
    var logoImage: js.UndefOr[String] = js.native
    
    /**
      * Padding for container
      * @default '10px'
      */
    var padding: js.UndefOr[String] = js.native
    
    /**
      * Shadow color for top of container
      * @default '#e9e9e9'
      */
    var shadowColor: js.UndefOr[String] = js.native
    
    /**
      * Shadow size for top of container
      * @default '10px'
      */
    var shadowSize: js.UndefOr[String] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
      
      @scala.inline
      def setLogoImage(value: String): Self = StObject.set(x, "logoImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoImageUndefined: Self = StObject.set(x, "logoImage", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      @scala.inline
      def setShadowSize(value: String): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    }
  }
}
