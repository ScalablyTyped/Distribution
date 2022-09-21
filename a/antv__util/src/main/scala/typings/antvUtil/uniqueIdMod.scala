package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueIdMod {
  
  @JSImport("@antv/util/lib/lodash/unique-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
}
