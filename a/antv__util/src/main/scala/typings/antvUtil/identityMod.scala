package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  @JSImport("@antv/util/lib/lodash/identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](v: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(v.asInstanceOf[js.Any]).asInstanceOf[T]
}
