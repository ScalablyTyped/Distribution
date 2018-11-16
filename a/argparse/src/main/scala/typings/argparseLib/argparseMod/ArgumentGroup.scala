package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "ArgumentGroup")
@js.native
class ArgumentGroup () extends js.Object {
  def addArgument(args: java.lang.String): scala.Unit = js.native
  def addArgument(args: java.lang.String, options: ArgumentOptions): scala.Unit = js.native
  def addArgument(args: js.Array[java.lang.String]): scala.Unit = js.native
  def addArgument(args: js.Array[java.lang.String], options: ArgumentOptions): scala.Unit = js.native
  def addArgumentGroup(): ArgumentGroup = js.native
  def addArgumentGroup(options: ArgumentGroupOptions): ArgumentGroup = js.native
  def addMutuallyExclusiveGroup(): ArgumentGroup = js.native
  def addMutuallyExclusiveGroup(options: argparseLib.Anon_Required): ArgumentGroup = js.native
  def getDefault(dest: java.lang.String): js.Any = js.native
  def setDefaults(): scala.Unit = js.native
  def setDefaults(options: js.Object): scala.Unit = js.native
}

