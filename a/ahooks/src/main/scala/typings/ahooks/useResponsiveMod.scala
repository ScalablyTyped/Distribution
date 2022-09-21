package typings.ahooks

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResponsiveMod {
  
  @JSImport("ahooks/lib/useResponsive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configResponsive(config: ResponsiveConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configResponsive")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResponsive(): Record[String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsive")().asInstanceOf[Record[String, Boolean]]
  
  type ResponsiveConfig = Record[String, Double]
}
