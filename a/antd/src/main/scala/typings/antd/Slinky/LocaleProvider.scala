package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esLocaleDashProviderMod.Locale
import typings.antd.esLocaleDashProviderMod.LocaleProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esMod.LocaleProvider] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMod.LocaleProvider].asInstanceOf[String | js.Object]
  def apply(locale: Locale, _ANT_MARK__ : String = null): BuildingComponent[tag.type, typings.antd.esMod.LocaleProvider] = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocaleProviderProps
}

