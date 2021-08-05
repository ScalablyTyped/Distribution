package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isTypeMod {
  
  @JSImport("@antv/util/lib/is-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: js.Any, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
