package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Cascader")
@js.native
class Cascader protected ()
  extends antdLib.libCascaderMod.default {
  def this(props: antdLib.libCascaderMod.CascaderProps) = this()
}

/* static members */
@JSImport("antd", "Cascader")
@js.native
object Cascader extends js.Object {
  var defaultProps: antdLib.Anon_AllowClear = js.native
  def getDerivedStateFromProps(
    nextProps: antdLib.libCascaderMod.CascaderProps,
    hasPrevProps: antdLib.libCascaderMod.CascaderState
  ): stdLib.Partial[antdLib.libCascaderMod.CascaderState] = js.native
}

