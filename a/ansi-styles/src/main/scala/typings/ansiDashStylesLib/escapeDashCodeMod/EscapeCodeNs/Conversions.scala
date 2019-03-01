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
    ansi: js.Function1[scala.Double, java.lang.String],
    ansi256: js.Function1[scala.Double, java.lang.String],
    apple: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    cmyk: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, java.lang.String],
    gray: js.Function1[scala.Double, java.lang.String],
    hcg: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    hex: js.Function1[java.lang.String, java.lang.String],
    hsl: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    hsv: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    hwb: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    keyword: js.Function1[java.lang.String, java.lang.String],
    lab: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    lch: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    rgb: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String],
    xyz: js.Function3[scala.Double, scala.Double, scala.Double, java.lang.String]
  ): Conversions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi")(ansi)
    __obj.updateDynamic("ansi256")(ansi256)
    __obj.updateDynamic("apple")(apple)
    __obj.updateDynamic("cmyk")(cmyk)
    __obj.updateDynamic("gray")(gray)
    __obj.updateDynamic("hcg")(hcg)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("hsl")(hsl)
    __obj.updateDynamic("hsv")(hsv)
    __obj.updateDynamic("hwb")(hwb)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("lch")(lch)
    __obj.updateDynamic("rgb")(rgb)
    __obj.updateDynamic("xyz")(xyz)
    __obj.asInstanceOf[Conversions]
  }
}

