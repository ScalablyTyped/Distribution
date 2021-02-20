package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatePreparserMod {
  
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
    def apply(value: Double): js.UndefOr[PreparsedElementType with Double] = js.native
    
    @js.native
    sealed trait NG_CONTENT extends PreparsedElementType
    /* 0 */ val NG_CONTENT: typings.angularCompiler.templatePreparserMod.PreparsedElementType.NG_CONTENT with Double = js.native
    
    @js.native
    sealed trait OTHER extends PreparsedElementType
    /* 4 */ val OTHER: typings.angularCompiler.templatePreparserMod.PreparsedElementType.OTHER with Double = js.native
    
    @js.native
    sealed trait SCRIPT extends PreparsedElementType
    /* 3 */ val SCRIPT: typings.angularCompiler.templatePreparserMod.PreparsedElementType.SCRIPT with Double = js.native
    
    @js.native
    sealed trait STYLE extends PreparsedElementType
    /* 1 */ val STYLE: typings.angularCompiler.templatePreparserMod.PreparsedElementType.STYLE with Double = js.native
    
    @js.native
    sealed trait STYLESHEET extends PreparsedElementType
    /* 2 */ val STYLESHEET: typings.angularCompiler.templatePreparserMod.PreparsedElementType.STYLESHEET with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_preparser", "preparseElement")
  @js.native
  def preparseElement(ast: Element): PreparsedElement = js.native
}
