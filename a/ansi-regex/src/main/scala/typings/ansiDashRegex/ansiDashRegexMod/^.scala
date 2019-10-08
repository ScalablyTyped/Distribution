package typings.ansiDashRegex.ansiDashRegexMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Regular expression for matching ANSI escape codes.
  @example
  ```
  import ansiRegex = require('ansi-regex');
  ansiRegex().test('\\u001B[4mcake\\u001B[0m');
  //=> true
  ansiRegex().test('cake');
  //=> false
  '\\u001B[4mcake\\u001B[0m'.match(ansiRegex());
  //=> ['\\u001B[4m', '\\u001B[0m']
  '\\u001B[4mcake\\u001B[0m'.match(ansiRegex({onlyFirst: true}));
  //=> ['\\u001B[4m']
  '\\u001B]8;;https://github.com\\u0007click\\u001B]8;;\\u0007'.match(ansiRegex());
  //=> ['\\u001B]8;;https://github.com\\u0007', '\\u001B]8;;\\u0007']
  ```
  */
  def apply(): RegExp = js.native
  def apply(options: Options): RegExp = js.native
}

