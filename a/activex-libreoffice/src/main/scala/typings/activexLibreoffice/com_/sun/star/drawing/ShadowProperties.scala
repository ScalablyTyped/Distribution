package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style for rendering a shadow. */
trait ShadowProperties extends StObject {
  
  /**
    * enables/disables the shadow of a {@link Shape} .
    *
    * The other shadow properties are only applied if this is set to `TRUE` .
    */
  var Shadow: Boolean
  
  /** This is the color of the shadow of this {@link Shape} . */
  var ShadowColor: Color
  
  /** This defines the degree of transparence of the shadow in percent. */
  var ShadowTransparence: Double
  
  /** This is the horizontal distance of the left edge of the {@link Shape} to the shadow. */
  var ShadowXDistance: Double
  
  /** This is the vertical distance of the top edge of the {@link Shape} to the shadow. */
  var ShadowYDistance: Double
}
object ShadowProperties {
  
  @scala.inline
  def apply(
    Shadow: Boolean,
    ShadowColor: Color,
    ShadowTransparence: Double,
    ShadowXDistance: Double,
    ShadowYDistance: Double
  ): ShadowProperties = {
    val __obj = js.Dynamic.literal(Shadow = Shadow.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShadowXDistance = ShadowXDistance.asInstanceOf[js.Any], ShadowYDistance = ShadowYDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowProperties]
  }
  
  @scala.inline
  implicit class ShadowPropertiesMutableBuilder[Self <: ShadowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: Color): Self = StObject.set(x, "ShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowTransparence(value: Double): Self = StObject.set(x, "ShadowTransparence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowXDistance(value: Double): Self = StObject.set(x, "ShadowXDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowYDistance(value: Double): Self = StObject.set(x, "ShadowYDistance", value.asInstanceOf[js.Any])
  }
}
