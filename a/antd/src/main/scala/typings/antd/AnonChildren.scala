package typings.antd

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Requireable[ReactNodeLike]
  var className: Requireable[String]
  var lg: Requireable[Double | js.Object]
  var md: Requireable[Double | js.Object]
  var offset: Requireable[Double]
  var order: Requireable[Double]
  var pull: Requireable[Double]
  var push: Requireable[Double]
  var sm: Requireable[Double | js.Object]
  var span: Requireable[Double]
  var xl: Requireable[Double | js.Object]
  var xs: Requireable[Double | js.Object]
  var xxl: Requireable[Double | js.Object]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    lg: Requireable[Double | js.Object],
    md: Requireable[Double | js.Object],
    offset: Requireable[Double],
    order: Requireable[Double],
    pull: Requireable[Double],
    push: Requireable[Double],
    sm: Requireable[Double | js.Object],
    span: Requireable[Double],
    xl: Requireable[Double | js.Object],
    xs: Requireable[Double | js.Object],
    xxl: Requireable[Double | js.Object]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

