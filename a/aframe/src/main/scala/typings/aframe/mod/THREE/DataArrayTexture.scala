package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.DataArrayTexture")
@js.native
/**
  * This creates a new {@link THREE.DataArrayTexture | DataArrayTexture} object.
  * @remarks The interpretation of the data depends on {@link format} and {@link type}.
  * @remarks If the {@link type} is {@link THREE.UnsignedByteType}, a {@link Uint8Array} will be useful for addressing the texel data
  * @remarks If the {@link format} is {@link THREE.RGBAFormat}, data needs four values for one texel; Red, Green, Blue and Alpha (typically the opacity).
  * @remarks For the packed {@link type | types}, {@link THREE.UnsignedShort4444Type} and {@link THREE.UnsignedShort5551Type}
  * all color components of one texel can be addressed as bitfields within an integer element of a {@link Uint16Array}.
  * @remarks In order to use the {@link type | types} {@link THREE.FloatType} and {@link THREE.HalfFloatType},
  * the WebGL implementation must support the respective extensions _OES_texture_float_ and _OES_texture_half_float_
  * @remarks In order to use {@link THREE.LinearFilter} for component-wise, bilinear interpolation of the texels based on these types,
  * the WebGL extensions _OES_texture_float_linear_ or _OES_texture_half_float_linear_ must also be present.
  * @param data {@link https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView | ArrayBufferView} of the texture. Default `null`.
  * @param width Width of the texture. Default `1`.
  * @param height Height of the texture. Default `1`.
  * @param depth Depth of the texture. Default `1`.
  */
open class DataArrayTexture ()
  extends typings.three.mod.DataArrayTexture
