package typings.antvG2

import typings.antvG2.anon.Added
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("@antv/g2/lib/geometry/util/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diff(keyItem: Record[String, Any], keys: js.Array[String]): Added = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(keyItem.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Added]
}
