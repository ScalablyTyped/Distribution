package typings.atlaskitAnalyticsNext

import org.scalablytyped.runtime.StringDictionary
import typings.atlaskitAnalyticsNext.anon.OmitAnalyticsErrorBoundar
import typings.atlaskitAnalyticsNext.atlaskitAnalyticsNextStrings.createAnalyticsEvent
import typings.atlaskitAnalyticsNext.atlaskitAnalyticsNextStrings.ref
import typings.atlaskitAnalyticsNext.distTypesComponentsAnalyticsContextTypesMod.AnalyticsContextFunction
import typings.atlaskitAnalyticsNext.distTypesComponentsAnalyticsListenerTypesMod.AnalyticsListenerFunction
import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventPayload
import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventProps
import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.default
import typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.UIAnalyticsEventProps
import typings.atlaskitAnalyticsNext.distTypesHocsWithAnalyticsContextMod.WithContextProps
import typings.atlaskitAnalyticsNext.distTypesHocsWithAnalyticsEventsMod.WithAnalyticsEventsProps
import typings.atlaskitAnalyticsNext.distTypesHooksUseAnalyticsEventsMod.UseAnalyticsEventsHook
import typings.atlaskitAnalyticsNext.distTypesHooksUseCallbackWithAnalyticsMod.UseCallbackWithAnalyticsHook
import typings.atlaskitAnalyticsNext.distTypesHooksUsePlatformLeafEventHandlerMod.UsePlatformLeafEventHandlerHookArgs
import typings.atlaskitAnalyticsNext.distTypesHooksUsePlatformLeafSyntheticEventHandlerMod.UsePlatformLeafSyntheticEventHandlerHookArgs
import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateEventMap
import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateUIAnalyticsEvent
import typings.atlaskitAnalyticsNextStableReactContext.distCjsTypesMod.AnalyticsReactContextInterface
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.JSXElementConstructor
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/analytics-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsContext")
  @js.native
  def AnalyticsContext: AnalyticsContextFunction = js.native
  inline def AnalyticsContext_=(x: AnalyticsContextFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsContext")(x.asInstanceOf[js.Any])
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsErrorBoundary")
  @js.native
  val AnalyticsErrorBoundary: ForwardRefExoticComponent[OmitAnalyticsErrorBoundar] = js.native
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsEvent")
  @js.native
  open class AnalyticsEvent protected () extends default {
    def this(props: AnalyticsEventProps) = this()
  }
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsListener")
  @js.native
  def AnalyticsListener: AnalyticsListenerFunction = js.native
  inline def AnalyticsListener_=(x: AnalyticsListenerFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsListener")(x.asInstanceOf[js.Any])
  
  @JSImport("@atlaskit/analytics-next", "AnalyticsReactContext")
  @js.native
  val AnalyticsReactContext: Context[AnalyticsReactContextInterface] = js.native
  
  @JSImport("@atlaskit/analytics-next", "UIAnalyticsEvent")
  @js.native
  open class UIAnalyticsEvent protected ()
    extends typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default {
    def this(props: UIAnalyticsEventProps) = this()
  }
  
  inline def cleanProps(props: Record[String, Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanProps")(props.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def createAndFireEvent(): js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAndFireEvent")().asInstanceOf[js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ]]
  inline def createAndFireEvent(channel: String): js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAndFireEvent")(channel.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ]]
  
  inline def isAnalyticsEvent(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnalyticsEvent")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUIAnalyticsEvent(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUIAnalyticsEvent")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useAnalyticsEvents(): UseAnalyticsEventsHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnalyticsEvents")().asInstanceOf[UseAnalyticsEventsHook]
  
  @JSImport("@atlaskit/analytics-next", "useCallbackWithAnalytics")
  @js.native
  val useCallbackWithAnalytics: UseCallbackWithAnalyticsHook = js.native
  
  inline def usePlatformLeafEventHandler[T](param0: UsePlatformLeafEventHandlerHookArgs[T]): js.Function1[/* value */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlatformLeafEventHandler")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ T, Unit]]
  
  inline def usePlatformLeafSyntheticEventHandler(param0: UsePlatformLeafSyntheticEventHandlerHookArgs): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlatformLeafSyntheticEventHandler")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def withAnalyticsContext(): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAnalyticsContext")().asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ]]
  inline def withAnalyticsContext(defaultData: Any): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAnalyticsContext")(defaultData.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[Any] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[LibraryManagedAttributes[Any, Any & WithContextProps]]) & RefAttributes[Any]
    ]
  ]]
  
  inline def withAnalyticsEvents(): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAnalyticsEvents")().asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ]]
  inline def withAnalyticsEvents(createEventMap: CreateEventMap): js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAnalyticsEvents")(createEventMap.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ JSXElementConstructor[WithAnalyticsEventsProps] & Any, 
    ForwardRefExoticComponent[
      (PropsWithoutRef[
        LibraryManagedAttributes[Any, Omit[WithAnalyticsEventsProps, createAnalyticsEvent | ref]]
      ]) & RefAttributes[Any]
    ]
  ]]
}
