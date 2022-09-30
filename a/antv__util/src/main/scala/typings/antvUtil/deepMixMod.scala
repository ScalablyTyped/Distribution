package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepMixMod {
  
  @JSImport("@antv/util/lib/lodash/deep-mix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(rst: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(rst.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
