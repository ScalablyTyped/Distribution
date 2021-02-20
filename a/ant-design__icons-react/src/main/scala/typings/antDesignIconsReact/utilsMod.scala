package typings.antDesignIconsReact

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsReact.antDesignIconsReactBooleans.`false`
import typings.antDesignIconsReact.antDesignIconsReactStrings.fill
import typings.antDesignIconsReact.antDesignIconsReactStrings.outline
import typings.antDesignIconsReact.antDesignIconsReactStrings.twotone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons-react/lib/utils", "MiniMap")
  @js.native
  class MiniMap[V] () extends StObject {
    
    def clear(): Unit = js.native
    
    var collection: js.Any = js.native
    
    def delete(key: String): Boolean = js.native
    
    def get(key: String): js.UndefOr[V] = js.native
    
    def has(key: String): Boolean = js.native
    
    def set(key: String, value: V): this.type = js.native
    
    val size: Double = js.native
  }
  
  @JSImport("@ant-design/icons-react/lib/utils", "generate")
  @js.native
  def generate(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String
  ): js.Any = js.native
  @JSImport("@ant-design/icons-react/lib/utils", "generate")
  @js.native
  def generate(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String,
    rootProps: StringDictionary[js.Any]
  ): js.Any = js.native
  @JSImport("@ant-design/icons-react/lib/utils", "generate")
  @js.native
  def generate_false(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String,
    rootProps: `false`
  ): js.Any = js.native
  
  @JSImport("@ant-design/icons-react/lib/utils", "getSecondaryColor")
  @js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  
  @JSImport("@ant-design/icons-react/lib/utils", "isIconDefinition")
  @js.native
  def isIconDefinition(target: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition * / any */ Boolean = js.native
  
  @JSImport("@ant-design/icons-react/lib/utils", "log")
  @js.native
  def log(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-react/lib/utils", "normalizeAttrs")
  @js.native
  def normalizeAttrs(): Attrs = js.native
  @JSImport("@ant-design/icons-react/lib/utils", "normalizeAttrs")
  @js.native
  def normalizeAttrs(attrs: Attrs): Attrs = js.native
  
  @JSImport("@ant-design/icons-react/lib/utils", "withSuffix")
  @js.native
  def withSuffix_fill(name: String, theme: fill): String = js.native
  @JSImport("@ant-design/icons-react/lib/utils", "withSuffix")
  @js.native
  def withSuffix_outline(name: String, theme: outline): String = js.native
  @JSImport("@ant-design/icons-react/lib/utils", "withSuffix")
  @js.native
  def withSuffix_twotone(name: String, theme: twotone): String = js.native
  
  type Attrs = StringDictionary[String]
}
