package typings.atlaskitAnalyticsNext

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitAnalyticsNext.analyticsListenerTypesMod.AnalyticsListenerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modernAnalyticsListenerMod extends Shortcut {
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/ModernAnalyticsListener", JSImport.Default)
  @js.native
  val default: AnalyticsListenerFunction = js.native
  
  type _To = AnalyticsListenerFunction
  
  /* This means you don't have to write `default`, but can instead just say `modernAnalyticsListenerMod.foo` */
  override def _to: AnalyticsListenerFunction = default
}
