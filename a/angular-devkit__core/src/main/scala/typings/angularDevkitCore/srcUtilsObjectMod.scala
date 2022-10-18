package typings.angularDevkitCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsObjectMod {
  
  @JSImport("@angular-devkit/core/src/utils/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
}
