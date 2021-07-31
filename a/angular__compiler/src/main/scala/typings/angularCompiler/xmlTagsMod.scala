package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.tagsMod.TagContentType
import typings.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlTagsMod {
  
  @JSImport("@angular/compiler/src/ml_parser/xml_tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/xml_tags", "XmlTagDefinition")
  @js.native
  class XmlTagDefinition ()
    extends StObject
       with TagDefinition {
    
    /* CompleteClass */
    var canSelfClose: Boolean = js.native
    
    /* CompleteClass */
    var closedByParent: Boolean = js.native
    
    /* CompleteClass */
    var contentType: TagContentType = js.native
    
    /* CompleteClass */
    var ignoreFirstLf: Boolean = js.native
    
    /* CompleteClass */
    var implicitNamespacePrefix: String | Null = js.native
    @JSName("implicitNamespacePrefix")
    var implicitNamespacePrefix_XmlTagDefinition: String = js.native
    
    /* CompleteClass */
    override def isClosedByChild(name: String): Boolean = js.native
    
    /* CompleteClass */
    var isVoid: Boolean = js.native
    
    var parentToAdd: String = js.native
    
    /* CompleteClass */
    var preventNamespaceInheritance: Boolean = js.native
    
    def requireExtraParent(currentParent: String): Boolean = js.native
    
    var requiredParents: StringDictionary[Boolean] = js.native
  }
  
  @scala.inline
  def getXmlTagDefinition(tagName: String): XmlTagDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getXmlTagDefinition")(tagName.asInstanceOf[js.Any]).asInstanceOf[XmlTagDefinition]
}
