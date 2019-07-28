package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ava", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val after: AfterInterface[js.Object] = js.native
  val afterEach: AfterInterface[js.Object] = js.native
  val before: BeforeInterface[js.Object] = js.native
  val beforeEach: BeforeInterface[js.Object] = js.native
  val cb: CbInterface[js.Object] = js.native
  /** Call to declare a test, or chain to declare hooks or test modifiers */
  val default: TestInterface[js.Object] = js.native
  val failing: FailingInterface[js.Object] = js.native
  val meta: MetaInterface = js.native
  val only: OnlyInterface[js.Object] = js.native
  val serial: SerialInterface[js.Object] = js.native
  val skip: SkipInterface[js.Object] = js.native
  val todo: TodoDeclaration = js.native
}

