package typings.atlaskitPopper

import typings.atlaskitInProductTesting.mod.InProductTestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInProductMod {
  
  @JSImport("@atlaskit/popper/dist/types/in-product", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def popperRendersTestCase(elementSelector: String): InProductTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("popperRendersTestCase")(elementSelector.asInstanceOf[js.Any]).asInstanceOf[InProductTestCase]
  inline def popperRendersTestCase(
    elementSelector: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.atlaskitPopper.atlaskitPopperStrings.a, typings.atlaskitPopper.atlaskitPopperStrings.abbr, typings.atlaskitPopper.atlaskitPopperStrings.address */ Any
  ): InProductTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("popperRendersTestCase")(elementSelector.asInstanceOf[js.Any]).asInstanceOf[InProductTestCase]
}
