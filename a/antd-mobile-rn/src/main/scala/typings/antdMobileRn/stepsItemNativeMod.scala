package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/steps/StepsItem.native", JSImport.Default)
  @js.native
  class default () extends StepsItem
  
  @js.native
  trait StepsItem
    extends Component[StepsItemProps, js.Any, js.Any]
  
  @js.native
  trait StepsItemProps extends StObject {
    
    var current: js.UndefOr[Double] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[String] = js.native
    
    var errorTail: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var last: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object StepsItemProps {
    
    @scala.inline
    def apply(): StepsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsItemProps]
    }
    
    @scala.inline
    implicit class StepsItemPropsMutableBuilder[Self <: StepsItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setErrorTail(value: Double): Self = StObject.set(x, "errorTail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTailUndefined: Self = StObject.set(x, "errorTail", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
