package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickMod {
  
  @JSImport("@antv/g2plot/lib/utils/pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pick(obj: Any, keys: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
