package typings.atomically

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Callback = js.Function1[/* error */ typings.atomically.typesMod.Exception | scala.Unit, js.Any]
  type Data = js.UndefOr[typings.node.Buffer | java.lang.String]
  type Disposer = js.Function0[scala.Unit]
  type Exception = typings.node.NodeJS.ErrnoException
  type FN[Arguments /* <: js.Array[_] */, Return] = js.Function1[/* args */ Arguments, Return]
  type Path = java.lang.String
}
