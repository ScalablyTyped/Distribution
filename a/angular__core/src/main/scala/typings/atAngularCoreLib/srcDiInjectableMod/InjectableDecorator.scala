package typings
package atAngularCoreLib.srcDiInjectableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableDecorator
  extends ScalablyTyped.runtime.Instantiable1[/* options */ atAngularCoreLib.Anon_ProvidedIn with InjectableProvider, Injectable]
     with ScalablyTyped.runtime.Instantiable0[Injectable] {
  /**
       * A marker metadata that marks a class as available to `Injector` for creation.
       *
       * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
       *
       * @usageNotes
       * ### Example
       *
       * {@example core/di/ts/metadata_spec.ts region='Injectable'}
       *
       * `Injector` will throw an error when trying to instantiate a class that
       * does not have `@Injectable` marker, as shown in the example below.
       *
       * {@example core/di/ts/metadata_spec.ts region='InjectableThrows'}
       *
       */
  def apply(): js.Any = js.native
  def apply(options: atAngularCoreLib.Anon_ProvidedIn with InjectableProvider): js.Any = js.native
}

