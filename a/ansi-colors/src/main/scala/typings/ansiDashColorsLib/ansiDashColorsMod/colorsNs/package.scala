package typings
package ansiDashColorsLib.ansiDashColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorsNs {
  type ColorFn = (js.Function1[/* text */ java.lang.String, java.lang.String]) with Colors
  type OtherPlatformsSymbols = WindowsSymbols with ExtendedSymbols
  type Symbols = WindowsSymbols with stdLib.Partial[ExtendedSymbols]
}
