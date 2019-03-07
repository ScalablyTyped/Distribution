package typings
package ansiDashEscapesLib.ansiDashEscapesMod.AnsiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnsiEscapes extends js.Object {
  var beep: java.lang.String = js.native
  var clearScreen: java.lang.String = js.native
  var cursorGetPosition: java.lang.String = js.native
  var cursorHide: java.lang.String = js.native
  var cursorLeft: java.lang.String = js.native
  var cursorNextLine: java.lang.String = js.native
  var cursorPrevLine: java.lang.String = js.native
  var cursorRestorePosition: java.lang.String = js.native
  var cursorSavePosition: java.lang.String = js.native
  var cursorShow: java.lang.String = js.native
  var eraseDown: java.lang.String = js.native
  var eraseEndLine: java.lang.String = js.native
  var eraseLine: java.lang.String = js.native
  var eraseScreen: java.lang.String = js.native
  var eraseStartLine: java.lang.String = js.native
  var eraseUp: java.lang.String = js.native
  var iTerm: Term = js.native
  var scrollDown: java.lang.String = js.native
  var scrollUp: java.lang.String = js.native
  def cursorBackward(): java.lang.String = js.native
  def cursorBackward(count: scala.Double): java.lang.String = js.native
  def cursorDown(): java.lang.String = js.native
  def cursorDown(count: scala.Double): java.lang.String = js.native
  def cursorForward(): java.lang.String = js.native
  def cursorForward(count: scala.Double): java.lang.String = js.native
  def cursorMove(x: scala.Double): java.lang.String = js.native
  def cursorMove(x: scala.Double, y: scala.Double): java.lang.String = js.native
  def cursorTo(x: scala.Double): java.lang.String = js.native
  def cursorTo(x: scala.Double, y: scala.Double): java.lang.String = js.native
  def cursorUp(): java.lang.String = js.native
  def cursorUp(count: scala.Double): java.lang.String = js.native
  def eraseLines(count: scala.Double): java.lang.String = js.native
  def image(buf: nodeLib.Buffer): java.lang.String = js.native
  def image(buf: nodeLib.Buffer, opts: ImageOptions): java.lang.String = js.native
  def link(text: java.lang.String, url: java.lang.String): java.lang.String = js.native
}

