package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expectation extends Stub {
  /**
    * Specifies the minimum amount of calls expected
    */
  def atLeast(n: scala.Double): Expectation = js.native
  /**
    * Specifies the maximum amount of calls expected
    */
  def atMost(n: scala.Double): Expectation = js.native
  /**
    * Expects the method to be called exactly n times
    */
  def exactly(n: scala.Double): Expectation = js.native
  /**
    * Expects the method to never be called
    */
  def never(): Expectation = js.native
  /**
    * Expects the method to be called with obj as this
    */
  def on(obj: js.Any): Expectation = js.native
  /**
    * Expects the method to be called exactly once
    */
  def once(): Expectation = js.native
  /**
    * Expects the method to be called exactly thrice
    */
  def thrice(): Expectation = js.native
  /**
    * Expects the method to be called exactly twice
    */
  def twice(): Expectation = js.native
  /**
    * Verifies the expectation and throws an exception if it’s not met
    */
  def verify(): Expectation = js.native
  /**
    * Expects the method to be called with the provided arguments and no others
    */
  def withExactArgs(args: js.Any*): Expectation = js.native
}

