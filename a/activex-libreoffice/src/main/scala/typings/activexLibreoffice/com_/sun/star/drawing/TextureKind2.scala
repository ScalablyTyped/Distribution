package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These enumeration values specify how the texture is applied. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait TextureKind2 extends StObject
object TextureKind2 {
  
  /**
    * With this mode the lighting is ignored and only the texture color information is used.
    *
    * With this mode, the lighting is ignored and only the texture color information is used.
    */
  @scala.inline
  def COLOR: `2` = 2.asInstanceOf[`2`]
  
  /** With TextureKind INTENSITY, each texture pixel is used as an intensity value. */
  @scala.inline
  def INTENSITY: `1` = 1.asInstanceOf[`1`]
  
  /** With TextureKind LUMINANCE, the texture and the lighting information are mixed to produce the image, so a lit, textured object is achieved. */
  @scala.inline
  def LUMINANCE: `0` = 0.asInstanceOf[`0`]
}
