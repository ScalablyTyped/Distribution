package typings.antDesignIconsVue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.antDesignIconsSvg.typesMod.AbstractNode
import typings.antDesignIconsVue.antDesignIconsVueBooleans.`false`
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons-vue/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(node: AbstractNode, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def generate(node: AbstractNode, key: String, rootProps: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rootProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def generate_false(node: AbstractNode, key: String, rootProps: `false`): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rootProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getSecondaryColor(primaryColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryColor")(primaryColor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@ant-design/icons-vue/lib/utils", "iconStyles")
  @js.native
  val iconStyles: /* "\n.anticon {\n  display: inline-block;\n  color: inherit;\n  font-style: normal;\n  line-height: 0;\n  text-align: center;\n  text-transform: none;\n  vertical-align: -0.125em;\n  text-rendering: optimizeLegibility;\n  -webkit-font-smoothing: antialiased;\n  -moz-osx-font-smoothing: grayscale;\n}\n\n.anticon > * {\n  line-height: 1;\n}\n\n.anticon svg {\n  display: inline-block;\n}\n\n.anticon::before {\n  display: none;\n}\n\n.anticon .anticon-icon {\n  display: block;\n}\n\n.anticon[tabindex] {\n  cursor: pointer;\n}\n\n.anticon-spin::before,\n.anticon-spin {\n  display: inline-block;\n  -webkit-animation: loadingCircle 1s infinite linear;\n  animation: loadingCircle 1s infinite linear;\n}\n\n@-webkit-keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n\n@keyframes loadingCircle {\n  100% {\n    -webkit-transform: rotate(360deg);\n    transform: rotate(360deg);\n  }\n}\n" */ String = js.native
  
  inline def isIconDefinition(target: js.Any): /* is @ant-design/icons-svg.@ant-design/icons-svg/lib/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-svg.@ant-design/icons-svg/lib/types.IconDefinition */ Boolean]
  
  inline def normalizeAttrs(): Attrs = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttrs")().asInstanceOf[Attrs]
  inline def normalizeAttrs(attrs: Attrs): Attrs = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttrs")(attrs.asInstanceOf[js.Any]).asInstanceOf[Attrs]
  
  inline def normalizeTwoToneColors(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTwoToneColors")().asInstanceOf[js.Array[String]]
  inline def normalizeTwoToneColors(twoToneColor: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTwoToneColors")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def normalizeTwoToneColors(twoToneColor: js.Tuple2[String, String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTwoToneColors")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("@ant-design/icons-vue/lib/utils", "svgBaseProps")
  @js.native
  val svgBaseProps: js.Any = js.native
  
  inline def useInsertStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertStyles")().asInstanceOf[Unit]
  inline def useInsertStyles(styleStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertStyles")(styleStr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warning(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Attrs = StringDictionary[String]
  
  type EventHandlers[E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @ant-design/icons-vue.@ant-design/icons-vue/lib/utils.StringKeyOf<E> ]:? E[K] extends std.Function? E[K] : (payload : E[K]): void}
    */ typings.antDesignIconsVue.antDesignIconsVueStrings.EventHandlers & TopLevel[js.Any]
  
  type StringKeyOf[T] = Extract[/* keyof T */ String, String]
}
