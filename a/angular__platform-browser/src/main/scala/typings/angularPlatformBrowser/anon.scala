package typings.angularPlatformBrowser

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AppId extends StObject {
    
    var appId: String = js.native
  }
  object AppId {
    
    @scala.inline
    def apply(appId: String): AppId = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppId]
    }
    
    @scala.inline
    implicit class AppIdMutableBuilder[Self <: AppId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CssProps extends StObject {
    
    var cssProps: js.UndefOr[js.Any] = js.native
    
    var domEvents: js.UndefOr[Boolean] = js.native
    
    var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ js.Any, Boolean])] = js.native
    
    var inputClass: js.UndefOr[js.Any] = js.native
    
    var inputTarget: js.UndefOr[EventTarget] = js.native
    
    var preset: js.UndefOr[js.Array[_]] = js.native
    
    var recognizers: js.UndefOr[js.Array[_]] = js.native
    
    var touchAction: js.UndefOr[String] = js.native
  }
  object CssProps {
    
    @scala.inline
    def apply(): CssProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssProps]
    }
    
    @scala.inline
    implicit class CssPropsMutableBuilder[Self <: CssProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssProps(value: js.Any): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
      
      @scala.inline
      def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean | (js.Function1[/* manager */ js.Any, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFunction1(value: /* manager */ js.Any => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setInputClass(value: js.Any): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      @scala.inline
      def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
      
      @scala.inline
      def setPreset(value: js.Array[_]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setPresetVarargs(value: js.Any*): Self = StObject.set(x, "preset", js.Array(value :_*))
      
      @scala.inline
      def setRecognizers(value: js.Array[_]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
      
      @scala.inline
      def setRecognizersVarargs(value: js.Any*): Self = StObject.set(x, "recognizers", js.Array(value :_*))
      
      @scala.inline
      def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
  
  @js.native
  trait DomEventName extends StObject {
    
    var domEventName: String = js.native
    
    var fullKey: String = js.native
  }
  object DomEventName {
    
    @scala.inline
    def apply(domEventName: String, fullKey: String): DomEventName = {
      val __obj = js.Dynamic.literal(domEventName = domEventName.asInstanceOf[js.Any], fullKey = fullKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventName]
    }
    
    @scala.inline
    implicit class DomEventNameMutableBuilder[Self <: DomEventName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEventName(value: String): Self = StObject.set(x, "domEventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullKey(value: String): Self = StObject.set(x, "fullKey", value.asInstanceOf[js.Any])
    }
  }
}
