package typings.ansiDashStyles.escapeDashCodeMod.EscapeCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversions extends js.Object {
  def ansi(ansi: Double): String
  def ansi256(ansi256: Double): String
  /**
    * apple RGB to ansi code
    */
  def apple(r: Double, g: Double, b: Double): String
  def cmyk(c: Double, m: Double, y: Double, k: Double): String
  def gray(grayscale: Double): String
  def hcg(h: Double, c: Double, g: Double): String
  def hex(hex: String): String
  def hsl(h: Double, s: Double, l: Double): String
  def hsv(h: Double, s: Double, v: Double): String
  def hwb(h: Double, w: Double, b: Double): String
  /**
    * color keyword in css to ansi code
    */
  def keyword(keyword: String): String
  def lab(l: Double, a: Double, b: Double): String
  def lch(l: Double, c: Double, h: Double): String
  def rgb(r: Double, g: Double, b: Double): String
  def xyz(x: Double, y: Double, z: Double): String
}

object Conversions {
  @scala.inline
  def apply(
    ansi: Double => String,
    ansi256: Double => String,
    apple: (Double, Double, Double) => String,
    cmyk: (Double, Double, Double, Double) => String,
    gray: Double => String,
    hcg: (Double, Double, Double) => String,
    hex: String => String,
    hsl: (Double, Double, Double) => String,
    hsv: (Double, Double, Double) => String,
    hwb: (Double, Double, Double) => String,
    keyword: String => String,
    lab: (Double, Double, Double) => String,
    lch: (Double, Double, Double) => String,
    rgb: (Double, Double, Double) => String,
    xyz: (Double, Double, Double) => String
  ): Conversions = {
    val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction1(ansi), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction3(apple), cmyk = js.Any.fromFunction4(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction3(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction3(hsl), hsv = js.Any.fromFunction3(hsv), hwb = js.Any.fromFunction3(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction3(lab), lch = js.Any.fromFunction3(lch), rgb = js.Any.fromFunction3(rgb), xyz = js.Any.fromFunction3(xyz))
  
    __obj.asInstanceOf[Conversions]
  }
}

