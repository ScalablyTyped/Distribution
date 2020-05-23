package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentProviderMod {
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, java.lang.String | typings.std.HTMLElement]
  type AgGridRegisteredComponentInput[A /* <: typings.agGrid.iComponentMod.IComponent[_] */] = typings.agGrid.componentProviderMod.AgGridComponentFunctionInput | typings.agGrid.anon.InstantiableA[A]
  type RegisteredComponentInput[A /* <: typings.agGrid.iComponentMod.IComponent[_] with B */, B] = typings.agGrid.componentProviderMod.AgGridRegisteredComponentInput[A] | typings.agGrid.anon.InstantiableB[B]
}
