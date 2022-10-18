package typings.airtable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.std.AbortController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbortControllerMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("airtable/lib/abort-controller", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AbortController
  @JSImport("airtable/lib/abort-controller", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Instantiable0[AbortController] = js.native
  
  type _To = js.Object & Instantiable0[AbortController]
  
  /* This means you don't have to write `^`, but can instead just say `libAbortControllerMod.foo` */
  override def _to: js.Object & Instantiable0[AbortController] = ^
}
