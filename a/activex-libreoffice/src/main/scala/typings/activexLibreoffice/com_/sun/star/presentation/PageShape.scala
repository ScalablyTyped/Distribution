package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix3
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.XStyle
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the page presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
@js.native
trait PageShape
  extends typings.activexLibreoffice.com_.sun.star.drawing.PageShape
     with Shape

object PageShape {
  @scala.inline
  def apply(
    Bookmark: String,
    DimColor: Color,
    DimHide: Boolean,
    DimPrevious: Boolean,
    Effect: AnimationEffect,
    GluePoints: XIndexContainer,
    Hyperlink: String,
    InteropGrabBag: SafeArray[PropertyValue],
    IsEmptyPresentationObject: Boolean,
    IsPresentationObject: Boolean,
    LayerID: Double,
    LayerName: String,
    MoveProtect: Boolean,
    Name: String,
    NavigationOrder: Double,
    OnClick: ClickAction,
    PageNumber: Double,
    PlayFull: Boolean,
    Position: Point,
    PresentationOrder: Double,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    Size: Size,
    SizeProtect: Boolean,
    Sound: String,
    SoundOn: Boolean,
    Speed: AnimationSpeed,
    Style: XStyle,
    TextEffect: AnimationEffect,
    Transformation: HomogenMatrix3,
    Verb: Double,
    Visible: Boolean,
    ZOrder: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getGluePoints: () => XIndexContainer,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Unit
  ): PageShape = {
    val __obj = js.Dynamic.literal(Bookmark = Bookmark.asInstanceOf[js.Any], DimColor = DimColor.asInstanceOf[js.Any], DimHide = DimHide.asInstanceOf[js.Any], DimPrevious = DimPrevious.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], IsEmptyPresentationObject = IsEmptyPresentationObject.asInstanceOf[js.Any], IsPresentationObject = IsPresentationObject.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], OnClick = OnClick.asInstanceOf[js.Any], PageNumber = PageNumber.asInstanceOf[js.Any], PlayFull = PlayFull.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PresentationOrder = PresentationOrder.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Sound = Sound.asInstanceOf[js.Any], SoundOn = SoundOn.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], TextEffect = TextEffect.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], Verb = Verb.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[PageShape]
  }
}

