package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsMod {
  
  @JSImport("@angular/compiler/src/ml_parser/tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/tags", "NGSP_UNICODE")
  @js.native
  val NGSP_UNICODE: /* "\\uE500" */ String = js.native
  
  @js.native
  sealed trait TagContentType extends StObject
  @JSImport("@angular/compiler/src/ml_parser/tags", "TagContentType")
  @js.native
  object TagContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TagContentType & Double] = js.native
    
    @js.native
    sealed trait ESCAPABLE_RAW_TEXT
      extends StObject
         with TagContentType
    /* 1 */ val ESCAPABLE_RAW_TEXT: typings.angularCompiler.tagsMod.TagContentType.ESCAPABLE_RAW_TEXT & Double = js.native
    
    @js.native
    sealed trait PARSABLE_DATA
      extends StObject
         with TagContentType
    /* 2 */ val PARSABLE_DATA: typings.angularCompiler.tagsMod.TagContentType.PARSABLE_DATA & Double = js.native
    
    @js.native
    sealed trait RAW_TEXT
      extends StObject
         with TagContentType
    /* 0 */ val RAW_TEXT: typings.angularCompiler.tagsMod.TagContentType.RAW_TEXT & Double = js.native
  }
  
  @scala.inline
  def getNsPrefix(fullName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getNsPrefix(fullName: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @scala.inline
  def isNgContainer(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNgContainer")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNgContent(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNgContent")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNgTemplate(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNgTemplate")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mergeNsAndName(prefix: String, localName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNsAndName")(prefix.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def splitNsName(elementName: String): js.Tuple2[String | Null, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitNsName")(elementName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String | Null, String]]
  
  trait TagDefinition extends StObject {
    
    var canSelfClose: Boolean
    
    var closedByParent: Boolean
    
    var contentType: TagContentType
    
    var ignoreFirstLf: Boolean
    
    var implicitNamespacePrefix: String | Null
    
    def isClosedByChild(name: String): Boolean
    
    var isVoid: Boolean
    
    var preventNamespaceInheritance: Boolean
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
      val __obj = js.Dynamic.literal(canSelfClose = canSelfClose.asInstanceOf[js.Any], closedByParent = closedByParent.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], ignoreFirstLf = ignoreFirstLf.asInstanceOf[js.Any], isClosedByChild = js.Any.fromFunction1(isClosedByChild), isVoid = isVoid.asInstanceOf[js.Any], preventNamespaceInheritance = preventNamespaceInheritance.asInstanceOf[js.Any], implicitNamespacePrefix = null)
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
