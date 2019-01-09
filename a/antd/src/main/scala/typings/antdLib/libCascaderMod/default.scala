package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/cascader", JSImport.Default)
@js.native
class default protected () extends Cascader {
  def this(props: CascaderProps) = this()
}

@JSImport("antd/lib/cascader", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: antdLib.Anon_AllowClear = js.native
  def getDerivedStateFromProps(
    nextProps: antdLib.libCascaderMod.CascaderProps,
    hasPrevProps: antdLib.libCascaderMod.CascaderState
  ): stdLib.Partial[antdLib.libCascaderMod.CascaderState] = js.native
}

