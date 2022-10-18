package typings.angularCli

import typings.angularCli.angularCliStrings.global
import typings.angularCli.angularCliStrings.local
import typings.angularCli.srcAnalyticsAnalyticsCollectorMod.AnalyticsCollector
import typings.angularDevkitCore.mod.analytics.NoopAnalytics
import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsAnalyticsMod {
  
  @JSImport("@angular/cli/src/analytics/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AnalyticsProperties {
    
    @JSImport("@angular/cli/src/analytics/analytics", "AnalyticsProperties")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/cli/src/analytics/analytics", "AnalyticsProperties.AngularCliDefault")
    @js.native
    val AngularCliDefault: String = js.native
    
    @JSImport("@angular/cli/src/analytics/analytics", "AnalyticsProperties.AngularCliProd")
    @js.native
    def AngularCliProd: String = js.native
    inline def AngularCliProd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AngularCliProd")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/cli/src/analytics/analytics", "AnalyticsProperties.AngularCliStaging")
    @js.native
    def AngularCliStaging: String = js.native
    inline def AngularCliStaging_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AngularCliStaging")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/cli/src/analytics/analytics", "analyticsPackageSafelist")
  @js.native
  val analyticsPackageSafelist: js.Array[String | js.RegExp] = js.native
  
  inline def createAnalytics(workspace: Boolean): js.Promise[Analytics] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnalytics")(workspace.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Analytics]]
  inline def createAnalytics(workspace: Boolean, skipPrompt: Boolean): js.Promise[Analytics] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnalytics")(workspace.asInstanceOf[js.Any], skipPrompt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Analytics]]
  
  inline def getAnalytics(level: local | global): js.Promise[js.UndefOr[AnalyticsCollector | NoopAnalytics]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")(level.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[AnalyticsCollector | NoopAnalytics]]]
  
  inline def getAnalyticsInfoString(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyticsInfoString")().asInstanceOf[js.Promise[String]]
  
  inline def getSharedAnalytics(): js.Promise[js.UndefOr[AnalyticsCollector]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSharedAnalytics")().asInstanceOf[js.Promise[js.UndefOr[AnalyticsCollector]]]
  
  inline def isPackageNameSafeForAnalytics(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackageNameSafeForAnalytics")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def promptAnalytics(global: Boolean): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptAnalytics")(global.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def promptAnalytics(global: Boolean, force: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("promptAnalytics")(global.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def setAnalyticsConfig(global: Boolean, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsConfig")(global.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setAnalyticsConfig(global: Boolean, value: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsConfig")(global.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
