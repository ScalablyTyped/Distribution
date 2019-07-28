package typings.atAntDashDesignIconsDashReact.libMod

import typings.atAntDashDesignIcons.libTypesMod.IconDefinition
import typings.atAntDashDesignIconsDashReact.libComponentsIconMod.TwoToneColorPalette
import typings.atAntDashDesignIconsDashReact.libComponentsIconMod.TwoToneColorPaletteSetter
import typings.atAntDashDesignIconsDashReact.libUtilsMod.MiniMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-react/lib", "default")
@js.native
class default ()
  extends typings.atAntDashDesignIconsDashReact.libComponentsIconMod.default

/* static members */
@JSImport("@ant-design/icons-react/lib", "default")
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

