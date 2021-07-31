package typings.antDesignProLayout

import typings.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("@ant-design/pro-layout/lib/Header", JSImport.Default)
  @js.native
  class default () extends HeaderView
  
  @js.native
  trait HeaderView
    extends Component[HeaderViewProps & PrivateSiderMenuProps, HeaderViewState, js.Any] {
    
    def renderContent(): js.UndefOr[js.Object | Null] = js.native
  }
  
  trait HeaderViewProps
    extends StObject
       with GlobalHeaderProps {
    
    var hasSiderMenu: js.UndefOr[Boolean] = js.undefined
    
    var headerContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.undefined
    
    var headerRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.undefined
    
    var headerTitleRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.undefined
    
    var siderWidth: js.UndefOr[Double] = js.undefined
  }
  object HeaderViewProps {
    
    @scala.inline
    def apply(): HeaderViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderViewProps]
    }
    
    @scala.inline
    implicit class HeaderViewPropsMutableBuilder[Self <: HeaderViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasSiderMenu(value: Boolean): Self = StObject.set(x, "hasSiderMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSiderMenuUndefined: Self = StObject.set(x, "hasSiderMenu", js.undefined)
      
      @scala.inline
      def setHeaderContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactNode]]): Self = StObject.set(x, "headerContentRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderContentRenderFunction1(value: HeaderViewProps => ReactNode): Self = StObject.set(x, "headerContentRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderContentRenderUndefined: Self = StObject.set(x, "headerContentRender", js.undefined)
      
      @scala.inline
      def setHeaderRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "headerRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      @scala.inline
      def setHeaderTitleRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "headerTitleRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitleRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "headerTitleRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderTitleRenderUndefined: Self = StObject.set(x, "headerTitleRender", js.undefined)
      
      @scala.inline
      def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
    }
  }
  
  trait HeaderViewState extends StObject {
    
    var visible: Boolean
  }
  object HeaderViewState {
    
    @scala.inline
    def apply(visible: Boolean): HeaderViewState = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderViewState]
    }
    
    @scala.inline
    implicit class HeaderViewStateMutableBuilder[Self <: HeaderViewState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
