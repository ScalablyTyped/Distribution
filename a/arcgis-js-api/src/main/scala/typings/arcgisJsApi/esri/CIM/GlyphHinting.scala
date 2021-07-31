package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GlyphHinting extends StObject
@JSGlobal("__esri.CIM.GlyphHinting")
@js.native
object GlyphHinting extends StObject {
  
  /**
    * Default glyph hinting according to the font's settings.
    */
  @js.native
  sealed trait Default
    extends StObject
       with GlyphHinting
  
  /**
    * Force glyph hinting.
    */
  @js.native
  sealed trait Force
    extends StObject
       with GlyphHinting
  
  /**
    * No glyph hinting.
    */
  @js.native
  sealed trait None
    extends StObject
       with GlyphHinting
}
