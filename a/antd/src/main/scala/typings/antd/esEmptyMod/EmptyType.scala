package typings.antd.esEmptyMod

import typings.antd.PartialEmptyProps
import typings.antd.PropsWithChildrenEmptyProps
import typings.antd.WeakValidationMapEmptyProps
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.SFC<antd.antd/es/empty.EmptyProps> & {  PRESENTED_IMAGE_DEFAULT  :string,   PRESENTED_IMAGE_SIMPLE  :string} */
@js.native
trait EmptyType extends js.Object {
  var PRESENTED_IMAGE_DEFAULT: String = js.native
  var PRESENTED_IMAGE_SIMPLE: String = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialEmptyProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapEmptyProps] = js.native
  def apply(props: PropsWithChildrenEmptyProps): ReactElement | Null = js.native
  def apply(props: PropsWithChildrenEmptyProps, context: js.Any): ReactElement | Null = js.native
}

