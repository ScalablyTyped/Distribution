package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esLocaleDashProviderMod.Locale
import typings.antd.esLocaleDashProviderMod.LocaleProviderProps
import typings.antd.esLocaleDashProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleDashProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esLocaleDashProviderMod.default].asInstanceOf[String | js.Object]
  def apply(locale: Locale, _ANT_MARK__ : String = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocaleProviderProps
}

