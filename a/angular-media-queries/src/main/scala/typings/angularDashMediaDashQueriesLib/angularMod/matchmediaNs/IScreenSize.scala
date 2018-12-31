package typings
package angularDashMediaDashQueriesLib.angularMod.matchmediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScreenSize extends js.Object {
  // Returns a value indicating if the current device has a retina screen
  var isRetina: scala.Boolean = js.native
  def is(list: java.lang.String): scala.Boolean = js.native
  def is(list: js.Array[java.lang.String]): scala.Boolean = js.native
  def on(list: java.lang.String, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Boolean = js.native
  def on(
    list: java.lang.String,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    scope: angularLib.angularMod.angularNs.IScope
  ): scala.Boolean = js.native
  // Executes the callback function on window resize with the match truthiness as the first argument.
  // Returns the current match truthiness.
  // The 'scope' parameter is optional. If it's not passed in, '$rootScope' is used.
  def on(list: js.Array[java.lang.String], callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Boolean = js.native
  def on(
    list: js.Array[java.lang.String],
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    scope: angularLib.angularMod.angularNs.IScope
  ): scala.Boolean = js.native
  def onChange(
    scope: angularLib.angularMod.angularNs.IScope,
    list: java.lang.String,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Boolean = js.native
  // Executes the callback function ONLY when the match differs from previous match.
  // Returns the current match truthiness.
  // The 'scope' parameter is required for cleanup reasons (destroy event).
  def onChange(
    scope: angularLib.angularMod.angularNs.IScope,
    list: js.Array[java.lang.String],
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Boolean = js.native
  def when(list: java.lang.String, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Boolean = js.native
  def when(
    list: java.lang.String,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    scope: angularLib.angularMod.angularNs.IScope
  ): scala.Boolean = js.native
  // Executes the callback only when inside of the particular screensize.
  // The 'scope' parameter is optional. If it's not passed in, '$rootScope' is used.
  def when(list: js.Array[java.lang.String], callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Boolean = js.native
  def when(
    list: js.Array[java.lang.String],
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    scope: angularLib.angularMod.angularNs.IScope
  ): scala.Boolean = js.native
}

