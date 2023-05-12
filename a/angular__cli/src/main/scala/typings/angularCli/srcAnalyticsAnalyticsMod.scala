package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsAnalyticsMod {
  
  @JSImport("@angular/cli/src/analytics/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/cli/src/analytics/analytics", "analyticsPackageSafelist")
  @js.native
  val analyticsPackageSafelist: js.Array[String | js.RegExp] = js.native
  
  inline def getAnalyticsInfoString(context: CommandContext): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyticsInfoString")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getAnalyticsUserId(context: CommandContext): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyticsUserId")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def getAnalyticsUserId(context: CommandContext, skipPrompt: Boolean): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyticsUserId")(context.asInstanceOf[js.Any], skipPrompt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def isPackageNameSafeForAnalytics(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackageNameSafeForAnalytics")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def promptAnalytics(context: CommandContext, global: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("promptAnalytics")(context.asInstanceOf[js.Any], global.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def promptAnalytics(context: CommandContext, global: Boolean, force: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("promptAnalytics")(context.asInstanceOf[js.Any], global.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def setAnalyticsConfig(global: Boolean, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsConfig")(global.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setAnalyticsConfig(global: Boolean, value: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsConfig")(global.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
