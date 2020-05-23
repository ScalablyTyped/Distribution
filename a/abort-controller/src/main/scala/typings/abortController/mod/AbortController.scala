package typings.abortController.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Returns the `AbortSignal` object associated with this object.
    */
  val signal: typings.abortController.anon.AbortSignal = js.native
  /**
    * Abort and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit = js.native
}

