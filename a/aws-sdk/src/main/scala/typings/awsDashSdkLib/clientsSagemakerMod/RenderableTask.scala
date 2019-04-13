package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderableTask extends js.Object {
  /**
    * A JSON object that contains values for the variables defined in the template. It is made available to the template under the substitution variable task.input. For example, if you define a variable task.input.text in your template, you can supply the variable in the JSON object as "text": "sample text".
    */
  var Input: TaskInput
}

object RenderableTask {
  @scala.inline
  def apply(Input: TaskInput): RenderableTask = {
    val __obj = js.Dynamic.literal(Input = Input)
  
    __obj.asInstanceOf[RenderableTask]
  }
}

