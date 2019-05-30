package typings
package atAngularCompilerLib.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticAndDynamicQueryIds extends js.Object {
  var dynamicQueryIds: stdLib.Set[scala.Double]
  var staticQueryIds: stdLib.Set[scala.Double]
}

object StaticAndDynamicQueryIds {
  @scala.inline
  def apply(dynamicQueryIds: stdLib.Set[scala.Double], staticQueryIds: stdLib.Set[scala.Double]): StaticAndDynamicQueryIds = {
    val __obj = js.Dynamic.literal(dynamicQueryIds = dynamicQueryIds, staticQueryIds = staticQueryIds)
  
    __obj.asInstanceOf[StaticAndDynamicQueryIds]
  }
}

