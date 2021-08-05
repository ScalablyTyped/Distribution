package typings.angularCompiler

import typings.angularCompiler.anon.ClosedByChildren
import typings.angularCompiler.tagsMod.TagContentType
import typings.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlTagsMod {
  
  @JSImport("@angular/compiler/src/ml_parser/html_tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/html_tags", "HtmlTagDefinition")
  @js.native
  class HtmlTagDefinition ()
    extends StObject
       with TagDefinition {
    def this(hasClosedByChildrenImplicitNamespacePrefixContentTypeClosedByParentIsVoidIgnoreFirstLfPreventNamespaceInheritance: ClosedByChildren) = this()
    
    /* CompleteClass */
    var canSelfClose: Boolean = js.native
    
    /* private */ var closedByChildren: js.Any = js.native
    
    /* CompleteClass */
    var closedByParent: Boolean = js.native
    
    /* CompleteClass */
    var contentType: TagContentType = js.native
    
    /* CompleteClass */
    var ignoreFirstLf: Boolean = js.native
    
    /* CompleteClass */
    var implicitNamespacePrefix: String | Null = js.native
    
    /* CompleteClass */
    override def isClosedByChild(name: String): Boolean = js.native
    
    /* CompleteClass */
    var isVoid: Boolean = js.native
    
    /* CompleteClass */
    var preventNamespaceInheritance: Boolean = js.native
  }
  
  inline def getHtmlTagDefinition(tagName: String): HtmlTagDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlTagDefinition")(tagName.asInstanceOf[js.Any]).asInstanceOf[HtmlTagDefinition]
}
