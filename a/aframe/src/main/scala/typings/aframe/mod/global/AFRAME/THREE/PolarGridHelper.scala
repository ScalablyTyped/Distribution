package typings.aframe.mod.global.AFRAME.THREE

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.PolarGridHelper")
@js.native
open class PolarGridHelper protected ()
  extends typings.three.mod.PolarGridHelper {
  /**
    * Creates a new {@link PolarGridHelper} of radius 'radius' with 'sectors' number of sectors and 'rings' number of rings, where each circle is smoothed into 'divisions' number of line segments.
    * @remarks Colors are optional.
    * @param radius The radius of the polar grid. This can be any positive number. Default `10`.
    * @param sectors The number of sectors the grid will be divided into. This can be any positive integer. Default `16`.
    * @param rings The number of rings. This can be any positive integer. Default `8`.
    * @param divisions The number of line segments used for each circle. This can be any positive integer that is 3 or greater. Default `64`.
    * @param color1 The first color used for grid elements. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x444444`.
    * @param color2 The second color used for grid elements. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x888888`.
    */
  def this(
    radius: js.UndefOr[Double],
    radials: js.UndefOr[Double],
    circles: js.UndefOr[Double],
    divisions: js.UndefOr[Double],
    color1: js.UndefOr[ColorRepresentation],
    color2: js.UndefOr[ColorRepresentation]
  ) = this()
}
