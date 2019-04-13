package typings
package aosLib.aosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aos extends js.Object {
  /**
    * Initializing AOS
    * - Create options merging defaults with user defined options
    * - Set attributes on <body> as global setting - css relies on it
    * - Attach preparing elements to options.startEvent,
    *   window resize and orientation change
    * - Attach function that handle scroll and everything connected to it
    *   to window scroll event and fire once document is ready to set initial state
    *  @param options options
    */
  def init(): scala.Unit = js.native
  def init(options: AosOptions): scala.Unit = js.native
  /**
    * Refresh AOS
    */
  def refresh(): scala.Unit = js.native
  /**
    * Hard refresh
    * create array with new elements and trigger refresh
    */
  def refreshHard(): scala.Unit = js.native
}

