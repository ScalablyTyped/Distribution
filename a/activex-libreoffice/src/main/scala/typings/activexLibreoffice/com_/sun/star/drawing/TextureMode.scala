package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The TextureMode defines in which way the texture color data replaces the object color data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait TextureMode extends StObject
object TextureMode {
  
  /** This mixes both data sources in a fixed ratio. */
  inline def BLEND: `2` = 2.asInstanceOf[`2`]
  
  /** This mixes up colors in a way defined by the texture bitmap. */
  inline def MODULATE: `1` = 1.asInstanceOf[`1`]
  
  /** This is the standard mode. */
  inline def REPLACE: `0` = 0.asInstanceOf[`0`]
}
