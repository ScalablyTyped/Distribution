package typings.alt

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object altComponents extends altProps {
  @scala.inline
  def AltContainer: ComponentType[AltContainerProps] = typings.alt.altContainerMod.^.asInstanceOf[typings.react.mod.ComponentType[AltContainerProps]]
  @scala.inline
  def Class: ComponentType[ClassProps] = js.constructorOf[typings.alt.altContainerMod.Class].asInstanceOf[typings.react.mod.ComponentType[ClassProps]]
}

