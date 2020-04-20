package typings.atlaskitButton

import typings.atlaskitButton.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atlaskitButtonComponents extends atlaskitButtonProps {
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[default].asInstanceOf[ComponentType[ButtonProps]]
  @scala.inline
  def ButtonGroup: ComponentType[ButtonGroupProps] = js.constructorOf[typings.atlaskitButton.mod.ButtonGroup].asInstanceOf[ComponentType[ButtonGroupProps]]
}

