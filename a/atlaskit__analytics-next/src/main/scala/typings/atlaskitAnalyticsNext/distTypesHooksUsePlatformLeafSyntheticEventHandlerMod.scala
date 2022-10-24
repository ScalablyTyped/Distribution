package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUsePlatformLeafSyntheticEventHandlerMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hooks/usePlatformLeafSyntheticEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePlatformLeafSyntheticEventHandler(param0: UsePlatformLeafSyntheticEventHandlerHookArgs): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlatformLeafSyntheticEventHandler")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  type UsePlatformLeafSyntheticEventHandlerHook = js.Function0[Unit]
  
  trait UsePlatformLeafSyntheticEventHandlerHookArgs extends StObject {
    
    var action: String
    
    var analyticsData: js.UndefOr[Record[String, Any]] = js.undefined
    
    var componentName: String
    
    def fn(analyticsEvent: default): Unit
    
    var packageName: String
    
    var packageVersion: String
  }
  object UsePlatformLeafSyntheticEventHandlerHookArgs {
    
    inline def apply(
      action: String,
      componentName: String,
      fn: default => Unit,
      packageName: String,
      packageVersion: String
    ): UsePlatformLeafSyntheticEventHandlerHookArgs = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), packageName = packageName.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePlatformLeafSyntheticEventHandlerHookArgs]
    }
    
    extension [Self <: UsePlatformLeafSyntheticEventHandlerHookArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsData(value: Record[String, Any]): Self = StObject.set(x, "analyticsData", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsDataUndefined: Self = StObject.set(x, "analyticsData", js.undefined)
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setFn(value: default => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    }
  }
}
