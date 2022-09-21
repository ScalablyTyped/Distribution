package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPositiveMod {
  
  @JSImport("@antv/util/lib/lodash/is-positive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
