package typings.antd.mod

import typings.antd.AnonAllowClear
import typings.antd.PartialCascaderState
import typings.antd.cascaderMod.CascaderProps
import typings.antd.cascaderMod.CascaderState
import typings.antd.cascaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Cascader")
@js.native
class Cascader protected () extends default {
  def this(props: CascaderProps) = this()
}

/* static members */
@JSImport("antd", "Cascader")
@js.native
object Cascader extends js.Object {
  var defaultProps: AnonAllowClear = js.native
  def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = js.native
}

