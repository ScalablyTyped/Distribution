package typings.antDesignPro

import typings.react.mod.Component
import typings.reactRouter.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizedRouteMod {
  
  @JSImport("ant-design-pro/lib/Authorized/AuthorizedRoute", JSImport.Default)
  @js.native
  class default ()
    extends Component[IAuthorizedRouteProps, js.Any, js.Any]
  
  type AuthorizedRoute = Component[IAuthorizedRouteProps, js.Any, js.Any]
  
  trait IAuthorizedRouteProps
    extends StObject
       with RouteProps {
    
    var authority: typings.antDesignPro.authorizedRouteMod.authority
  }
  object IAuthorizedRouteProps {
    
    @scala.inline
    def apply(authority: authority): IAuthorizedRouteProps = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAuthorizedRouteProps]
    }
    
    @scala.inline
    implicit class IAuthorizedRoutePropsMutableBuilder[Self <: IAuthorizedRouteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: authority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "authority", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAuthorityVarargs(value: String*): Self = StObject.set(x, "authority", js.Array(value :_*))
    }
  }
  
  type authority = String | js.Array[String] | authorityFN | js.Promise[js.Any]
  
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[String], Boolean]
}
