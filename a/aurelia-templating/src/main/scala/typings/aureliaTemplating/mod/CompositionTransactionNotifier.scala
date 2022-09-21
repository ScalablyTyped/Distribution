package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "CompositionTransactionNotifier")
@js.native
open class CompositionTransactionNotifier protected () extends StObject {
  def this(owner: Any) = this()
  
  /**
  	* Notifies the owning transaction that its work is done.
  	*/
  def done(): Unit = js.native
}
