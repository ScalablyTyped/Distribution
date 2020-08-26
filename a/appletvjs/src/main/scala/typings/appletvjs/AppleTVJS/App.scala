package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    * The onError attribute is used to handle any errors sent from the device.
    * This attribute must be set to a function that accepts an “options” argument.
    * For example App.onError = function (options) {}.
    * */
  def onError(options: js.Any): Unit = js.native
  /**
    * The onExit attribute is used to complete any actions that need to be cleaned
    * up when the app has been exited. This attribute must be set to a function that
    * accepts an “options” argument. For example App.onExit = function (options) {}.
    * */
  def onExit(options: js.Any): Unit = js.native
  /**
    * The onLaunch attribute is used to start any required actions when the app
    * launches. This attribute must be set to a function that accepts an “options”
    * argument. For example App.onLaunch = function (options) {}.
    * */
  def onLaunch(options: js.Any): Unit = js.native
  /**
    * This function reloads the initial JavaScript file without quitting the app.
    * The optional reloadData parameter provides developers with a way to capture
    * and restart the app in it’s current state. If the reloadData parameter is not
    * present, the app is restarted in its initial state. This attribute must be set
    * to a function that accepts an “options” argument.
    * For example App.onError = function (options) {}.
    * */
  def reload(): Unit = js.native
  def reload(options: js.UndefOr[scala.Nothing], reloadData: js.Any): Unit = js.native
  def reload(options: js.Any): Unit = js.native
  def reload(options: js.Any, reloadData: js.Any): Unit = js.native
}

