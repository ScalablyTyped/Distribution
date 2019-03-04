package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XShape extends XReportControlModel {
  /** This property can be used to store data that the CustomShapeEngine may use for rendering */
  var CustomShapeData: java.lang.String
  /** This property contains the CustomShapeEngine service name that has to be used for rendering. */
  var CustomShapeEngine: java.lang.String
  /**
    * This property describes the geometry of the CustomShape. The CustomShapeEngine that is used should be able to get on with the content of this
    * property.
    *
    * If the CustomShapeEngine property is "com.sun.star.drawing.EnhancedCustomShapeEngine", then this property is containing properties as they are
    * specified in the service {@link com.sun.star.drawing.EnhancedCustomShapeGeometry}
    */
  var CustomShapeGeometry: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** determines if the object is opaque or transparent for text. */
  var Opaque: scala.Boolean
  /**
    * this property lets you get and set the transformation matrix for this shape.
    *
    * The transformation is a 3x3 homogeneous matrix and can contain translation, rotation, shearing and scaling.
    */
  var Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3
  /** is used to query or change the ZOrder of this {@link Shape} . */
  var ZOrder: scala.Double
}

object XShape {
  @scala.inline
  def apply(
    CharAutoKerning: scala.Boolean,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontCharSetAsian: scala.Double,
    CharFontCharSetComplex: scala.Double,
    CharFontFamily: scala.Double,
    CharFontFamilyAsian: scala.Double,
    CharFontFamilyComplex: scala.Double,
    CharFontName: java.lang.String,
    CharFontNameAsian: java.lang.String,
    CharFontNameComplex: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontPitchAsian: scala.Double,
    CharFontPitchComplex: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontStyleNameAsian: java.lang.String,
    CharFontStyleNameComplex: java.lang.String,
    CharHeight: scala.Double,
    CharHeightAsian: scala.Double,
    CharHeightComplex: scala.Double,
    CharHidden: scala.Boolean,
    CharKerning: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharRelief: scala.Double,
    CharRotation: scala.Double,
    CharScaleWidth: scala.Double,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharWeight: scala.Double,
    CharWeightAsian: scala.Double,
    CharWeightComplex: scala.Double,
    CharWordMode: scala.Boolean,
    ConditionalPrintExpression: java.lang.String,
    ControlBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ControlBackgroundTransparent: scala.Boolean,
    ControlBorder: scala.Double,
    ControlBorderColor: scala.Double,
    ControlTextEmphasis: scala.Double,
    Count: scala.Double,
    CustomShapeData: java.lang.String,
    CustomShapeEngine: java.lang.String,
    CustomShapeGeometry: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    DataField: java.lang.String,
    DetailFields: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    Height: scala.Double,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    MasterFields: activexDashInteropLib.SafeArray[java.lang.String],
    Name: java.lang.String,
    Opaque: scala.Boolean,
    ParaAdjust: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionX: scala.Double,
    PositionY: scala.Double,
    PrintRepeatedValues: scala.Boolean,
    PrintWhenGroupChange: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Section: XSection,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    UnvisitedCharStyleName: java.lang.String,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    VisitedCharStyleName: java.lang.String,
    Width: scala.Double,
    ZOrder: scala.Double,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    createFormatCondition: js.Function0[XFormatCondition],
    dispose: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XShape = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharKerning = CharKerning, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRotation = CharRotation, CharScaleWidth = CharScaleWidth, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, ConditionalPrintExpression = ConditionalPrintExpression, ControlBackground = ControlBackground, ControlBackgroundTransparent = ControlBackgroundTransparent, ControlBorder = ControlBorder, ControlBorderColor = ControlBorderColor, ControlTextEmphasis = ControlTextEmphasis, Count = Count, CustomShapeData = CustomShapeData, CustomShapeEngine = CustomShapeEngine, CustomShapeGeometry = CustomShapeGeometry, DataField = DataField, DetailFields = DetailFields, ElementType = ElementType, FontDescriptor = FontDescriptor, FontDescriptorAsian = FontDescriptorAsian, FontDescriptorComplex = FontDescriptorComplex, Height = Height, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, MasterFields = MasterFields, Name = Name, Opaque = Opaque, ParaAdjust = ParaAdjust, Parent = Parent, Position = Position, PositionX = PositionX, PositionY = PositionY, PrintRepeatedValues = PrintRepeatedValues, PrintWhenGroupChange = PrintWhenGroupChange, PropertySetInfo = PropertySetInfo, Section = Section, ShapeType = ShapeType, Size = Size, Transformation = Transformation, UnvisitedCharStyleName = UnvisitedCharStyleName, VerticalAlign = VerticalAlign, VisitedCharStyleName = VisitedCharStyleName, Width = Width, ZOrder = ZOrder, acquire = acquire, addContainerListener = addContainerListener, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, createFormatCondition = createFormatCondition, dispose = dispose, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getParent = getParent, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getShapeType = getShapeType, getSize = getSize, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, removeContainerListener = removeContainerListener, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, replaceByIndex = replaceByIndex, setParent = setParent, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize)
  
    __obj.asInstanceOf[XShape]
  }
}

