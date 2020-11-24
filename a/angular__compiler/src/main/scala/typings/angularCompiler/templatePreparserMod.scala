package typings.angularCompiler

import org.scalablytyped.runtime.TopLevel
import typings.angularCompiler.mlParserAstMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_preparser", JSImport.Namespace)
@js.native
object templatePreparserMod extends js.Object {
  
  def preparseElement(ast: Element): PreparsedElement = js.native
  
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
  @js.native
  object PreparsedElementType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PreparsedElementType with Double] = js.native
    
    @js.native
    sealed trait NG_CONTENT extends PreparsedElementType
    /* 0 */ @js.native
    object NG_CONTENT extends TopLevel[NG_CONTENT with Double]
    
    @js.native
    sealed trait OTHER extends PreparsedElementType
    /* 4 */ @js.native
    object OTHER extends TopLevel[OTHER with Double]
    
    @js.native
    sealed trait SCRIPT extends PreparsedElementType
    /* 3 */ @js.native
    object SCRIPT extends TopLevel[SCRIPT with Double]
    
    @js.native
    sealed trait STYLE extends PreparsedElementType
    /* 1 */ @js.native
    object STYLE extends TopLevel[STYLE with Double]
    
    @js.native
    sealed trait STYLESHEET extends PreparsedElementType
    /* 2 */ @js.native
    object STYLESHEET extends TopLevel[STYLESHEET with Double]
  }
}
