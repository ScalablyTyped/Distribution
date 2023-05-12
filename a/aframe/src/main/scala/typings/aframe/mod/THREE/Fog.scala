package typings.aframe.mod.THREE

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.Fog")
@js.native
open class Fog protected ()
  extends typings.three.mod.Fog {
  /**
    * The color parameter is passed to the {@link THREE.Color | Color} constructor to set the color property
    * @remarks
    * Color can be a hexadecimal integer or a CSS-style string.
    * @param color
    * @param near Expects a `Float`
    * @param far Expects a `Float`
    */
  def this(color: ColorRepresentation) = this()
}
