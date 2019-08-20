package typings.autoprefixer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autoprefixerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.postcss.postcssMod.Plugin

  type Autoprefixer = Plugin[Options]
  type BrowserslistTarget = String | js.Array[String] | StringDictionary[js.Array[String]]
}
