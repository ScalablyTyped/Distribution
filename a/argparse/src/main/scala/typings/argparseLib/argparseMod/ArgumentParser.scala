package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "ArgumentParser")
@js.native
class ArgumentParser () extends ArgumentGroup {
  def this(options: ArgumentParserOptions) = this()
  def addSubparsers(): SubParser = js.native
  def addSubparsers(options: SubparserOptions): SubParser = js.native
  def convertArgLineToArg(argLine: java.lang.String): js.Array[java.lang.String] = js.native
  def error(err: java.lang.String): scala.Unit = js.native
  def error(err: stdLib.Error): scala.Unit = js.native
  def exit(status: scala.Double, message: java.lang.String): scala.Unit = js.native
  def formatHelp(): java.lang.String = js.native
  def formatUsage(): java.lang.String = js.native
  def parseArgs(): js.Any = js.native
  def parseArgs(args: js.Array[java.lang.String]): js.Any = js.native
  def parseArgs(args: js.Array[java.lang.String], ns: Namespace): js.Any = js.native
  def parseArgs(args: js.Array[java.lang.String], ns: js.Object): js.Any = js.native
  def parseKnownArgs(): js.Array[_] = js.native
  def parseKnownArgs(args: js.Array[java.lang.String]): js.Array[_] = js.native
  def parseKnownArgs(args: js.Array[java.lang.String], ns: Namespace): js.Array[_] = js.native
  def parseKnownArgs(args: js.Array[java.lang.String], ns: js.Object): js.Array[_] = js.native
  def printHelp(): scala.Unit = js.native
  def printUsage(): scala.Unit = js.native
}

