package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagsMod {
  
  @JSImport("app-builder-lib/out/util/flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAutoDiscoveryCodeSignIdentity(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoDiscoveryCodeSignIdentity")().asInstanceOf[Boolean]
  
  inline def isBuildCacheEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuildCacheEnabled")().asInstanceOf[Boolean]
  
  inline def isUseSystemSigncode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUseSystemSigncode")().asInstanceOf[Boolean]
}
