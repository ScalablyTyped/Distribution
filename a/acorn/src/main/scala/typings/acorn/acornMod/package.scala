package typings.acorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acornMod {
  import org.scalablytyped.runtime.Instantiable2
  import org.scalablytyped.runtime.StringDictionary
  import typings.estree.estreeMod.Program

  type ILooseParserClass = Instantiable2[/* input */ String, js.UndefOr[/* options */ Options], ILooseParser]
  // TODO: rename type.
  type IParse = js.Function2[/* input */ String, /* options */ js.UndefOr[Options], Program]
  type PlainObject = StringDictionary[js.Any]
  type PluginsObject = StringDictionary[js.Function2[/* p */ Parser, /* config */ js.Any, Unit]]
}
