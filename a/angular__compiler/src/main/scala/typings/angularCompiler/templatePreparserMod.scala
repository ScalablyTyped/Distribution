package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatePreparserMod {
  
  @JSImport("@angular/compiler/src/template_parser/template_preparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/template_parser/template_preparser", "PreparsedElement")
  @js.native
  class PreparsedElement protected () extends StObject {
    def this(
      `type`: PreparsedElementType,
      selectAttr: String,
      hrefAttr: String,
      nonBindable: Boolean,
      projectAs: String
    ) = this()
    
    var hrefAttr: String = js.native
    
    var nonBindable: Boolean = js.native
    
    var projectAs: String = js.native
    
    var selectAttr: String = js.native
    
    var `type`: PreparsedElementType = js.native
  }
  
  @js.native
  sealed trait PreparsedElementType extends StObject
  @JSImport("@angular/compiler/src/template_parser/template_preparser", "PreparsedElementType")
  @js.native
  object PreparsedElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PreparsedElementType & Double] = js.native
    
    @js.native
    sealed trait NG_CONTENT
      extends StObject
         with PreparsedElementType
    /* 0 */ val NG_CONTENT: typings.angularCompiler.templatePreparserMod.PreparsedElementType.NG_CONTENT & Double = js.native
    
    @js.native
    sealed trait OTHER
      extends StObject
         with PreparsedElementType
    /* 4 */ val OTHER: typings.angularCompiler.templatePreparserMod.PreparsedElementType.OTHER & Double = js.native
    
    @js.native
    sealed trait SCRIPT
      extends StObject
         with PreparsedElementType
    /* 3 */ val SCRIPT: typings.angularCompiler.templatePreparserMod.PreparsedElementType.SCRIPT & Double = js.native
    
    @js.native
    sealed trait STYLE
      extends StObject
         with PreparsedElementType
    /* 1 */ val STYLE: typings.angularCompiler.templatePreparserMod.PreparsedElementType.STYLE & Double = js.native
    
    @js.native
    sealed trait STYLESHEET
      extends StObject
         with PreparsedElementType
    /* 2 */ val STYLESHEET: typings.angularCompiler.templatePreparserMod.PreparsedElementType.STYLESHEET & Double = js.native
  }
  
  inline def preparseElement(ast: Element): PreparsedElement = ^.asInstanceOf[js.Dynamic].applyDynamic("preparseElement")(ast.asInstanceOf[js.Any]).asInstanceOf[PreparsedElement]
}
