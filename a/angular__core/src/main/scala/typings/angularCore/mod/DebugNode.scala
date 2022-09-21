package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "DebugNode")
@js.native
open class DebugNode protected () extends StObject {
  def this(nativeNode: Node) = this()
  
  /**
    * The element's own component instance, if it has one.
    */
  def componentInstance: Any = js.native
  
  /**
    * An object that provides parent context for this element. Often an ancestor component instance
    * that governs this element.
    *
    * When an element is repeated within *ngFor, the context is an `NgForOf` whose `$implicit`
    * property is the value of the row instance value. For example, the `hero` in `*ngFor="let hero
    * of heroes"`.
    */
  def context: Any = js.native
  
  /**
    * The host dependency injector. For example, the root element's component instance injector.
    */
  def injector: Injector = js.native
  
  /**
    * The callbacks attached to the component's @Output properties and/or the element's event
    * properties.
    */
  def listeners: js.Array[DebugEventListener] = js.native
  
  /**
    * The underlying DOM node.
    */
  val nativeNode: Any = js.native
  
  /**
    * The `DebugElement` parent. Will be `null` if this is the root element.
    */
  def parent: DebugElement | Null = js.native
  
  /**
    * This component's injector lookup tokens. Includes the component itself plus the tokens that the
    * component lists in its providers metadata.
    */
  def providerTokens: js.Array[Any] = js.native
  
  /**
    * Dictionary of objects associated with template local variables (e.g. #foo), keyed by the local
    * variable name.
    */
  def references: StringDictionary[Any] = js.native
}
