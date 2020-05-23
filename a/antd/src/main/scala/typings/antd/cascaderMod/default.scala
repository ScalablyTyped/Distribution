package typings.antd.cascaderMod

import typings.antd.anon.AllowClear
import typings.antd.anon.PartialCascaderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/cascader", JSImport.Default)
@js.native
class default protected () extends Cascader {
  def this(props: CascaderProps) = this()
}

/* static members */
@JSImport("antd/lib/cascader", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: AllowClear = js.native
  def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = js.native
}

