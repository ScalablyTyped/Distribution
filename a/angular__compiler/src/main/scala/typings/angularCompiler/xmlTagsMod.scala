package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlTagsMod {
  
  @JSImport("@angular/compiler/src/ml_parser/xml_tags", "XmlTagDefinition")
  @js.native
  class XmlTagDefinition () extends TagDefinition {
    
    @JSName("implicitNamespacePrefix")
    var implicitNamespacePrefix_XmlTagDefinition: String = js.native
    
    var parentToAdd: String = js.native
    
    def requireExtraParent(currentParent: String): Boolean = js.native
    
    var requiredParents: StringDictionary[Boolean] = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/xml_tags", "getXmlTagDefinition")
  @js.native
  def getXmlTagDefinition(tagName: String): XmlTagDefinition = js.native
}
