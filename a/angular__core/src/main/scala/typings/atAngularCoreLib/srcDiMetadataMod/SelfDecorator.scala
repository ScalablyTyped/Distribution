package typings
package atAngularCoreLib.srcDiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfDecorator
  extends org.scalablytyped.runtime.Instantiable0[Self] {
  /**
    * A constructor parameter decorator that tells the DI framework
    * to retrieve a dependency only from the local injector.
    *
    * In the following example, the dependency can be resolved
    * by the local injector when instantiating the class itself, but not
    * when instantiating a child.
    *
    * {@example core/di/ts/metadata_spec.ts region='Self'}
    *
    * @see ["Dependency Injection Guide"](guide/dependency-injection).
    *
    *
    */
  def apply(): js.Any = js.native
}

