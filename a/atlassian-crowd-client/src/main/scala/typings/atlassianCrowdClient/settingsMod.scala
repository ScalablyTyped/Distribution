package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  trait Settings extends StObject {
    
    val application: Password
    
    val attributesEncoder: js.UndefOr[js.Function1[/* obj */ Any, String]] = js.undefined
    
    val attributesParser: js.UndefOr[js.Function1[/* json */ String, Any]] = js.undefined
    
    val baseUrl: String
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val nesting: js.UndefOr[Boolean] = js.undefined
    
    val sessionTimeout: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(application: Password, baseUrl: String): Settings = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: Password): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setAttributesEncoder(value: /* obj */ Any => String): Self = StObject.set(x, "attributesEncoder", js.Any.fromFunction1(value))
      
      inline def setAttributesEncoderUndefined: Self = StObject.set(x, "attributesEncoder", js.undefined)
      
      inline def setAttributesParser(value: /* json */ String => Any): Self = StObject.set(x, "attributesParser", js.Any.fromFunction1(value))
      
      inline def setAttributesParserUndefined: Self = StObject.set(x, "attributesParser", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setNesting(value: Boolean): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setNestingUndefined: Self = StObject.set(x, "nesting", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
}
