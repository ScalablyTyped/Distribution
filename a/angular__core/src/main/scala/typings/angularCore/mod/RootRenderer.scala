package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "RootRenderer")
@js.native
abstract class RootRenderer () extends js.Object {
  def renderComponent(componentType: RenderComponentType): Renderer = js.native
}

