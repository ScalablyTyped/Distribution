package typings.args.argsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait args extends js.Object {
  var sub: js.Array[String] = js.native
  def command(name: String, description: String): typings.args.argsMod.args = js.native
  def command(
    name: String,
    description: String,
    init: js.Function3[
      /* name */ String, 
      /* sub */ js.Array[String], 
      /* options */ ConfigurationOptions, 
      Unit
    ]
  ): typings.args.argsMod.args = js.native
  def command(
    name: String,
    description: String,
    init: js.Function3[
      /* name */ String, 
      /* sub */ js.Array[String], 
      /* options */ ConfigurationOptions, 
      Unit
    ],
    aliases: js.Array[String]
  ): typings.args.argsMod.args = js.native
  def example(usage: String, description: String): typings.args.argsMod.args = js.native
  def examples(list: js.Array[Example]): typings.args.argsMod.args = js.native
  def option(name: String, description: String): typings.args.argsMod.args = js.native
  def option(name: String, description: String, defaultValue: js.Any): typings.args.argsMod.args = js.native
  def option(name: String, description: String, defaultValue: js.Any, init: OptionInitFunction): typings.args.argsMod.args = js.native
  def option(name: js.Tuple2[String, String], description: String): typings.args.argsMod.args = js.native
  def option(name: js.Tuple2[String, String], description: String, defaultValue: js.Any): typings.args.argsMod.args = js.native
  def option(
    name: js.Tuple2[String, String],
    description: String,
    defaultValue: js.Any,
    init: OptionInitFunction
  ): typings.args.argsMod.args = js.native
  def options(list: js.Array[Option]): typings.args.argsMod.args = js.native
  def parse(argv: js.Array[String]): StringDictionary[js.Any] = js.native
  def parse(argv: js.Array[String], options: ConfigurationOptions): StringDictionary[js.Any] = js.native
  def showHelp(): Unit = js.native
}

