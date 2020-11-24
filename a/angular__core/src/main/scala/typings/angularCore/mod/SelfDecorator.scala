package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelfDecorator extends Instantiable0[Self] {
  
  /**
    * Parameter decorator to be used on constructor parameters,
    * which tells the DI framework to start dependency resolution from the local injector.
    *
    * Resolution works upward through the injector hierarchy, so the children
    * of this class must configure their own providers or be prepared for a null result.
    *
    * @usageNotes
    *
    * In the following example, the dependency can be resolved
    * by the local injector when instantiating the class itself, but not
    * when instantiating a child.
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="Self">
    * </code-example>
    *
    * @see `SkipSelf`
    * @see `Optional`
    *
    */
  def apply(): js.Any = js.native
}
