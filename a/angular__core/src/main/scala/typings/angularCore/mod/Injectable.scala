package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Injectable extends StObject {
  
  /**
    * Determines which injectors will provide the injectable.
    *
    * - `Type<any>` - associates the injectable with an `@NgModule` or other `InjectorType`. This
    * option is DEPRECATED.
    * - 'null' : Equivalent to `undefined`. The injectable is not provided in any scope automatically
    * and must be added to a `providers` array of an [@NgModule](api/core/NgModule#providers),
    * [@Component](api/core/Directive#providers) or [@Directive](api/core/Directive#providers).
    *
    * The following options specify that this injectable should be provided in one of the following
    * injectors:
    * - 'root' : The application-level injector in most apps.
    * - 'platform' : A special singleton platform injector shared by all
    * applications on the page.
    * - 'any' : Provides a unique instance in each lazy loaded module while all eagerly loaded
    * modules share one instance. This option is DEPRECATED.
    *
    */
  var providedIn: js.UndefOr[Type[Any] | root | platform | any | Null] = js.undefined
}
object Injectable {
  
  @JSImport("@angular/core", "Injectable")
  @js.native
  val ^ : InjectableDecorator = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Injectable] (val x: Self) extends AnyVal {
    
    inline def setProvidedIn(value: Type[Any] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
  }
}
