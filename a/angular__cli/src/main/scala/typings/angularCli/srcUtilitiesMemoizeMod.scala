package typings.angularCli

import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesMemoizeMod {
  
  @JSImport("@angular/cli/src/utilities/memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoize[T](target: js.Object, propertyKey: String, descriptor: TypedPropertyDescriptor[T]): TypedPropertyDescriptor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[TypedPropertyDescriptor[T]]
  inline def memoize[T](target: js.Object, propertyKey: js.Symbol, descriptor: TypedPropertyDescriptor[T]): TypedPropertyDescriptor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[TypedPropertyDescriptor[T]]
}
