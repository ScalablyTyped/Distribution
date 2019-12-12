package typings.atAngularCompiler

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Element
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElement
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.NG_CONTENT
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.OTHER
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.SCRIPT
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.STYLE
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscorePreparserMod.PreparsedElementType.STYLESHEET
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PreparsedElementType with Double] = js.native
    /* 0 */ @js.native
    object NG_CONTENT extends TopLevel[NG_CONTENT with Double]
    
    /* 4 */ @js.native
    object OTHER extends TopLevel[OTHER with Double]
    
    /* 3 */ @js.native
    object SCRIPT extends TopLevel[SCRIPT with Double]
    
    /* 1 */ @js.native
    object STYLE extends TopLevel[STYLE with Double]
    
    /* 2 */ @js.native
    object STYLESHEET extends TopLevel[STYLESHEET with Double]
    
  }
  
}

