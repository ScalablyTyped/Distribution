package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "Action")
@js.native
abstract class Action protected () extends js.Object {
  def this(options: ActionConstructorOptions) = this()
  var dest: java.lang.String = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: java.lang.String): scala.Unit = js.native
  def call(
    parser: ArgumentParser,
    namespace: Namespace,
    values: java.lang.String,
    optionString: java.lang.String
  ): scala.Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[java.lang.String]): scala.Unit = js.native
  def call(
    parser: ArgumentParser,
    namespace: Namespace,
    values: js.Array[java.lang.String],
    optionString: java.lang.String
  ): scala.Unit = js.native
}

