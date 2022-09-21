package typings.antvG2

import typings.antvG2.libInterfaceMod.Data
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupDataMod {
  
  @JSImport("@antv/g2/lib/geometry/util/group-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def group(data: Data, fields: js.Array[String]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def group(data: Data, fields: js.Array[String], appendConditions: Record[String, js.Array[Any]]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], appendConditions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
