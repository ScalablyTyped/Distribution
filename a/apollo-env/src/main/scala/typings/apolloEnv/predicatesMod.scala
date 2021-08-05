package typings.apolloEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicatesMod {
  
  @JSImport("apollo-env/lib/utils/predicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNotNullOrUndefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")().asInstanceOf[/* is T */ Boolean]
  inline def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
}
