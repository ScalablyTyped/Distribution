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

object Conversions {
  @scala.inline
  def apply(
    ansi: scala.Double => java.lang.String,
    ansi256: scala.Double => java.lang.String,
    apple: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    cmyk: (scala.Double, scala.Double, scala.Double, scala.Double) => java.lang.String,
    gray: scala.Double => java.lang.String,
    hcg: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    hex: java.lang.String => java.lang.String,
    hsl: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    hsv: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    hwb: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    keyword: java.lang.String => java.lang.String,
    lab: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    lch: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    rgb: (scala.Double, scala.Double, scala.Double) => java.lang.String,
    xyz: (scala.Double, scala.Double, scala.Double) => java.lang.String
  ): Conversions = {
    val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction1(ansi), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction3(apple), cmyk = js.Any.fromFunction4(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction3(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction3(hsl), hsv = js.Any.fromFunction3(hsv), hwb = js.Any.fromFunction3(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction3(lab), lch = js.Any.fromFunction3(lch), rgb = js.Any.fromFunction3(rgb), xyz = js.Any.fromFunction3(xyz))
  
    __obj.asInstanceOf[Conversions]
  }
}

