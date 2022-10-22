package typings.ahooks

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseResponsiveMod {
  
  @JSImport("ahooks/lib/useResponsive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configResponsive(config: ResponsiveConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configResponsive")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResponsive(): ResponsiveInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsive")().asInstanceOf[ResponsiveInfo]
  
  type ResponsiveConfig = Record[String, Double]
  
  type ResponsiveInfo = Record[String, Boolean]
}
