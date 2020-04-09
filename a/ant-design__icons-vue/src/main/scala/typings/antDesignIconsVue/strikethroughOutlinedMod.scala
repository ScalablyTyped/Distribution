package typings.antDesignIconsVue

import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-vue/lib/icons/StrikethroughOutlined", JSImport.Namespace)
@js.native
object strikethroughOutlinedMod extends js.Object {
  @js.native
  trait StrikethroughOutlined extends Vue {
    var icon: IconDefinition = js.native
    var rotate: js.UndefOr[Double] = js.native
    var spin: js.UndefOr[Boolean] = js.native
    var tabIndex: js.UndefOr[Double] = js.native
    var twoToneColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  }
  
  @js.native
  class default () extends StrikethroughOutlined
  
  /* static members */
  @js.native
  object default extends js.Object {
    def install(vue: VueConstructor[Vue]): Unit = js.native
  }
  
}

