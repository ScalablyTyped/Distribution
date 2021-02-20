package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowCssMod {
  
  @JSImport("@angular/compiler/src/shadow_css", "CssRule")
  @js.native
  class CssRule protected () extends StObject {
    def this(selector: String, content: String) = this()
    
    var content: String = js.native
    
    var selector: String = js.native
  }
  
  @JSImport("@angular/compiler/src/shadow_css", "ShadowCss")
  @js.native
  class ShadowCss () extends StObject {
    
    var _applySelectorScope: js.Any = js.native
    
    var _applySimpleSelectorScope: js.Any = js.native
    
    var _colonHostContextPartReplacer: js.Any = js.native
    
    var _colonHostPartReplacer: js.Any = js.native
    
    var _convertColonHost: js.Any = js.native
    
    var _convertColonHostContext: js.Any = js.native
    
    var _convertColonRule: js.Any = js.native
    
    var _convertShadowDOMSelectors: js.Any = js.native
    
    var _extractUnscopedRulesFromCssText: js.Any = js.native
    
    var _insertDirectives: js.Any = js.native
    
    var _insertPolyfillDirectivesInCssText: js.Any = js.native
    
    var _insertPolyfillHostInCssText: js.Any = js.native
    
    var _insertPolyfillRulesInCssText: js.Any = js.native
    
    var _makeScopeMatcher: js.Any = js.native
    
    var _scopeCssText: js.Any = js.native
    
    var _scopeSelector: js.Any = js.native
    
    var _scopeSelectors: js.Any = js.native
    
    var _selectorNeedsScoping: js.Any = js.native
    
    def shimCssText(cssText: String, selector: String): String = js.native
    def shimCssText(cssText: String, selector: String, hostSelector: String): String = js.native
    
    var strictStyling: Boolean = js.native
  }
  
  @JSImport("@angular/compiler/src/shadow_css", "processRules")
  @js.native
  def processRules(input: String, ruleCallback: js.Function1[/* rule */ CssRule, CssRule]): String = js.native
}
