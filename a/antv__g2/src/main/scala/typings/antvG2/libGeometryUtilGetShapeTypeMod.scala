package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryUtilGetShapeTypeMod {
  
  @JSImport("@antv/g2/lib/geometry/util/get-shape-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getShapeType(shapeCfg: Any, defaultShapeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getShapeType")(shapeCfg.asInstanceOf[js.Any], defaultShapeType.asInstanceOf[js.Any])).asInstanceOf[String]
}
