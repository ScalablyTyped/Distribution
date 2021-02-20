package typings.antDesignIcons

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIcons.antDesignIconsBooleans.`false`
import typings.antDesignIconsSvg.typesMod.AbstractNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons/dist/utils", "generate")
  @js.native
  def generate(node: AbstractNode, key: String): js.Any = js.native
  @JSImport("@ant-design/icons/dist/utils", "generate")
  @js.native
  def generate(node: AbstractNode, key: String, rootProps: StringDictionary[js.Any]): js.Any = js.native
  @JSImport("@ant-design/icons/dist/utils", "generate")
  @js.native
  def generate_false(node: AbstractNode, key: String, rootProps: `false`): js.Any = js.native
  
  @JSImport("@ant-design/icons/dist/utils", "getSecondaryColor")
  @js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  
  @JSImport("@ant-design/icons/dist/utils", "iconStyles")
  @js.native
  val iconStyles: /* "\n.anticon {\n  display: inline-block;\n  color: inherit;\n  font-style: normal;\n  line-height: 0;\n  text-align: center;\n  text-transform: none;\n  vertical-align: -0.125em;\n  text-rendering: optimizeLegibility;\n  -webkit-font-smoothing: antialiased;\n  -moz-osx-font-smoothing: grayscale;\n}\n\n.anticon > * {\n  line-height: 1;\n}\n\n.anticon svg {\n  display: inline-block;\n}\n\n.anticon::before {\n  display: none;\n}\n\n.anticon .anticon-icon {\n  display: block;\n}\n\n.anticon[tabindex] {\n  cursor: pointer;\n}\n\n.anticon-spin::before,\n.anticon-spin {\n  display: inline-block;\n  -webkit-animation: loadingCircle 1s infinite linear;\n  animation: loadingCircle 1s infinite linear;\n}\n\n@-webkit-keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n\n@keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n" */ String = js.native
  
  @JSImport("@ant-design/icons/dist/utils", "isIconDefinition")
  @js.native
  def isIconDefinition(target: js.Any): /* is @ant-design/icons-svg.@ant-design/icons-svg/lib/types.IconDefinition */ Boolean = js.native
  
  @JSImport("@ant-design/icons/dist/utils", "normalizeAttrs")
  @js.native
  def normalizeAttrs(): Attrs = js.native
  @JSImport("@ant-design/icons/dist/utils", "normalizeAttrs")
  @js.native
  def normalizeAttrs(attrs: Attrs): Attrs = js.native
  
  @JSImport("@ant-design/icons/dist/utils", "normalizeTwoToneColors")
  @js.native
  def normalizeTwoToneColors(): js.Array[String] = js.native
  @JSImport("@ant-design/icons/dist/utils", "normalizeTwoToneColors")
  @js.native
  def normalizeTwoToneColors(twoToneColor: String): js.Array[String] = js.native
  @JSImport("@ant-design/icons/dist/utils", "normalizeTwoToneColors")
  @js.native
  def normalizeTwoToneColors(twoToneColor: js.Tuple2[String, String]): js.Array[String] = js.native
  
  object svgBaseProps {
    
    @JSImport("@ant-design/icons/dist/utils", "svgBaseProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons/dist/utils", "svgBaseProps.aria-hidden")
    @js.native
    def ariaHidden: String = js.native
    
    @scala.inline
    def ariaHidden_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons/dist/utils", "svgBaseProps.fill")
    @js.native
    def fill: String = js.native
    @scala.inline
    def fill_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons/dist/utils", "svgBaseProps.focusable")
    @js.native
    def focusable: String = js.native
    @scala.inline
    def focusable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons/dist/utils", "svgBaseProps.height")
    @js.native
    def height: String = js.native
    @scala.inline
    def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons/dist/utils", "svgBaseProps.width")
    @js.native
    def width: String = js.native
    @scala.inline
    def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/icons/dist/utils", "useInsertStyles")
  @js.native
  def useInsertStyles(): Unit = js.native
  @JSImport("@ant-design/icons/dist/utils", "useInsertStyles")
  @js.native
  def useInsertStyles(styleStr: String): Unit = js.native
  
  @JSImport("@ant-design/icons/dist/utils", "warning")
  @js.native
  def warning(valid: Boolean, message: String): Unit = js.native
  
  type Attrs = StringDictionary[String]
}
