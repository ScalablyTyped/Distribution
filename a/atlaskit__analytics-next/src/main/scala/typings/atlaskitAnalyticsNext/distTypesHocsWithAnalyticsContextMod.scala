package typings.atlaskitAnalyticsNext

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.JSXElementConstructor
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHocsWithAnalyticsContextMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hocs/withAnalyticsContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ]]
  inline def default(defaultData: Any): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultData.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ]]
  
  trait WithContextProps extends StObject {
    
    var analyticsContext: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object WithContextProps {
    
    inline def apply(): WithContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithContextProps]
    }
    
    extension [Self <: WithContextProps](x: Self) {
      
      inline def setAnalyticsContext(value: Record[String, Any]): Self = StObject.set(x, "analyticsContext", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsContextUndefined: Self = StObject.set(x, "analyticsContext", js.undefined)
    }
  }
}
