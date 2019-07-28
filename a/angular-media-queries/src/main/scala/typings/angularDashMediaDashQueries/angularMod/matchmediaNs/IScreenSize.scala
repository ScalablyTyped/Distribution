package typings.angularDashMediaDashQueries.angularMod.matchmediaNs

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScreenSize extends js.Object {
  // Returns a value indicating if the current device has a retina screen
  var isRetina: Boolean = js.native
  def is(list: String): Boolean = js.native
  def is(list: js.Array[String]): Boolean = js.native
  def on(list: String, callback: js.Function1[/* result */ Boolean, Unit]): Boolean = js.native
  def on(list: String, callback: js.Function1[/* result */ Boolean, Unit], scope: IScope): Boolean = js.native
  // Executes the callback function on window resize with the match truthiness as the first argument.
  // Returns the current match truthiness.
  // The 'scope' parameter is optional. If it's not passed in, '$rootScope' is used.
  def on(list: js.Array[String], callback: js.Function1[/* result */ Boolean, Unit]): Boolean = js.native
  def on(list: js.Array[String], callback: js.Function1[/* result */ Boolean, Unit], scope: IScope): Boolean = js.native
  def onChange(scope: IScope, list: String, callback: js.Function1[/* result */ Boolean, Unit]): Boolean = js.native
  // Executes the callback function ONLY when the match differs from previous match.
  // Returns the current match truthiness.
  // The 'scope' parameter is required for cleanup reasons (destroy event).
  def onChange(scope: IScope, list: js.Array[String], callback: js.Function1[/* result */ Boolean, Unit]): Boolean = js.native
  def when(list: String, callback: js.Function1[/* result */ Boolean, Unit]): Boolean = js.native
  def when(list: String, callback: js.Function1[/* result */ Boolean, Unit], scope: IScope): Boolean = js.native
  // Executes the callback only when inside of the particular screensize.
  // The 'scope' parameter is optional. If it's not passed in, '$rootScope' is used.
  def when(list: js.Array[String], callback: js.Function1[/* result */ Boolean, Unit]): Boolean = js.native
  def when(list: js.Array[String], callback: js.Function1[/* result */ Boolean, Unit], scope: IScope): Boolean = js.native
}

