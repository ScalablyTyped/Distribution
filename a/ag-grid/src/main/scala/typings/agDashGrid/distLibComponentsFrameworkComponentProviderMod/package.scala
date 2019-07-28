package typings.agDashGrid

import typings.agDashGrid.Anon_A
import typings.agDashGrid.Anon_B
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibComponentsFrameworkComponentProviderMod {
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, String | HTMLElement]
  type AgGridRegisteredComponentInput[A /* <: IComponent[_] */] = AgGridComponentFunctionInput | Anon_A[A]
  type RegisteredComponentInput[A /* <: IComponent[_] with B */, B] = AgGridRegisteredComponentInput[A] | Anon_B[B]
}
