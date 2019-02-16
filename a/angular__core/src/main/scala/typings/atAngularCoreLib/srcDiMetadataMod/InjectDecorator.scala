package typings
package atAngularCoreLib.srcDiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectDecorator
  extends org.scalablytyped.runtime.Instantiable1[/* token */ js.Any, Inject] {
  /**
    * A parameter decorator on a dependency parameter of a class constructor
    * that specifies a custom provider of the dependency.
    *
    * Learn more in the ["Dependency Injection Guide"](guide/dependency-injection).
    *
    * @usageNotes
    * The following example shows a class constructor that specifies a
    * custom provider of a dependency using the parameter decorator.
    *
    * {@example core/di/ts/metadata_spec.ts region='Inject'}
    *
    * When `@Inject()` is not present, the injector uses the type annotation of the
    * parameter as the provider.
    *
    * {@example core/di/ts/metadata_spec.ts region='InjectWithoutDecorator'}
    */
  def apply(token: js.Any): js.Any = js.native
}

