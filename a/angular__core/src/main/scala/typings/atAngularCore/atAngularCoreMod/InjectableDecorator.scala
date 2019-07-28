package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.atAngularCore.Anon_ProvidedIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableDecorator
  extends Instantiable1[/* options */ Anon_ProvidedIn with InjectableProvider, Injectable]
     with Instantiable0[Injectable] {
  /**
    * Decorator that marks a class as available to be
    * provided and injected as a dependency.
    *
    * @see [Introduction to Services and DI](guide/architecture-services)
    * @see [Dependency Injection Guide](guide/dependency-injection)
    *
    * @usageNotes
    *
    * Marking a class with `@Injectable` ensures that the compiler
    * will generate the necessary metadata to create the class's
    * dependencies when the class is injected.
    *
    * The following example shows how a service class is properly
    *  marked so that a supporting service can be injected upon creation.
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="Injectable"
    *  linenums="false"></code-example>
    *
    */
  def apply(): TypeDecorator = js.native
  def apply(options: Anon_ProvidedIn with InjectableProvider): TypeDecorator = js.native
}

