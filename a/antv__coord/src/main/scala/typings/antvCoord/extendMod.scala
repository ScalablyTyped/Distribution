package typings.antvCoord

import typings.antvCoord.typeMod.Transform
import typings.antvCoord.typeMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendMod {
  
  @JSImport("@antv/coord/lib/utils/extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend(transform: Transform): js.Function1[/* vector */ Vector, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(transform.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* vector */ Vector, js.Array[Any]]]
}
