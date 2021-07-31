package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this service is supported from all shapes inside a {@link PresentationDocument} .
  *
  * This usually enhances objects of type {@link com.sun.star.drawing.Shape} with presentation properties.
  */
trait Shape extends StObject {
  
  /** is a generic URL for the property OnClick. */
  var Bookmark: String
  
  /**
    * This is the color for dimming this shape.
    *
    * This color is used if the property com::sun::star::drawing::Shape::DimPrev is `TRUE` and com::sun::star::drawing::Shape::DimHide is `FALSE` .
    */
  var DimColor: Color
  
  /** If this property and the property com::sun::star::drawing::Shape::DimPrev are both `TRUE` , the shape is hidden instead of dimmed to a color. */
  var DimHide: Boolean
  
  /**
    * If this property is `TRUE` , this shape is dimmed to the color of property com::sun::star::drawing::Shape::DimColor after executing its animation
    * effect.
    */
  var DimPrevious: Boolean
  
  /** selects the animation effect of this shape. */
  var Effect: AnimationEffect
  
  /** If this is a default presentation object and if it is empty, this property is `TRUE` . */
  var IsEmptyPresentationObject: Boolean
  
  /**
    * If this is a presentation object, this property is `TRUE` .
    *
    * {@link Presentation} objects are objects like {@link TitleTextShape} and {@link OutlinerShape} .
    */
  var IsPresentationObject: Boolean
  
  /** selects an action performed after the user clicks on this shape. */
  var OnClick: ClickAction
  
  /**
    * If this property is `TRUE` , the sound of this shape is played in full.
    *
    * The default behavior is to stop the sound after completing the animation effect.
    */
  var PlayFull: Boolean
  
  /**
    * This is the position of this shape in the order of the shapes which can be animated on its page.
    *
    * The animations are executed in this order, starting at the shape with the PresentationOrder "one." You can change the order by changing this number.
    * Setting it to "one" makes this shape the first shape in the execution order for the animation effects.
    */
  var PresentationOrder: Double
  
  /** This is the URL to a sound file that is played while the animation effect of this shape is running. */
  var Sound: String
  
  /** If this property is set to `TRUE` , a sound is played while the animation effect is executed. */
  var SoundOn: Boolean
  
  /** This is the speed of the animation effect. */
  var Speed: AnimationSpeed
  
  /** This is the animation effect for the text inside this shape. */
  var TextEffect: AnimationEffect
  
  /** specifies an "OLE2" verb for the ClickAction VERB in the property com::sun::star::drawing::Shape::OnClick. */
  var Verb: Double
}
object Shape {
  
  @scala.inline
  def apply(
    Bookmark: String,
    DimColor: Color,
    DimHide: Boolean,
    DimPrevious: Boolean,
    Effect: AnimationEffect,
    IsEmptyPresentationObject: Boolean,
    IsPresentationObject: Boolean,
    OnClick: ClickAction,
    PlayFull: Boolean,
    PresentationOrder: Double,
    Sound: String,
    SoundOn: Boolean,
    Speed: AnimationSpeed,
    TextEffect: AnimationEffect,
    Verb: Double
  ): Shape = {
    val __obj = js.Dynamic.literal(Bookmark = Bookmark.asInstanceOf[js.Any], DimColor = DimColor.asInstanceOf[js.Any], DimHide = DimHide.asInstanceOf[js.Any], DimPrevious = DimPrevious.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], IsEmptyPresentationObject = IsEmptyPresentationObject.asInstanceOf[js.Any], IsPresentationObject = IsPresentationObject.asInstanceOf[js.Any], OnClick = OnClick.asInstanceOf[js.Any], PlayFull = PlayFull.asInstanceOf[js.Any], PresentationOrder = PresentationOrder.asInstanceOf[js.Any], Sound = Sound.asInstanceOf[js.Any], SoundOn = SoundOn.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any], TextEffect = TextEffect.asInstanceOf[js.Any], Verb = Verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "Bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimColor(value: Color): Self = StObject.set(x, "DimColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimHide(value: Boolean): Self = StObject.set(x, "DimHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimPrevious(value: Boolean): Self = StObject.set(x, "DimPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: AnimationEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmptyPresentationObject(value: Boolean): Self = StObject.set(x, "IsEmptyPresentationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPresentationObject(value: Boolean): Self = StObject.set(x, "IsPresentationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: ClickAction): Self = StObject.set(x, "OnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayFull(value: Boolean): Self = StObject.set(x, "PlayFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationOrder(value: Double): Self = StObject.set(x, "PresentationOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundOn(value: Boolean): Self = StObject.set(x, "SoundOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: AnimationSpeed): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEffect(value: AnimationEffect): Self = StObject.set(x, "TextEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: Double): Self = StObject.set(x, "Verb", value.asInstanceOf[js.Any])
  }
}
