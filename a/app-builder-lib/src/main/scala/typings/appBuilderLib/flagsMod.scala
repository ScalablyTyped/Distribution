package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagsMod {
  
  @JSImport("app-builder-lib/out/util/flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAutoDiscoveryCodeSignIdentity(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoDiscoveryCodeSignIdentity")().asInstanceOf[Boolean]
  
  @scala.inline
  def isBuildCacheEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuildCacheEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def isUseSystemSigncode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUseSystemSigncode")().asInstanceOf[Boolean]
}
