package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.EW.QueuingStrategy
import typings.akamaiEdgeworkers.EW.ReadableStreamEW
import typings.akamaiEdgeworkers.EW.UnderlyingSink
import typings.akamaiEdgeworkers.EW.UnderlyingSource
import typings.akamaiEdgeworkers.EW.WritableStreamEW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object EW {
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("EW.ReadableStreamEW")
    @js.native
    open class ReadableStreamEWCls[R] ()
      extends StObject
         with ReadableStreamEW[R] {
      def this(underlyingSource: UnderlyingSource[R]) = this()
      def this(underlyingSource: Unit, strategy: QueuingStrategy[R]) = this()
      def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("EW.WritableStreamEW")
    @js.native
    open class WritableStreamEWCls[W] ()
      extends StObject
         with WritableStreamEW[W] {
      def this(underlyingSink: UnderlyingSink[W]) = this()
      def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
      def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
    }
  }
}
