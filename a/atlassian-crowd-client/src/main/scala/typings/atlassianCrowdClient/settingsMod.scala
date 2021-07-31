package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  trait Settings extends StObject {
    
    val application: Password
    
    val attributesEncoder: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.undefined
    
    val attributesParser: js.UndefOr[js.Function1[/* json */ String, js.Any]] = js.undefined
    
    val baseUrl: String
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val nesting: js.UndefOr[Boolean] = js.undefined
    
    val sessionTimeout: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    @scala.inline
    def apply(application: Password, baseUrl: String): Settings = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Password): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesEncoder(value: /* obj */ js.Any => String): Self = StObject.set(x, "attributesEncoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributesEncoderUndefined: Self = StObject.set(x, "attributesEncoder", js.undefined)
      
      @scala.inline
      def setAttributesParser(value: /* json */ String => js.Any): Self = StObject.set(x, "attributesParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributesParserUndefined: Self = StObject.set(x, "attributesParser", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setNesting(value: Boolean): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingUndefined: Self = StObject.set(x, "nesting", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
}
