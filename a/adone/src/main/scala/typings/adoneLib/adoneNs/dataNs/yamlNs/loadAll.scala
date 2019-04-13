package typings
package adoneLib.adoneNs.dataNs.yamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same as safeLoadAll() but uses DEFAULT_FULL by default
  */
@JSGlobal("adone.data.yaml.loadAll")
@js.native
object loadAll extends js.Object {
  def apply(input: java.lang.String): js.Array[_] = js.native
  def apply(input: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): scala.Unit = js.native
  def apply(
    input: java.lang.String,
    iterator: js.Function1[/* doc */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): scala.Unit = js.native
  def apply(
    input: java.lang.String,
    iterator: js.UndefOr[scala.Nothing],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): js.Array[_] = js.native
  def apply(input: nodeLib.Buffer): js.Array[_] = js.native
  def apply(input: nodeLib.Buffer, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): scala.Unit = js.native
  def apply(
    input: nodeLib.Buffer,
    iterator: js.Function1[/* doc */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): scala.Unit = js.native
  def apply(
    input: nodeLib.Buffer,
    iterator: js.UndefOr[scala.Nothing],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): js.Array[_] = js.native
}

