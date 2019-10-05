package typings.atAntDashDesignIconsDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignIcons.libTypesMod.AbstractNode
import typings.atAntDashDesignIconsDashReact.atAntDashDesignIconsDashReactNumbers.`false`
import typings.atAntDashDesignIconsDashReact.atAntDashDesignIconsDashReactStrings.fill
import typings.atAntDashDesignIconsDashReact.atAntDashDesignIconsDashReactStrings.outline
import typings.atAntDashDesignIconsDashReact.atAntDashDesignIconsDashReactStrings.twotone
import typings.atAntDashDesignIconsDashReact.esUtilsMod.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-react/es/utils", JSImport.Namespace)
@js.native
object esUtilsMod extends js.Object {
  @js.native
  class MiniMap[V] () extends js.Object {
    var collection: js.Any = js.native
    val size: Double = js.native
    def clear(): Unit = js.native
    def delete(key: String): Boolean = js.native
    def get(key: String): js.UndefOr[V] = js.native
    def has(key: String): Boolean = js.native
    def set(key: String, value: V): this.type = js.native
  }
  
  def generate(node: AbstractNode, key: String): js.Any = js.native
  def generate(node: AbstractNode, key: String, rootProps: StringDictionary[js.Any]): js.Any = js.native
  @JSName("generate")
  def generate_false(node: AbstractNode, key: String, rootProps: `false`): js.Any = js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  def isIconDefinition(target: js.Any): /* is @ant-design/icons.@ant-design/icons/lib/types.IconDefinition */ Boolean = js.native
  def log(message: String): Unit = js.native
  def normalizeAttrs(): Attrs = js.native
  def normalizeAttrs(attrs: Attrs): Attrs = js.native
  @JSName("withSuffix")
  def withSuffix_fill(name: String, theme: fill): String = js.native
  @JSName("withSuffix")
  def withSuffix_outline(name: String, theme: outline): String = js.native
  @JSName("withSuffix")
  def withSuffix_twotone(name: String, theme: twotone): String = js.native
  type Attrs = StringDictionary[String]
}

