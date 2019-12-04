package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagContentType
import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagDefinition
import typings.atAngularCompiler.srcMlUnderscoreParserXmlUnderscoreTagsMod.XmlTagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/xml_tags", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserXmlUnderscoreTagsMod extends js.Object {
  @js.native
  class XmlTagDefinition () extends TagDefinition {
    /* CompleteClass */
    override var canSelfClose: Boolean = js.native
    /* CompleteClass */
    override var closedByParent: Boolean = js.native
    /* CompleteClass */
    override var contentType: TagContentType = js.native
    /* CompleteClass */
    override var ignoreFirstLf: Boolean = js.native
    /* CompleteClass */
    override var implicitNamespacePrefix: String | Null = js.native
    @JSName("implicitNamespacePrefix")
    var implicitNamespacePrefix_XmlTagDefinition: String = js.native
    /* CompleteClass */
    override var isVoid: Boolean = js.native
    var parentToAdd: String = js.native
    var requiredParents: StringDictionary[Boolean] = js.native
    /* CompleteClass */
    override def isClosedByChild(name: String): Boolean = js.native
    def requireExtraParent(currentParent: String): Boolean = js.native
  }
  
  def getXmlTagDefinition(tagName: String): XmlTagDefinition = js.native
}

