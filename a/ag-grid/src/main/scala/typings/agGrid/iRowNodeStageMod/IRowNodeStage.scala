package typings.agGrid.iRowNodeStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowNodeStage extends js.Object {
  def execute(params: StageExecuteParams): js.Any
}

object IRowNodeStage {
  @scala.inline
  def apply(execute: StageExecuteParams => js.Any): IRowNodeStage = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[IRowNodeStage]
  }
}

