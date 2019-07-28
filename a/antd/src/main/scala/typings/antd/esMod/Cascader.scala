package typings.antd.esMod

import typings.antd.Anon_AllowClear
import typings.antd.PartialCascaderState
import typings.antd.esCascaderMod.CascaderProps
import typings.antd.esCascaderMod.CascaderState
import typings.antd.esCascaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Cascader")
@js.native
class Cascader protected () extends default {
  def this(props: CascaderProps) = this()
}

/* static members */
@JSImport("antd/es", "Cascader")
@js.native
object Cascader extends js.Object {
  var defaultProps: Anon_AllowClear = js.native
  def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = js.native
}

