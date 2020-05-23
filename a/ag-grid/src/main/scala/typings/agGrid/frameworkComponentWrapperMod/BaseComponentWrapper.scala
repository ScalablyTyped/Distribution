package typings.agGrid.frameworkComponentWrapperMod

import typings.agGrid.anon.InstantiableAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/frameworkComponentWrapper", "BaseComponentWrapper")
@js.native
abstract class BaseComponentWrapper[F /* <: WrapableInterface */] () extends FrameworkComponentWrapper {
  /* private */ def createMethod(wrapper: js.Any, methodName: js.Any, mandatory: js.Any): js.Any = js.native
  /* private */ def createMethodProxy(wrapper: js.Any, methodName: js.Any, mandatory: js.Any): js.Any = js.native
  def createWrapper(OriginalConstructor: InstantiableAny): F = js.native
  def createWrapper(OriginalConstructor: InstantiableAny, componentName: String): F = js.native
}

