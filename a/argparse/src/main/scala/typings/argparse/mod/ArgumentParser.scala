package typings.argparse.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "ArgumentParser")
@js.native
class ArgumentParser () extends ArgumentGroup {
  def this(options: ArgumentParserOptions) = this()
  def addSubparsers(): SubParser = js.native
  def addSubparsers(options: SubparserOptions): SubParser = js.native
  def convertArgLineToArg(argLine: String): js.Array[String] = js.native
  def error(err: String): Unit = js.native
  def error(err: Error): Unit = js.native
  def exit(status: Double, message: String): Unit = js.native
  def formatHelp(): String = js.native
  def formatUsage(): String = js.native
  def parseArgs(): js.Any = js.native
  def parseArgs(args: js.UndefOr[scala.Nothing], ns: js.Object): js.Any = js.native
  def parseArgs(args: js.UndefOr[scala.Nothing], ns: Namespace): js.Any = js.native
  def parseArgs(args: js.Array[String]): js.Any = js.native
  def parseArgs(args: js.Array[String], ns: js.Object): js.Any = js.native
  def parseArgs(args: js.Array[String], ns: Namespace): js.Any = js.native
  def parseKnownArgs(): js.Array[_] = js.native
  def parseKnownArgs(args: js.UndefOr[scala.Nothing], ns: js.Object): js.Array[_] = js.native
  def parseKnownArgs(args: js.UndefOr[scala.Nothing], ns: Namespace): js.Array[_] = js.native
  def parseKnownArgs(args: js.Array[String]): js.Array[_] = js.native
  def parseKnownArgs(args: js.Array[String], ns: js.Object): js.Array[_] = js.native
  def parseKnownArgs(args: js.Array[String], ns: Namespace): js.Array[_] = js.native
  def printHelp(): Unit = js.native
  def printUsage(): Unit = js.native
}

