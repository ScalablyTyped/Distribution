package typings.a2hsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].apply(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("a2hs.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Settings extends StObject {
    
    /**
      * Background color for container
      * @default '#f9f9f9'
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Brand for default `htmlContent`
      * @default ''
      */
    var brandName: js.UndefOr[String] = js.undefined
    
    /**
      * Font color for content in container
      * @default '#5d5d5d'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Font family for content in container
      * @default '-apple-system, sans-serif'
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Font size for content in container
      * @default '0.9rem'
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /**
      * Content for container with HTML
      */
    var htmlContent: js.UndefOr[String] = js.undefined
    
    /**
      * Logo for container
      */
    var logoImage: js.UndefOr[String] = js.undefined
    
    /**
      * Padding for container
      * @default '10px'
      */
    var padding: js.UndefOr[String] = js.undefined
    
    /**
      * Shadow color for top of container
      * @default '#e9e9e9'
      */
    var shadowColor: js.UndefOr[String] = js.undefined
    
    /**
      * Shadow size for top of container
      * @default '10px'
      */
    var shadowSize: js.UndefOr[String] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
      
      inline def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
      
      inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
      
      inline def setLogoImage(value: String): Self = StObject.set(x, "logoImage", value.asInstanceOf[js.Any])
      
      inline def setLogoImageUndefined: Self = StObject.set(x, "logoImage", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      inline def setShadowSize(value: String): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
      
      inline def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    }
  }
}
