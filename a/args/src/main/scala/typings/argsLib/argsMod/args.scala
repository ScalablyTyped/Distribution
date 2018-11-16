package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait args extends js.Object {
  var sub: js.Array[java.lang.String] = js.native
  def command(name: java.lang.String, description: java.lang.String): args = js.native
  def command(
    name: java.lang.String,
    description: java.lang.String,
    init: js.Function3[
      /* name */ java.lang.String, 
      /* sub */ js.Array[java.lang.String], 
      /* options */ ConfigurationOptions, 
      scala.Unit
    ]
  ): args = js.native
  def command(
    name: java.lang.String,
    description: java.lang.String,
    init: js.Function3[
      /* name */ java.lang.String, 
      /* sub */ js.Array[java.lang.String], 
      /* options */ ConfigurationOptions, 
      scala.Unit
    ],
    aliases: js.Array[java.lang.String]
  ): args = js.native
  def example(usage: java.lang.String, description: java.lang.String): args = js.native
  def examples(list: js.Array[Example]): args = js.native
  def option(name: java.lang.String, description: java.lang.String): args = js.native
  def option(name: java.lang.String, description: java.lang.String, defaultValue: js.Any): args = js.native
  def option(
    name: java.lang.String,
    description: java.lang.String,
    defaultValue: js.Any,
    init: argsLib.OptionInitFunction
  ): args = js.native
  def option(name: js.Tuple2[java.lang.String, java.lang.String], description: java.lang.String): args = js.native
  def option(
    name: js.Tuple2[java.lang.String, java.lang.String],
    description: java.lang.String,
    defaultValue: js.Any
  ): args = js.native
  def option(
    name: js.Tuple2[java.lang.String, java.lang.String],
    description: java.lang.String,
    defaultValue: js.Any,
    init: argsLib.OptionInitFunction
  ): args = js.native
  def options(list: js.Array[Option]): args = js.native
  def parse(argv: js.Array[java.lang.String]): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def parse(argv: js.Array[java.lang.String], options: ConfigurationOptions): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def showHelp(): scala.Unit = js.native
}

