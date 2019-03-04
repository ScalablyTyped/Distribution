package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionPipeUnderscoreTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransform extends js.Object {
  def transform(value: js.Any, args: js.Any*): js.Any
}

object PipeTransform {
  @scala.inline
  def apply(transform: js.Function2[js.Any, /* repeated */ js.Any, js.Any]): PipeTransform = {
    val __obj = js.Dynamic.literal(transform = transform)
  
    __obj.asInstanceOf[PipeTransform]
  }
}

