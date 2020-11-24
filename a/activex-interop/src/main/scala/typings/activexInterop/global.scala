package typings.activexInterop

import org.scalablytyped.runtime.TopLevel
import typings.activexInterop.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var ActiveXObject: typings.activexInterop.ActiveXObject = js.native
  
  @js.native
  class Enumerator[T] protected ()
    extends typings.activexInterop.Enumerator[T] {
    def this(collection: Item[T]) = this()
  }
  @js.native
  object Enumerator extends TopLevel[EnumeratorConstructor]
  
  /**
    * Represents an Automation SAFEARRAY
    */
  @js.native
  class SafeArray[T] protected ()
    extends typings.activexInterop.SafeArray[T]
  
  @js.native
  class VBArray[T] protected ()
    extends typings.activexInterop.VBArray[T] {
    def this(safeArray: typings.activexInterop.SafeArray[T]) = this()
  }
  @js.native
  object VBArray extends TopLevel[VBArrayConstructor]
  
  /** Automation date (VT_DATE) */
  @js.native
  class VarDate protected ()
    extends typings.activexInterop.VarDate
}
