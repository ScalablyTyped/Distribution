package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing the options that initialize a marker annotation.
  */
trait MarkerAnnotationConstructorOptions
  extends StObject
     with AnnotationConstructorOptions {
  
  /**
    * The background color of the balloon.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The fill color of the glyph.
    */
  var glyphColor: js.UndefOr[String] = js.undefined
  
  /**
    * The image to display in the marker balloon.
    */
  var glyphImage: js.UndefOr[`1`] = js.undefined
  
  /**
    * The text to display in the marker balloon.
    */
  var glyphText: js.UndefOr[String] = js.undefined
  
  /**
    * The image to display in the balloon when the marker is selected.
    */
  var selectedGlyphImage: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A value that determines the behavior of the subtitle's visibility.
    */
  var subtitleVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * A value that determines the behavior of the title's visibility.
    */
  var titleVisibility: js.UndefOr[String] = js.undefined
}
object MarkerAnnotationConstructorOptions {
  
  @scala.inline
  def apply(): MarkerAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerAnnotationConstructorOptions]
  }
  
  @scala.inline
  implicit class MarkerAnnotationConstructorOptionsMutableBuilder[Self <: MarkerAnnotationConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
    
    @scala.inline
    def setGlyphImage(value: `1`): Self = StObject.set(x, "glyphImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphImageUndefined: Self = StObject.set(x, "glyphImage", js.undefined)
    
    @scala.inline
    def setGlyphText(value: String): Self = StObject.set(x, "glyphText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphTextUndefined: Self = StObject.set(x, "glyphText", js.undefined)
    
    @scala.inline
    def setSelectedGlyphImage(value: js.Object): Self = StObject.set(x, "selectedGlyphImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedGlyphImageUndefined: Self = StObject.set(x, "selectedGlyphImage", js.undefined)
    
    @scala.inline
    def setSubtitleVisibility(value: String): Self = StObject.set(x, "subtitleVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleVisibilityUndefined: Self = StObject.set(x, "subtitleVisibility", js.undefined)
    
    @scala.inline
    def setTitleVisibility(value: String): Self = StObject.set(x, "titleVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleVisibilityUndefined: Self = StObject.set(x, "titleVisibility", js.undefined)
  }
}
