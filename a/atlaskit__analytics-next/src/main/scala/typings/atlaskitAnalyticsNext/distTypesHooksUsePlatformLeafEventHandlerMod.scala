package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUsePlatformLeafEventHandlerMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hooks/usePlatformLeafEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePlatformLeafEventHandler[T](param0: UsePlatformLeafEventHandlerHookArgs[T]): js.Function1[/* value */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlatformLeafEventHandler")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ T, Unit]]
  
  type UsePlatformLeafEventHandlerHook[T] = js.Function1[/* value */ T, Unit]
  
  trait UsePlatformLeafEventHandlerHookArgs[T] extends StObject {
    
    var action: String
    
    var actionSubject: js.UndefOr[String] = js.undefined
    
    var analyticsData: js.UndefOr[Record[String, Any]] = js.undefined
    
    var componentName: String
    
    def fn(value: T, analyticsEvent: default): Unit
    
    var packageName: String
    
    var packageVersion: String
  }
  object UsePlatformLeafEventHandlerHookArgs {
    
    inline def apply[T](
      action: String,
      componentName: String,
      fn: (T, default) => Unit,
      packageName: String,
      packageVersion: String
    ): UsePlatformLeafEventHandlerHookArgs[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn), packageName = packageName.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePlatformLeafEventHandlerHookArgs[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsePlatformLeafEventHandlerHookArgs[?], T] (val x: Self & UsePlatformLeafEventHandlerHookArgs[T]) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionSubject(value: String): Self = StObject.set(x, "actionSubject", value.asInstanceOf[js.Any])
      
      inline def setActionSubjectUndefined: Self = StObject.set(x, "actionSubject", js.undefined)
      
      inline def setAnalyticsData(value: Record[String, Any]): Self = StObject.set(x, "analyticsData", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsDataUndefined: Self = StObject.set(x, "analyticsData", js.undefined)
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setFn(value: (T, default) => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    }
  }
}
