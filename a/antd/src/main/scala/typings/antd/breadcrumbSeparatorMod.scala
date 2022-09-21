package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.`0`
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbSeparatorMod extends Shortcut {
  
  @JSImport("antd/lib/breadcrumb/BreadcrumbSeparator", JSImport.Default)
  @js.native
  val default: BreadcrumbSeparatorInterface = js.native
  
  @js.native
  trait BreadcrumbSeparatorInterface
    extends StObject
       with FunctionComponent[`0`] {
    
    var __ANT_BREADCRUMB_SEPARATOR: Boolean = js.native
  }
  
  type _To = BreadcrumbSeparatorInterface
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbSeparatorMod.foo` */
  override def _to: BreadcrumbSeparatorInterface = default
}
