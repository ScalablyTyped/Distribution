package typings
package atAngularCoreLib.srcDiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipSelfDecorator
  extends ScalablyTyped.runtime.Instantiable0[SkipSelf] {
  /**
       * A constructor parameter decorator that tells the DI framework
       * that dependency resolution should start from the parent injector.
       *
       * In the following example, the dependency can be resolved when
       * instantiating a child, but not when instantiating the class itself.
       *
       * {@example core/di/ts/metadata_spec.ts region='SkipSelf'}
       *
       * @see ["Dependency Injection Guide"](guide/dependency-injection).
       *
       *
       */
  def apply(): js.Any = js.native
}

