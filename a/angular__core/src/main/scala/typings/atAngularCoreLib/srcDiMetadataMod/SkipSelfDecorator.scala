package typings
package atAngularCoreLib.srcDiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipSelfDecorator
  extends org.scalablytyped.runtime.Instantiable0[SkipSelf] {
  /**
    * A parameter decorator to be used on constructor parameters,
    * which tells the DI framework to start dependency resolution from the parent injector.
    * Resolution works upward through the injector hierarchy, so the local injector
    * is not checked for a provider.
    *
    * @usageNotes
    *
    * In the following example, the dependency can be resolved when
    * instantiating a child, but not when instantiating the class itself.
    *
    * {@example core/di/ts/metadata_spec.ts region='SkipSelf'}
    *
    * Learn more in the
    * [Dependency Injection guide](guide/dependency-injection-in-action#skip).
    *
    * @see `Self`
    * @see `Optional`
    *
    */
  def apply(): js.Any = js.native
}

