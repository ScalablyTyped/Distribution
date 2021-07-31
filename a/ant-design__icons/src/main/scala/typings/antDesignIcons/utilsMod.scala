package typings.antDesignIcons

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIcons.antDesignIconsBooleans.`false`
import typings.antDesignIconsSvg.typesMod.AbstractNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generate(node: AbstractNode, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def generate(node: AbstractNode, key: String, rootProps: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rootProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def generate_false(node: AbstractNode, key: String, rootProps: `false`): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rootProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getSecondaryColor(primaryColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryColor")(primaryColor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@ant-design/icons/dist/utils", "iconStyles")
  @js.native
  val iconStyles: /* "\n.anticon {\n  display: inline-block;\n  color: inherit;\n  font-style: normal;\n  line-height: 0;\n  text-align: center;\n  text-transform: none;\n  vertical-align: -0.125em;\n  text-rendering: optimizeLegibility;\n  -webkit-font-smoothing: antialiased;\n  -moz-osx-font-smoothing: grayscale;\n}\n\n.anticon > * {\n  line-height: 1;\n}\n\n.anticon svg {\n  display: inline-block;\n}\n\n.anticon::before {\n  display: none;\n}\n\n.anticon .anticon-icon {\n  display: block;\n}\n\n.anticon[tabindex] {\n  cursor: pointer;\n}\n\n.anticon-spin::before,\n.anticon-spin {\n  display: inline-block;\n  -webkit-animation: loadingCircle 1s infinite linear;\n  animation: loadingCircle 1s infinite linear;\n}\n\n@-webkit-keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n\n@keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n" */ String = js.native
  
  @scala.inline
  def isIconDefinition(target: js.Any): /* is @ant-design/icons-svg.@ant-design/icons-svg/lib/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-svg.@ant-design/icons-svg/lib/types.IconDefinition */ Boolean]
  
  @scala.inline
  def normalizeAttrs(): Attrs = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttrs")().asInstanceOf[Attrs]
  @scala.inline
  def normalizeAttrs(attrs: Attrs): Attrs = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttrs")(attrs.asInstanceOf[js.Any]).asInstanceOf[Attrs]
  
  @scala.inline
  def normalizeTwoToneColors(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTwoToneColors")().asInstanceOf[js.Array[String]]
  @scala.inline
  def normalizeTwoToneColors(twoToneColor: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTwoToneColors")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def normalizeTwoToneColors(twoToneColor: js.Tuple2[String, String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTwoToneColors")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
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
  
  @scala.inline
  def useInsertStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertStyles")().asInstanceOf[Unit]
  @scala.inline
  def useInsertStyles(styleStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertStyles")(styleStr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warning(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Attrs = StringDictionary[String]
}
