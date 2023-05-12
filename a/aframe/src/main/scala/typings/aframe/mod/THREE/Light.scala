package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.Light")
@js.native
/**
  * Creates a new {@link Light}
  * @remarks
  * **Note** that this is not intended to be called directly (use one of derived classes instead).
  * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
  * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
  */
open class Light[TShadowSupport /* <: js.UndefOr[
typings.three.srcLightsLightShadowMod.LightShadow[typings.three.srcCamerasCameraMod.Camera]] */] ()
  extends typings.three.mod.Light[TShadowSupport]
