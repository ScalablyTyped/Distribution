package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsMod {
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "NGSP_UNICODE")
  @js.native
  val NGSP_UNICODE: /* "\\uE500" */ String = js.native
  
  @js.native
  sealed trait TagContentType extends StObject
  @JSImport("@angular/compiler/src/ml_parser/tags", "TagContentType")
  @js.native
  object TagContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TagContentType with Double] = js.native
    
    @js.native
    sealed trait ESCAPABLE_RAW_TEXT extends TagContentType
    /* 1 */ val ESCAPABLE_RAW_TEXT: typings.angularCompiler.tagsMod.TagContentType.ESCAPABLE_RAW_TEXT with Double = js.native
    
    @js.native
    sealed trait PARSABLE_DATA extends TagContentType
    /* 2 */ val PARSABLE_DATA: typings.angularCompiler.tagsMod.TagContentType.PARSABLE_DATA with Double = js.native
    
    @js.native
    sealed trait RAW_TEXT extends TagContentType
    /* 0 */ val RAW_TEXT: typings.angularCompiler.tagsMod.TagContentType.RAW_TEXT with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "getNsPrefix")
  @js.native
  def getNsPrefix(fullName: String): String = js.native
  @JSImport("@angular/compiler/src/ml_parser/tags", "getNsPrefix")
  @js.native
  def getNsPrefix(fullName: Null): Null = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "isNgContainer")
  @js.native
  def isNgContainer(tagName: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "isNgContent")
  @js.native
  def isNgContent(tagName: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "isNgTemplate")
  @js.native
  def isNgTemplate(tagName: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "mergeNsAndName")
  @js.native
  def mergeNsAndName(prefix: String, localName: String): String = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "splitNsName")
  @js.native
  def splitNsName(elementName: String): js.Tuple2[String | Null, String] = js.native
  
  @js.native
  trait TagDefinition extends StObject {
    
    var canSelfClose: Boolean = js.native
    
    var closedByParent: Boolean = js.native
    
    var contentType: TagContentType = js.native
    
    var ignoreFirstLf: Boolean = js.native
    
    var implicitNamespacePrefix: String | Null = js.native
    
    def isClosedByChild(name: String): Boolean = js.native
    
    var isVoid: Boolean = js.native
    
    var preventNamespaceInheritance: Boolean = js.native
  }
  object TagDefinition {
    
    @scala.inline
    def apply(
      canSelfClose: Boolean,
      closedByParent: Boolean,
      contentType: TagContentType,
      ignoreFirstLf: Boolean,
      isClosedByChild: String => Boolean,
      isVoid: Boolean,
      preventNamespaceInheritance: Boolean
    ): TagDefinition = {
      val __obj = js.Dynamic.literal(canSelfClose = canSelfClose.asInstanceOf[js.Any], closedByParent = closedByParent.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], ignoreFirstLf = ignoreFirstLf.asInstanceOf[js.Any], isClosedByChild = js.Any.fromFunction1(isClosedByChild), isVoid = isVoid.asInstanceOf[js.Any], preventNamespaceInheritance = preventNamespaceInheritance.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagDefinition]
    }
    
    @scala.inline
    implicit class TagDefinitionMutableBuilder[Self <: TagDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanSelfClose(value: Boolean): Self = StObject.set(x, "canSelfClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedByParent(value: Boolean): Self = StObject.set(x, "closedByParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: TagContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFirstLf(value: Boolean): Self = StObject.set(x, "ignoreFirstLf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitNamespacePrefix(value: String): Self = StObject.set(x, "implicitNamespacePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitNamespacePrefixNull: Self = StObject.set(x, "implicitNamespacePrefix", null)
      
      @scala.inline
      def setIsClosedByChild(value: String => Boolean): Self = StObject.set(x, "isClosedByChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVoid(value: Boolean): Self = StObject.set(x, "isVoid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventNamespaceInheritance(value: Boolean): Self = StObject.set(x, "preventNamespaceInheritance", value.asInstanceOf[js.Any])
    }
  }
}
