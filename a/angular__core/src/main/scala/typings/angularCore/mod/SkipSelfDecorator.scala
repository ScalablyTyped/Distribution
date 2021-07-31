package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipSelfDecorator
  extends StObject
     with Instantiable0[SkipSelf] {
  
  /**
    * Parameter decorator to be used on constructor parameters,
    * which tells the DI framework to start dependency resolution from the parent injector.
    * Resolution works upward through the injector hierarchy, so the local injector
    * is not checked for a provider.
    *
    * @usageNotes
    *
    * In the following example, the dependency can be resolved when
    * instantiating a child, but not when instantiating the class itself.
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="SkipSelf">
    * </code-example>
    *
    * @see [Dependency Injection guide](guide/dependency-injection-in-action#skip).
    * @see `Self`
    * @see `Optional`
    *
    */
  def apply(): js.Any = js.native
}
