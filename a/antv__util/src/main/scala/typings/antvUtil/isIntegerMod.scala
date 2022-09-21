package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIntegerMod {
  
  @JSImport("@antv/util/lib/lodash/is-integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(number: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
