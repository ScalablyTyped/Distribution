package typings
package agDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibComponentsFrameworkComponentProviderMod {
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, java.lang.String | stdLib.HTMLElement]
  type AgGridRegisteredComponentInput[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] */] = AgGridComponentFunctionInput | agDashGridLib.Anon_A[A]
  type RegisteredComponentInput[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B] = AgGridRegisteredComponentInput[A] | agDashGridLib.Anon_B[B]
}
