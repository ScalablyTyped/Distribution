package typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticAndDynamicQueryIds extends js.Object {
  var dynamicQueryIds: Set[Double]
  var staticQueryIds: Set[Double]
}

object StaticAndDynamicQueryIds {
  @scala.inline
  def apply(dynamicQueryIds: Set[Double], staticQueryIds: Set[Double]): StaticAndDynamicQueryIds = {
    val __obj = js.Dynamic.literal(dynamicQueryIds = dynamicQueryIds.asInstanceOf[js.Any], staticQueryIds = staticQueryIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticAndDynamicQueryIds]
  }
}

