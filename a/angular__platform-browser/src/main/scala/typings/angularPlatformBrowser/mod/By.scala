package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.DebugElement
import typings.angularCore.mod.DebugNode
import typings.angularCore.mod.Predicate
import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "By")
@js.native
open class By () extends StObject
/* static members */
object By {
  
  @JSImport("@angular/platform-browser", "By")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Match all nodes.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_all'}
    */
  inline def all(): Predicate[DebugNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[Predicate[DebugNode]]
  
  /**
    * Match elements by the given CSS selector.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
    */
  inline def css(selector: String): Predicate[DebugElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(selector.asInstanceOf[js.Any]).asInstanceOf[Predicate[DebugElement]]
  
  /**
    * Match nodes that have the given directive present.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
    */
  inline def directive(`type`: Type[Any]): Predicate[DebugNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("directive")(`type`.asInstanceOf[js.Any]).asInstanceOf[Predicate[DebugNode]]
}
