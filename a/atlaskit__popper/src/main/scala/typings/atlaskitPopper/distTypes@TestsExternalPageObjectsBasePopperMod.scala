package typings.atlaskitPopper

import typings.atlaskitInProductTesting.distTypesTypesMod.CypressType
import typings.atlaskitInProductTesting.mod.InProductTestPageObject
import typings.cypress.Cypress.Chainable
import typings.cypress.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTypes@TestsExternalPageObjectsBasePopperMod` {
  
  @JSImport("@atlaskit/popper/dist/types/@/tests_external/page-objects/base-popper", "BasePopperPageObject")
  @js.native
  open class BasePopperPageObject protected () extends InProductTestPageObject {
    def this(cy: CypressType) = this()
    
    def assertPopperStyle(elementSelector: String): Chainable[JQuery[HTMLElement]] = js.native
    def assertPopperStyle(
      elementSelector: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.atlaskitPopper.atlaskitPopperStrings.a, typings.atlaskitPopper.atlaskitPopperStrings.abbr, typings.atlaskitPopper.atlaskitPopperStrings.address */ Any
    ): Chainable[JQuery[HTMLElement]] = js.native
  }
}
