package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a marker annotation at the coordinate location with provided options.
  */
@js.native
trait MarkerAnnotation extends Annotation {
  
  /**
    * The background color of the balloon.
    */
  var color: String = js.native
  
  /**
    * The fill color of the glyph.
    */
  var glyphColor: String = js.native
  
  /**
    * The image to display in the marker balloon.
    */
  var glyphImage: js.Object | Null = js.native
  
  /**
    * The text to display in the marker balloon.
    */
  var glyphText: String = js.native
  
  /**
    * The image to display in the balloon when the marker is selected.
    */
  var selectedGlyphImage: js.Object = js.native
  
  /**
    * A value that determines the behavior of the subtitle's visibility.
    */
  var subtitleVisibility: String = js.native
  
  /**
    * A value that determines the behavior of the title's visibility.
    */
  var titleVisibility: String = js.native
}
