package typings.adone.adoneNs.dataNs.yamlNs

import typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same as safeLoadAll() but uses DEFAULT_FULL by default
  */
@JSGlobal("adone.data.yaml.loadAll")
@js.native
object loadAll extends js.Object {
  def apply(input: String): js.Array[_] = js.native
  def apply(input: String, iterator: js.UndefOr[scala.Nothing], options: Options): js.Array[_] = js.native
  def apply(input: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def apply(input: String, iterator: js.Function1[/* doc */ js.Any, Unit], options: Options): Unit = js.native
  def apply(input: Buffer): js.Array[_] = js.native
  def apply(input: Buffer, iterator: js.UndefOr[scala.Nothing], options: Options): js.Array[_] = js.native
  def apply(input: Buffer, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def apply(input: Buffer, iterator: js.Function1[/* doc */ js.Any, Unit], options: Options): Unit = js.native
}

