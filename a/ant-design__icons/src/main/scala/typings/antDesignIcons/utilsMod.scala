package typings.antDesignIcons

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIcons.antDesignIconsBooleans.`false`
import typings.antDesignIconsSvg.typesMod.AbstractNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/icons/es/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val iconStyles: /* "\n.anticon {\n  display: inline-block;\n  color: inherit;\n  font-style: normal;\n  line-height: 0;\n  text-align: center;\n  text-transform: none;\n  vertical-align: -0.125em;\n  text-rendering: optimizeLegibility;\n  -webkit-font-smoothing: antialiased;\n  -moz-osx-font-smoothing: grayscale;\n}\n\n.anticon > * {\n  line-height: 1;\n}\n\n.anticon svg {\n  display: inline-block;\n}\n\n.anticon::before {\n  display: none;\n}\n\n.anticon .anticon-icon {\n  display: block;\n}\n\n.anticon[tabindex] {\n  cursor: pointer;\n}\n\n.anticon-spin::before,\n.anticon-spin {\n  display: inline-block;\n  -webkit-animation: loadingCircle 1s infinite linear;\n  animation: loadingCircle 1s infinite linear;\n}\n\n@-webkit-keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n\n@keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n" */ String = js.native
  def generate(node: AbstractNode, key: String): js.Any = js.native
  def generate(node: AbstractNode, key: String, rootProps: StringDictionary[js.Any]): js.Any = js.native
  @JSName("generate")
  def generate_false(node: AbstractNode, key: String, rootProps: `false`): js.Any = js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  def isIconDefinition(target: js.Any): /* is @ant-design/icons-svg.@ant-design/icons-svg/es/types.IconDefinition */ Boolean = js.native
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

