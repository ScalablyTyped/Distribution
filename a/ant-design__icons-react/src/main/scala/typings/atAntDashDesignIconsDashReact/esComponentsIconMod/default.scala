package typings.atAntDashDesignIconsDashReact.esComponentsIconMod

import typings.atAntDashDesignIcons.libTypesMod.IconDefinition
import typings.atAntDashDesignIconsDashReact.esUtilsMod.MiniMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-react/es/components/Icon", JSImport.Default)
@js.native
class default () extends Icon

/* static members */
@JSImport("@ant-design/icons-react/es/components/Icon", JSImport.Default)
@js.native
object default extends js.Object {
  var definitions: MiniMap[IconDefinition] = js.native
  var displayName: String = js.native
  def add(icons: IconDefinition*): Unit = js.native
  def clear(): Unit = js.native
  def get(): js.UndefOr[IconDefinition] = js.native
  def get(key: String): js.UndefOr[IconDefinition] = js.native
  def get(key: String, colors: TwoToneColorPalette): js.UndefOr[IconDefinition] = js.native
  def getTwoToneColors(): TwoToneColorPalette = js.native
  def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = js.native
}

