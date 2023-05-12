package typings.atlaskitPlatformFeatureFlags

import typings.atlaskitPlatformFeatureFlags.distTypesResolversMod.FeatureFlagResolverBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/platform-feature-flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBooleanFF(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getBooleanFF")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setBooleanFeatureFlagResolver(flagResolver: FeatureFlagResolverBoolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBooleanFeatureFlagResolver")(flagResolver.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
