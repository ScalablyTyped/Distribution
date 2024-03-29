package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.atlaskitAnalyticsNextStrings.createAnalyticsEvent
import typings.atlaskitAnalyticsNext.atlaskitAnalyticsNextStrings.ref
import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventPayload
import typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateEventMap
import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateUIAnalyticsEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.JSXElementConstructor
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHocsWithAnalyticsEventsMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hocs/withAnalyticsEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ]]
  inline def default(createEventMap: CreateEventMap): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(createEventMap.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ]]
  
  trait WithAnalyticsEventsProps extends StObject {
    
    /**
      * You should not be accessing this prop under any circumstances.
      * It is provided by `@atlaskit/analytics-next` and integrated in the component
      */
    var createAnalyticsEvent: js.UndefOr[CreateUIAnalyticsEvent] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object WithAnalyticsEventsProps {
    
    inline def apply(): WithAnalyticsEventsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithAnalyticsEventsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithAnalyticsEventsProps] (val x: Self) extends AnyVal {
      
      inline def setCreateAnalyticsEvent(value: /* payload */ AnalyticsEventPayload => default): Self = StObject.set(x, "createAnalyticsEvent", js.Any.fromFunction1(value))
      
      inline def setCreateAnalyticsEventUndefined: Self = StObject.set(x, "createAnalyticsEvent", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
