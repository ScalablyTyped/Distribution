package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPathCommandMod {
  
  @JSImport("@antv/util/lib/path/parser/is-path-command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPathCommand(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathCommand")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
