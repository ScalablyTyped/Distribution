package typings.antdMobile

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsIsNodeWithContentMod {
  
  @JSImport("antd-mobile/es/utils/is-node-with-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNodeWithContent(node: ReactNode): /* is antd-mobile.antd-mobile/es/utils/is-node-with-content.Regulated<react.react.ReactNode> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeWithContent")(node.asInstanceOf[js.Any]).asInstanceOf[/* is antd-mobile.antd-mobile/es/utils/is-node-with-content.Regulated<react.react.ReactNode> */ Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends null | undefined | false ? never : T
    }}}
    */
  type Regulated[T] = T
}
