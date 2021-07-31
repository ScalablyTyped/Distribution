package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIntegerMod {
  
  @JSImport("@antv/util/lib/is-integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
