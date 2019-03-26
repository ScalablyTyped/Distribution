package typings
package agDashGridLib.distLibComponentsFrameworkFrameworkComponentWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/frameworkComponentWrapper", "BaseComponentWrapper")
@js.native
abstract class BaseComponentWrapper[F /* <: WrapableInterface */] () extends FrameworkComponentWrapper {
  /* private */ def createMethod(wrapper: js.Any, methodName: js.Any, mandatory: js.Any): js.Any = js.native
  /* private */ def createMethodProxy(wrapper: js.Any, methodName: js.Any, mandatory: js.Any): js.Any = js.native
  def createWrapper(OriginalConstructor: agDashGridLib.Anon_Any): F = js.native
  def createWrapper(OriginalConstructor: agDashGridLib.Anon_Any, componentName: java.lang.String): F = js.native
}

