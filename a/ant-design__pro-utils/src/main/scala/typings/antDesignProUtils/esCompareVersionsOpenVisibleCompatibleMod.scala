package typings.antDesignProUtils

import typings.antDesignProUtils.anon.OnOpenChange
import typings.antDesignProUtils.anon.OnVisibleChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCompareVersionsOpenVisibleCompatibleMod {
  
  @JSImport("@ant-design/pro-utils/es/compareVersions/openVisibleCompatible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  inline def openVisibleCompatible(): OnOpenChange | OnVisibleChange = ^.asInstanceOf[js.Dynamic].applyDynamic("openVisibleCompatible")().asInstanceOf[OnOpenChange | OnVisibleChange]
  inline def openVisibleCompatible(open: Boolean): OnOpenChange | OnVisibleChange = ^.asInstanceOf[js.Dynamic].applyDynamic("openVisibleCompatible")(open.asInstanceOf[js.Any]).asInstanceOf[OnOpenChange | OnVisibleChange]
  inline def openVisibleCompatible(open: Boolean, onOpenChange: Any): OnOpenChange | OnVisibleChange = (^.asInstanceOf[js.Dynamic].applyDynamic("openVisibleCompatible")(open.asInstanceOf[js.Any], onOpenChange.asInstanceOf[js.Any])).asInstanceOf[OnOpenChange | OnVisibleChange]
  inline def openVisibleCompatible(open: Unit, onOpenChange: Any): OnOpenChange | OnVisibleChange = (^.asInstanceOf[js.Dynamic].applyDynamic("openVisibleCompatible")(open.asInstanceOf[js.Any], onOpenChange.asInstanceOf[js.Any])).asInstanceOf[OnOpenChange | OnVisibleChange]
}
