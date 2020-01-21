package typings.argparse.mod

import typings.argparse.AnonRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "ArgumentGroup")
@js.native
class ArgumentGroup () extends js.Object {
  def addArgument(args: String): Unit = js.native
  def addArgument(args: String, options: ArgumentOptions): Unit = js.native
  def addArgument(args: js.Array[String]): Unit = js.native
  def addArgument(args: js.Array[String], options: ArgumentOptions): Unit = js.native
  def addArgumentGroup(): ArgumentGroup = js.native
  def addArgumentGroup(options: ArgumentGroupOptions): ArgumentGroup = js.native
  def addMutuallyExclusiveGroup(): ArgumentGroup = js.native
  def addMutuallyExclusiveGroup(options: AnonRequired): ArgumentGroup = js.native
  def getDefault(dest: String): js.Any = js.native
  def setDefaults(): Unit = js.native
  def setDefaults(options: js.Object): Unit = js.native
}

