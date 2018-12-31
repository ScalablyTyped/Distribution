package typings
package ansiDashStylesLib.escapeDashCodeMod.EscapeCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversions extends js.Object {
  def ansi(ansi: scala.Double): java.lang.String
  def ansi256(ansi256: scala.Double): java.lang.String
  /**
    * apple RGB to ansi code
    */
  def apple(r: scala.Double, g: scala.Double, b: scala.Double): java.lang.String
  def cmyk(c: scala.Double, m: scala.Double, y: scala.Double, k: scala.Double): java.lang.String
  def gray(grayscale: scala.Double): java.lang.String
  def hcg(h: scala.Double, c: scala.Double, g: scala.Double): java.lang.String
  def hex(hex: java.lang.String): java.lang.String
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): java.lang.String
  def hsv(h: scala.Double, s: scala.Double, v: scala.Double): java.lang.String
  def hwb(h: scala.Double, w: scala.Double, b: scala.Double): java.lang.String
  /**
    * color keyword in css to ansi code
    */
  def keyword(keyword: java.lang.String): java.lang.String
  def lab(l: scala.Double, a: scala.Double, b: scala.Double): java.lang.String
  def lch(l: scala.Double, c: scala.Double, h: scala.Double): java.lang.String
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): java.lang.String
  def xyz(x: scala.Double, y: scala.Double, z: scala.Double): java.lang.String
}

