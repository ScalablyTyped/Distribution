package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraProps extends js.Object {
  var extraProps: RenderBodyComponent
  var restProps: ClassName
}

object ExtraProps {
  @scala.inline
  def apply(extraProps: RenderBodyComponent, restProps: ClassName): ExtraProps = {
    val __obj = js.Dynamic.literal(extraProps = extraProps.asInstanceOf[js.Any], restProps = restProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraProps]
  }
}

