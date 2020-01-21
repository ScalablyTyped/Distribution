package typings.argparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "Action")
@js.native
abstract class Action protected () extends js.Object {
  def this(options: ActionConstructorOptions) = this()
  var dest: String = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: String): Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: String, optionString: String): Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[String]): Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[String], optionString: String): Unit = js.native
}

