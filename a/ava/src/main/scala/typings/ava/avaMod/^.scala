package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ava", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val after: AfterInterface[js.Any] = js.native
  val afterEach: AfterInterface[js.Any] = js.native
  val before: BeforeInterface[js.Any] = js.native
  val beforeEach: BeforeInterface[js.Any] = js.native
  val cb: CbInterface[js.Any] = js.native
  /** Call to declare a test, or chain to declare hooks or test modifiers */
  val default: TestInterface[js.Any] = js.native
  val failing: FailingInterface[js.Any] = js.native
  val meta: MetaInterface = js.native
  val only: OnlyInterface[js.Any] = js.native
  val serial: SerialInterface[js.Any] = js.native
  val skip: SkipInterface[js.Any] = js.native
  val todo: TodoDeclaration = js.native
}

