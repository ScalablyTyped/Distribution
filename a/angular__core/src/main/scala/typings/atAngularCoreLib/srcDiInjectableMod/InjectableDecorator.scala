package typings
package atAngularCoreLib.srcDiInjectableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableDecorator
  extends org.scalablytyped.runtime.Instantiable1[/* options */ atAngularCoreLib.Anon_ProvidedIn with InjectableProvider, Injectable]
     with org.scalablytyped.runtime.Instantiable0[Injectable] {
  /**
    * Marks a class as available to `Injector` for creation.
    *
    * @see [Introduction to Services and DI](guide/architecture-services)
    * @see [Dependency Injection Guide](guide/dependency-injection)
    *
    * @usageNotes
    *
    * The following example shows how service classes are properly marked as
    * injectable.
    *
    * {@example core/di/ts/metadata_spec.ts region='Injectable'}
    *
    * `Injector` throws an error if it tries to instantiate a class that
    * is not decorated with `@Injectable`, as shown in the following example.
    *
    * {@example core/di/ts/metadata_spec.ts region='InjectableThrows'}
    *
    */
  def apply(): atAngularCoreLib.srcUtilDecoratorsMod.TypeDecorator = js.native
  def apply(options: atAngularCoreLib.Anon_ProvidedIn with InjectableProvider): atAngularCoreLib.srcUtilDecoratorsMod.TypeDecorator = js.native
}

