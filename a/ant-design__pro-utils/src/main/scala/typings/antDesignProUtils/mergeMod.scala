package typings.antDesignProUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("@ant-design/pro-utils/es/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge[T](rest: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(rest.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
}
