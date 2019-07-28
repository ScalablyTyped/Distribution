package typings.argv.argvMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait argv extends js.Object {
  // Cleans out current options
  def clear(): typings.argv.argvMod.argv = js.native
  // Prints out the help doc
  def help(): typings.argv.argvMod.argv = js.native
  def help(mod: String): typings.argv.argvMod.argv = js.native
  // Description setup
  def info(mod: String): typings.argv.argvMod.argv = js.native
  def info(mod: String, description: module): typings.argv.argvMod.argv = js.native
  def mod(`object`: js.Array[module]): typings.argv.argvMod.argv = js.native
  // Creating module
  def mod(`object`: module): typings.argv.argvMod.argv = js.native
  def option(mod: js.Array[helpOption]): typings.argv.argvMod.argv = js.native
  // Adding options to definitions list
  def option(mod: helpOption): typings.argv.argvMod.argv = js.native
  // Runs the arguments parser
  def run(): args = js.native
  def run(argv: js.Array[String]): args = js.native
  // Creates custom type function
  def `type`(name: String): js.Any = js.native
  def `type`(name: String, callback: typeFunction): js.Any = js.native
  def `type`(name: StringDictionary[typeFunction]): js.Any = js.native
  def `type`(name: StringDictionary[typeFunction], callback: typeFunction): js.Any = js.native
  // Setting version number, and auto setting version option
  def version(v: String): typings.argv.argvMod.argv = js.native
}

