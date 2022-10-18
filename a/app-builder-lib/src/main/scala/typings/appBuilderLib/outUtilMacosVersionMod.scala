package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilMacosVersionMod {
  
  @JSImport("app-builder-lib/out/util/macosVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMacOsCatalina(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsCatalina")().asInstanceOf[Boolean]
  
  inline def isMacOsHighSierra(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsHighSierra")().asInstanceOf[Boolean]
  
  inline def isMacOsSierra(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsSierra")().asInstanceOf[js.Promise[Boolean]]
}
