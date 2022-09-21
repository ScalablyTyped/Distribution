package typings.accessorFn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("accessor-fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(accessorParam: String): AccessorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(accessorParam.asInstanceOf[js.Any]).asInstanceOf[AccessorFn]
  inline def default(accessorParam: Any): AccessorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(accessorParam.asInstanceOf[js.Any]).asInstanceOf[AccessorFn]
  inline def default(accessorParam: AccessorFn): AccessorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(accessorParam.asInstanceOf[js.Any]).asInstanceOf[AccessorFn]
  
  type AccessorFn = js.Function1[/* item */ Any, Any]
}
