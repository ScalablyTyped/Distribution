package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scripts extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Script = js.native
  /**
           * @param Location [Location=2]
           * @param Language [Language=2]
           * @param Id [Id='']
           * @param Extended [Extended='']
           * @param ScriptText [ScriptText='']
           */
  def Add(
    Anchor: js.UndefOr[js.Any],
    Location: js.UndefOr[MsoScriptLocation],
    Language: js.UndefOr[MsoScriptLanguage],
    Id: js.UndefOr[java.lang.String],
    Extended: js.UndefOr[java.lang.String],
    ScriptText: js.UndefOr[java.lang.String]
  ): Script = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: js.Any): Script = js.native
}

