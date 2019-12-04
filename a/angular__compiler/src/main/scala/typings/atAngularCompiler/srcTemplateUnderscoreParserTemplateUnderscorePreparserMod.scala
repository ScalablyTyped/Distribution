package typings.atAngularCompiler

import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Element
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElement
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_preparser", JSImport.Namespace)
@js.native
object srcTemplateUnderscoreParserTemplateUnderscorePreparserMod extends js.Object {
  @js.native
  class PreparsedElement protected () extends js.Object {
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
  sealed trait PreparsedElementType extends js.Object
  
  def preparseElement(ast: Element): PreparsedElement = js.native
  @js.native
  object PreparsedElementType extends js.Object {
    @js.native
    sealed trait NG_CONTENT extends PreparsedElementType
    
    @js.native
    sealed trait OTHER extends PreparsedElementType
    
    @js.native
    sealed trait SCRIPT extends PreparsedElementType
    
    @js.native
    sealed trait STYLE extends PreparsedElementType
    
    @js.native
    sealed trait STYLESHEET extends PreparsedElementType
    
    /* 0 */ val NG_CONTENT: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.NG_CONTENT with Double = js.native
    /* 4 */ val OTHER: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.OTHER with Double = js.native
    /* 3 */ val SCRIPT: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.SCRIPT with Double = js.native
    /* 1 */ val STYLE: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.STYLE with Double = js.native
    /* 2 */ val STYLESHEET: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.STYLESHEET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PreparsedElementType with Double] = js.native
  }
  
}

