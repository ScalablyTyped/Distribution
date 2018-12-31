package typings
package adoneLib.adoneNs.assertionNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAssertions extends Assertion {
  /**
    * Asserts that the spy has been called n times
    */
  def callCount(n: scala.Double): this.type = js.native
  /**
    * Asserts that the spy has been called
    */
  def called(): this.type = js.native
  /**
    * Asserts that the spy has been called after anotherSpy
    */
  def calledAfter(anotherSpy: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): this.type = js.native
  /**
    * Asserts that the spy has been called before anotherSpy
    */
  def calledBefore(anotherSpy: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): this.type = js.native
  /**
    * Asserts that the spy has been called immediately after anotherSpy
    */
  def calledImmediatelyAfter(anotherSpy: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): this.type = js.native
  /**
    * Asserts that the spy has been called immediately before anotherSpy
    */
  def calledImmediatelyBefore(anotherSpy: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): this.type = js.native
  /**
    * Asserts that the spy has been called with context as this value
    */
  def calledOn(context: js.Object): this.type = js.native
  /**
    * Asserts that the spy has been called once
    */
  def calledOnce(): this.type = js.native
  /**
    * Asserts that the spy has been been called with `new`
    */
  def calledThrice(): this.type = js.native
  /**
    * Asserts that the spy has been called twice
    */
  def calledTwice(): this.type = js.native
  /**
    * Asserts that the spy has been called with the given arguments
    */
  def calledWith(args: js.Any*): this.type = js.native
  /**
    * Asserts that the spy has been called exactly with the given arguments
    */
  def calledWithExactly(args: js.Any*): this.type = js.native
  /**
    * Asserts that the spy has been called with matching arguments
    */
  def calledWithMatch(args: js.Any*): this.type = js.native
  /**
    * Asserts that the spy returned value
    */
  def returned(value: js.Any): this.type = js.native
  /**
    * Asserts that the spy threw error
    */
  def threw(error: js.Any): this.type = js.native
  /**
    * Asserts that the spy threw error
    */
  def thrown(error: js.Any): this.type = js.native
}

