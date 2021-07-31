package typings.antDesignIconsReact

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsReact.antDesignIconsReactBooleans.`false`
import typings.antDesignIconsReact.antDesignIconsReactStrings.fill
import typings.antDesignIconsReact.antDesignIconsReactStrings.outline
import typings.antDesignIconsReact.antDesignIconsReactStrings.twotone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons-react/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def generate(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def generate(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String,
    rootProps: StringDictionary[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rootProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def generate_false(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String,
    rootProps: `false`
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rootProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getSecondaryColor(primaryColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryColor")(primaryColor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isIconDefinition(target: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition * / any */ Boolean]
  
  @scala.inline
  def log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def normalizeAttrs(): Attrs = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttrs")().asInstanceOf[Attrs]
  @scala.inline
  def normalizeAttrs(attrs: Attrs): Attrs = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttrs")(attrs.asInstanceOf[js.Any]).asInstanceOf[Attrs]
  
  @scala.inline
  def withSuffix_fill(name: String, theme: fill): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def withSuffix_outline(name: String, theme: outline): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def withSuffix_twotone(name: String, theme: twotone): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Attrs = StringDictionary[String]
}
