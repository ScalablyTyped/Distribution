package typings.antd

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/getRenderPropValue", JSImport.Namespace)
@js.native
object getRenderPropValueMod extends js.Object {
  def getRenderPropValue(): ReactNode = js.native
  def getRenderPropValue(
    propValue: String | Double | Boolean | js.Object | ReactElement | ReactNodeArray | ReactPortal | RenderFunction
  ): ReactNode = js.native
  type RenderFunction = js.Function0[ReactNode]
}

