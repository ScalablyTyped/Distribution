package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentDirection extends js.Object {
  var current: scala.Double
  var direction: java.lang.String
  var iconPrefix: java.lang.String
  var labelPlacement: java.lang.String
  var prefixCls: java.lang.String
}

object Anon_CurrentDirection {
  @scala.inline
  def apply(
    current: scala.Double,
    direction: java.lang.String,
    iconPrefix: java.lang.String,
    labelPlacement: java.lang.String,
    prefixCls: java.lang.String
  ): Anon_CurrentDirection = {
    val __obj = js.Dynamic.literal(current = current, direction = direction, iconPrefix = iconPrefix, labelPlacement = labelPlacement, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_CurrentDirection]
  }
}

