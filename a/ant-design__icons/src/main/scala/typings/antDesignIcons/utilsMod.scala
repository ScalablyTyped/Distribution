package typings.antDesignIcons

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIcons.antDesignIconsBooleans.`false`
import typings.antDesignIcons.antDesignIconsStrings.`LinefeedDotanticon LeftcurlybracketLinefeed  displayColon inline-blockSemicolonLinefeed  colorColon inheritSemicolonLinefeed  font-styleColon normalSemicolonLinefeed  line-heightColon 0SemicolonLinefeed  text-alignColon centerSemicolonLinefeed  text-transformColon noneSemicolonLinefeed  vertical-alignColon -0Dot125emSemicolonLinefeed  text-renderingColon optimizeLegibilitySemicolonLinefeed  -webkit-font-smoothingColon antialiasedSemicolonLinefeed  -moz-osx-font-smoothingColon grayscaleSemicolonL`
import typings.antDesignIconsSvg.typesMod.AbstractNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val iconStyles: `LinefeedDotanticon LeftcurlybracketLinefeed  displayColon inline-blockSemicolonLinefeed  colorColon inheritSemicolonLinefeed  font-styleColon normalSemicolonLinefeed  line-heightColon 0SemicolonLinefeed  text-alignColon centerSemicolonLinefeed  text-transformColon noneSemicolonLinefeed  vertical-alignColon -0Dot125emSemicolonLinefeed  text-renderingColon optimizeLegibilitySemicolonLinefeed  -webkit-font-smoothingColon antialiasedSemicolonLinefeed  -moz-osx-font-smoothingColon grayscaleSemicolonL` = js.native
  def generate(node: AbstractNode, key: String): js.Any = js.native
  def generate(node: AbstractNode, key: String, rootProps: StringDictionary[js.Any]): js.Any = js.native
  @JSName("generate")
  def generate_false(node: AbstractNode, key: String, rootProps: `false`): js.Any = js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  def isIconDefinition(target: js.Any): /* is @ant-design/icons-svg.@ant-design/icons-svg/lib/types.IconDefinition */ Boolean = js.native
  def normalizeAttrs(): Attrs = js.native
  def normalizeAttrs(attrs: Attrs): Attrs = js.native
  def normalizeTwoToneColors(): js.Array[String] = js.native
  def normalizeTwoToneColors(twoToneColor: String): js.Array[String] = js.native
  def normalizeTwoToneColors(twoToneColor: js.Tuple2[String, String]): js.Array[String] = js.native
  def useInsertStyles(): Unit = js.native
  def useInsertStyles(styleStr: String): Unit = js.native
  def warning(valid: Boolean, message: String): Unit = js.native
  @js.native
  object svgBaseProps extends js.Object {
    var `aria-hidden`: String = js.native
    var fill: String = js.native
    var focusable: String = js.native
    var height: String = js.native
    var width: String = js.native
  }
  
  type Attrs = StringDictionary[String]
}

