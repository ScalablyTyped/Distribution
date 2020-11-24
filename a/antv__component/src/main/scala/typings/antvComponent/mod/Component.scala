package typings.antvComponent.mod

import typings.antvComponent.componentMod.default
import typings.antvComponent.typesMod.ComponentCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component", "Component")
@js.native
abstract class Component[T /* <: ComponentCfg */] protected () extends default[T] {
  def this(cfg: T) = this()
}
