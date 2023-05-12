package typings.atlaskitPlatformFeatureFlags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolversMod {
  
  @JSImport("@atlaskit/platform-feature-flags/dist/types/resolvers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBooleanFlag(flagKey: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveBooleanFlag")(flagKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setBooleanResolver(resolver: FeatureFlagResolverBoolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBooleanResolver")(resolver.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FeatureFlagResolverBoolean = js.Function1[/* key */ String, Boolean]
}
