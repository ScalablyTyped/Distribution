package typings.antDesignIconsReact

import typings.antDesignIcons.typesMod.IconDefinition
import typings.antDesignIconsReact.iconMod.TwoToneColorPalette
import typings.antDesignIconsReact.iconMod.TwoToneColorPaletteSetter
import typings.antDesignIconsReact.utilsMod.MiniMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-react/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typings.antDesignIconsReact.iconMod.default
  
  /* static members */
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
  
}

