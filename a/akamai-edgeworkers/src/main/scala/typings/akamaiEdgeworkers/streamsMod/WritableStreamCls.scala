package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("streams", "WritableStream")
@js.native
class WritableStreamCls[W] ()
  extends StObject
     with WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}
