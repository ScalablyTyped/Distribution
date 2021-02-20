package typings.alloy

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<titanium.Titanium.Proxy> */
  @js.native
  trait PartialProxy extends StObject {
    
    var addEventListener: js.UndefOr[
        js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
      ] = js.native
    
    var apiName: js.UndefOr[String] = js.native
    
    var applyProperties: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
    
    var bubbleParent: js.UndefOr[Boolean] = js.native
    
    var fireEvent: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
    
    var getApiName: js.UndefOr[js.Function0[String]] = js.native
    
    var getBubbleParent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var getLifecycleContainer: js.UndefOr[js.Function0[Window | TabGroup]] = js.native
    
    var id: js.UndefOr[String | Double] = js.native
    
    var lifecycleContainer: js.UndefOr[Window | TabGroup] = js.native
    
    var removeEventListener: js.UndefOr[
        js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
      ] = js.native
    
    var setBubbleParent: js.UndefOr[js.Function1[/* bubbleParent */ Boolean, Unit]] = js.native
    
    var setLifecycleContainer: js.UndefOr[js.Function1[/* lifecycleContainer */ Window | TabGroup, Unit]] = js.native
  }
  object PartialProxy {
    
    @scala.inline
    def apply(): PartialProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialProxy]
    }
    
    @scala.inline
    implicit class PartialProxyMutableBuilder[Self <: PartialProxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
      
      @scala.inline
      def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
      
      @scala.inline
      def setApplyProperties(value: /* props */ js.Any => Unit): Self = StObject.set(x, "applyProperties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyPropertiesUndefined: Self = StObject.set(x, "applyProperties", js.undefined)
      
      @scala.inline
      def setBubbleParent(value: Boolean): Self = StObject.set(x, "bubbleParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleParentUndefined: Self = StObject.set(x, "bubbleParent", js.undefined)
      
      @scala.inline
      def setFireEvent(value: /* name */ String => Unit): Self = StObject.set(x, "fireEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
      
      @scala.inline
      def setGetApiName(value: () => String): Self = StObject.set(x, "getApiName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetApiNameUndefined: Self = StObject.set(x, "getApiName", js.undefined)
      
      @scala.inline
      def setGetBubbleParent(value: () => Boolean): Self = StObject.set(x, "getBubbleParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBubbleParentUndefined: Self = StObject.set(x, "getBubbleParent", js.undefined)
      
      @scala.inline
      def setGetLifecycleContainer(value: () => Window | TabGroup): Self = StObject.set(x, "getLifecycleContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLifecycleContainerUndefined: Self = StObject.set(x, "getLifecycleContainer", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLifecycleContainer(value: Window | TabGroup): Self = StObject.set(x, "lifecycleContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleContainerUndefined: Self = StObject.set(x, "lifecycleContainer", js.undefined)
      
      @scala.inline
      def setRemoveEventListener(value: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
      
      @scala.inline
      def setSetBubbleParent(value: /* bubbleParent */ Boolean => Unit): Self = StObject.set(x, "setBubbleParent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBubbleParentUndefined: Self = StObject.set(x, "setBubbleParent", js.undefined)
      
      @scala.inline
      def setSetLifecycleContainer(value: /* lifecycleContainer */ Window | TabGroup => Unit): Self = StObject.set(x, "setLifecycleContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLifecycleContainerUndefined: Self = StObject.set(x, "setLifecycleContainer", js.undefined)
    }
  }
}
