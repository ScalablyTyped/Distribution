package typings.antd.antdMod

import typings.antd.Anon_AllowClear
import typings.antd.PartialCascaderStateFlattenOptions
import typings.antd.libCascaderMod.CascaderProps
import typings.antd.libCascaderMod.CascaderState
import typings.antd.libCascaderMod.default
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
  var defaultProps: Anon_AllowClear = js.native
  def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderStateFlattenOptions = js.native
}

