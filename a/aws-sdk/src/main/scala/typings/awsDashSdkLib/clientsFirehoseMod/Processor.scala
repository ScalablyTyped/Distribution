package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Processor extends js.Object {
  /**
    * The processor parameters.
    */
  var Parameters: js.UndefOr[ProcessorParameterList] = js.undefined
  /**
    * The type of processor.
    */
  var Type: ProcessorType
}

object Processor {
  @scala.inline
  def apply(Type: ProcessorType, Parameters: ProcessorParameterList = null): Processor = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[Processor]
  }
}

