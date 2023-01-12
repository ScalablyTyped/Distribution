package typings.antDesignPro

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignPro.anon.TypeofAuthorized
import typings.antDesignPro.libAuthorizedAuthorizedRouteMod.authority
import typings.antDesignPro.libAuthorizedAuthorizedRouteMod.default
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthorizedMod {
  
  @JSImport("ant-design-pro/lib/Authorized", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(currentAuthority: String): TypeofAuthorized = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(currentAuthority.asInstanceOf[js.Any]).asInstanceOf[TypeofAuthorized]
  
  @JSImport("ant-design-pro/lib/Authorized", "Authorized")
  @js.native
  open class Authorized protected () extends Component[IAuthorizedProps, Any, Any] {
    def this(props: IAuthorizedProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IAuthorizedProps, context: Any) = this()
  }
  /* static members */
  object Authorized {
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized.AuthorizedRoute")
    @js.native
    def AuthorizedRoute: Instantiable0[default] = js.native
    inline def AuthorizedRoute_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedRoute")(x.asInstanceOf[js.Any])
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized.Secured")
    @js.native
    def Secured: typings.antDesignPro.libAuthorizedMod.Secured = js.native
    inline def Secured_=(x: Secured): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Secured")(x.asInstanceOf[js.Any])
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized.check")
    @js.native
    def check: typings.antDesignPro.libAuthorizedMod.check = js.native
    inline def check_=(x: check): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
  }
  
  trait IAuthorizedProps extends StObject {
    
    var authority: typings.antDesignPro.libAuthorizedAuthorizedRouteMod.authority
    
    var noMatch: js.UndefOr[ReactNode] = js.undefined
  }
  object IAuthorizedProps {
    
    inline def apply(authority: authority): IAuthorizedProps = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAuthorizedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAuthorizedProps] (val x: Self) extends AnyVal {
      
      inline def setAuthority(value: authority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "authority", js.Any.fromFunction1(value))
      
      inline def setAuthorityVarargs(value: String*): Self = StObject.set(x, "authority", js.Array(value*))
      
      inline def setNoMatch(value: ReactNode): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
      
      inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    }
  }
  
  type IReactComponent[P] = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any) | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
  
  type Secured = js.Function2[
    /* authority */ authority, 
    /* error */ js.UndefOr[ReactNode], 
    js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any]]
  ]
  
  type check = js.Function3[
    /* authority */ authority, 
    /* target */ IReactComponent[Any], 
    /* Exception */ IReactComponent[Any], 
    IReactComponent[Any]
  ]
}
