package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this service is supported from all shapes inside a {@link PresentationDocument} .
  *
  * This usually enhances objects of type {@link com.sun.star.drawing.Shape} with presentation properties.
  */
trait Shape extends js.Object {
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
}

