package typings.angularPlatformBrowser

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppId extends StObject {
    
    var appId: String
  }
  object AppId {
    
    inline def apply(appId: String): AppId = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppId]
    }
    
    extension [Self <: AppId](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CssProps extends StObject {
    
    var cssProps: js.UndefOr[js.Any] = js.undefined
    
    var domEvents: js.UndefOr[Boolean] = js.undefined
    
    var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ js.Any, Boolean])] = js.undefined
    
    var inputClass: js.UndefOr[js.Any] = js.undefined
    
    var inputTarget: js.UndefOr[EventTarget] = js.undefined
    
    var preset: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var recognizers: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
  }
  object CssProps {
    
    inline def apply(): CssProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssProps]
    }
    
    extension [Self <: CssProps](x: Self) {
      
      inline def setCssProps(value: js.Any): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
      
      inline def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
      
      inline def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
      
      inline def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
      
      inline def setEnable(value: Boolean | (js.Function1[/* manager */ js.Any, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableFunction1(value: /* manager */ js.Any => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setInputClass(value: js.Any): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      inline def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
      
      inline def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
      
      inline def setPreset(value: js.Array[js.Any]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setPresetVarargs(value: js.Any*): Self = StObject.set(x, "preset", js.Array(value :_*))
      
      inline def setRecognizers(value: js.Array[js.Any]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
      
      inline def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
      
      inline def setRecognizersVarargs(value: js.Any*): Self = StObject.set(x, "recognizers", js.Array(value :_*))
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
  
  trait DomEventName extends StObject {
    
    var domEventName: String
    
    var fullKey: String
  }
  object DomEventName {
    
    inline def apply(domEventName: String, fullKey: String): DomEventName = {
      val __obj = js.Dynamic.literal(domEventName = domEventName.asInstanceOf[js.Any], fullKey = fullKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventName]
    }
    
    extension [Self <: DomEventName](x: Self) {
      
      inline def setDomEventName(value: String): Self = StObject.set(x, "domEventName", value.asInstanceOf[js.Any])
      
      inline def setFullKey(value: String): Self = StObject.set(x, "fullKey", value.asInstanceOf[js.Any])
    }
  }
}
