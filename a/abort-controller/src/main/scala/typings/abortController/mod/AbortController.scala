package typings.abortController.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AbortController.
  * @see https://dom.spec.whatwg.org/#abortcontroller
  */
@JSImport("abort-controller/dist/abort-controller", "AbortController")
@js.native
/**
  * Initialize this controller.
  */
class AbortController () extends js.Object {
  
  /**
    * Abort and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit = js.native
  
  /**
    * Returns the `AbortSignal` object associated with this object.
    */
  val signal: typings.abortController.anon.AbortSignal = js.native
}
