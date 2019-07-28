package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XImageProducer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XImageProducerSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.VerticalAlignment
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XImageControl
  extends XReportControlModel
     with XImageProducerSupplier {
  /** specifies an URL to an image to use for the control. */
  var ImageURL: String
  /**
    * Specifies that the IRI given in the data field should be preserved, otherwise the content will be inserted in the resulting report document. If the
    * data field contains something different as string then this attribute will be ignored.
    */
  var PreserveIRI: Boolean
  /**
    * defines how to scale the image
    *
    * If this property is present, it supersedes the ScaleImage property.
    *
    * The value of this property is one of the {@link com.sun.star.awt.ImageScaleMode} constants.
    * @since OOo 3.2
    */
  var ScaleMode: Double
}

object XImageControl {
  @scala.inline
  def apply(
    CharAutoKerning: Boolean,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharKerning: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRotation: Double,
    CharScaleWidth: Double,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    ConditionalPrintExpression: String,
    ControlBackground: Color,
    ControlBackgroundTransparent: Boolean,
    ControlBorder: Double,
    ControlBorderColor: Double,
    ControlTextEmphasis: Double,
    Count: Double,
    DataField: String,
    DetailFields: SafeArray[String],
    ElementType: `type`,
    FontDescriptor: FontDescriptor,
    FontDescriptorAsian: FontDescriptor,
    FontDescriptorComplex: FontDescriptor,
    Height: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    ImageProducer: XImageProducer,
    ImageURL: String,
    MasterFields: SafeArray[String],
    Name: String,
    ParaAdjust: Double,
    Parent: XInterface,
    Position: Point,
    PositionX: Double,
    PositionY: Double,
    PreserveIRI: Boolean,
    PrintRepeatedValues: Boolean,
    PrintWhenGroupChange: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ScaleMode: Double,
    Section: XSection,
    ShapeType: String,
    Size: Size,
    UnvisitedCharStyleName: String,
    VerticalAlign: VerticalAlignment,
    VisitedCharStyleName: String,
    Width: Double,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    createFormatCondition: () => XFormatCondition,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getImageProducer: () => XImageProducer,
    getParent: () => XInterface,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setParent: XInterface => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): XImageControl = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharKerning = CharKerning, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRotation = CharRotation, CharScaleWidth = CharScaleWidth, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, ConditionalPrintExpression = ConditionalPrintExpression, ControlBackground = ControlBackground, ControlBackgroundTransparent = ControlBackgroundTransparent, ControlBorder = ControlBorder, ControlBorderColor = ControlBorderColor, ControlTextEmphasis = ControlTextEmphasis, Count = Count, DataField = DataField, DetailFields = DetailFields, ElementType = ElementType, FontDescriptor = FontDescriptor, FontDescriptorAsian = FontDescriptorAsian, FontDescriptorComplex = FontDescriptorComplex, Height = Height, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, ImageProducer = ImageProducer, ImageURL = ImageURL, MasterFields = MasterFields, Name = Name, ParaAdjust = ParaAdjust, Parent = Parent, Position = Position, PositionX = PositionX, PositionY = PositionY, PreserveIRI = PreserveIRI, PrintRepeatedValues = PrintRepeatedValues, PrintWhenGroupChange = PrintWhenGroupChange, PropertySetInfo = PropertySetInfo, ScaleMode = ScaleMode, Section = Section, ShapeType = ShapeType, Size = Size, UnvisitedCharStyleName = UnvisitedCharStyleName, VerticalAlign = VerticalAlign, VisitedCharStyleName = VisitedCharStyleName, Width = Width, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), createFormatCondition = js.Any.fromFunction0(createFormatCondition), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getImageProducer = js.Any.fromFunction0(getImageProducer), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setParent = js.Any.fromFunction1(setParent), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[XImageControl]
  }
}

