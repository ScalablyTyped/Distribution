package typings.atlaskitDsLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationWarningMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/utils/deprecation-warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(packageName: String, api: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(packageName.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(packageName: String, api: String, additionalMessage: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(packageName.asInstanceOf[js.Any], api.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def propDeprecationWarning(packageName: String, propName: String, predicate: Boolean, deprecationAnnouncementOnDAC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propDeprecationWarning")(packageName.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], deprecationAnnouncementOnDAC.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
