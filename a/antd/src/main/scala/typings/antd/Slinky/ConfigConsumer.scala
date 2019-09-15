package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigConsumer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esConfigDashProviderMod.ConfigConsumer] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esConfigDashProviderMod.ConfigConsumer].asInstanceOf[String | js.Object]
  def apply[T](observedBits: Int | Double = null): BuildingComponent[tag.type, typings.antd.esConfigDashProviderMod.ConfigConsumer] = {
    val __obj = js.Dynamic.literal()
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConsumerProps[js.Any]
}

