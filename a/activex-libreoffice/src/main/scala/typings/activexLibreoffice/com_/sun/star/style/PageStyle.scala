package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.text.XTextColumns
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contributes common properties of page styles.
  * @see com.sun.star.text.TextPageStyle
  * @see com.sun.star.sheet.TablePageStyle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.style.PageProperties because var conflicts: UserDefinedAttributes. Inlined BackColor, BackGraphicFilter, BackGraphicLocation, BackGraphicURL, BackTransparent, BorderDistance, BottomBorder, BottomBorderDistance, BottomMargin, FirstIsShared, FooterBackColor, FooterBackGraphicFilter, FooterBackGraphicLocation, FooterBackGraphicURL, FooterBackTransparent, FooterBodyDistance, FooterBorderDistance, FooterBottomBorder, FooterBottomBorderDistance, FooterDynamicSpacing, FooterHeight, FooterIsDynamicHeight, FooterIsOn, FooterIsShared, FooterLeftBorder, FooterLeftBorderDistance, FooterLeftMargin, FooterRightBorder, FooterRightBorderDistance, FooterRightMargin, FooterShadowFormat, FooterText, FooterTextLeft, FooterTextRight, FooterTopBorder, FooterTopBorderDistance, FootnoteHeight, FootnoteLineAdjust, FootnoteLineColor, FootnoteLineDistance, FootnoteLineRelativeWidth, FootnoteLineStyle, FootnoteLineTextDistance, FootnoteLineWeight, GridBaseHeight, GridColor, GridDisplay, GridLines, GridMode, GridPrint, GridRubyBelow, GridRubyHeight, HeaderBackColor, HeaderBackGraphicFilter, HeaderBackGraphicLocation, HeaderBackGraphicURL, HeaderBackTransparent, HeaderBodyDistance, HeaderBorderDistance, HeaderBottomBorder, HeaderBottomBorderDistance, HeaderDynamicSpacing, HeaderHeight, HeaderIsDynamicHeight, HeaderIsOn, HeaderIsShared, HeaderLeftBorder, HeaderLeftBorderDistance, HeaderLeftMargin, HeaderRightBorder, HeaderRightBorderDistance, HeaderRightMargin, HeaderShadowFormat, HeaderText, HeaderTextLeft, HeaderTextRight, HeaderTopBorder, HeaderTopBorderDistance, Height, IsLandscape, LeftBorder, LeftBorderDistance, LeftMargin, NumberingType, PageStyleLayout, PrinterPaperTray, RegisterModeActive, RegisterParagraphStyle, RightBorder, RightBorderDistance, RightMargin, ShadowFormat, Size, TextColumns, TopBorder, TopBorderDistance, TopMargin, Width, WritingMode */ @js.native
trait PageStyle extends Style {
  
  /** contains the background color of the page. */
  var BackColor: Color = js.native
  
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: String = js.native
  
  /** determines the location of the background graphic. */
  var BackGraphicLocation: GraphicLocation = js.native
  
  /** contains the URL of the background graphic. */
  var BackGraphicURL: String = js.native
  
  /**
    * determines if the background color is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.BackColor} will not be used.
    */
  var BackTransparent: Boolean = js.native
  
  /** determines the distance of all borders of the page. */
  var BorderDistance: Double = js.native
  
  /** determines the style of the bottom border line of the page. */
  var BottomBorder: BorderLine = js.native
  
  /** determines the bottom border distance of the page. */
  var BottomBorderDistance: Double = js.native
  
  /** determines the bottom margin of the page. */
  var BottomMargin: Double = js.native
  
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: Boolean = js.native
  
  /** contains the color of the background of the footer. */
  var FooterBackColor: Color = js.native
  
  /** contains the filter name of the background graphic in the footer. */
  var FooterBackGraphicFilter: String = js.native
  
  /** determines the location of the background graphic in the footer. */
  var FooterBackGraphicLocation: GraphicLocation = js.native
  
  /** contains the URL of the background graphic in the footer. */
  var FooterBackGraphicURL: String = js.native
  
  /** determines if the background of the footer is transparent. */
  var FooterBackTransparent: Boolean = js.native
  
  /** determines the distance between the footer and the body text area. */
  var FooterBodyDistance: Double = js.native
  
  /** contains the distance of all borders of the footer. */
  var FooterBorderDistance: Double = js.native
  
  /** contains the style of the bottom border line of the footer. */
  var FooterBottomBorder: BorderLine = js.native
  
  /** contains the bottom border distance of the footer. */
  var FooterBottomBorderDistance: Double = js.native
  
  /** determines whether to use dynamic spacing in footer or not. */
  var FooterDynamicSpacing: Boolean = js.native
  
  /** determines the height of the footer. */
  var FooterHeight: Double = js.native
  
  /** determines if the height of the footer depends on the content. */
  var FooterIsDynamicHeight: Boolean = js.native
  
  /** determines if a footer is used on the page. */
  var FooterIsOn: Boolean = js.native
  
  /** determines if the footer content on left and right pages is the same. */
  var FooterIsShared: Boolean = js.native
  
  /** contains the style of the left border line of the footer. */
  var FooterLeftBorder: BorderLine = js.native
  
  /** contains the left border distance of the footer. */
  var FooterLeftBorderDistance: Double = js.native
  
  /** determines the left margin of the footer. */
  var FooterLeftMargin: Double = js.native
  
  /** contains the style of the right border line of the footer. */
  var FooterRightBorder: BorderLine = js.native
  
  /** contains the right border distance of the footer. */
  var FooterRightBorderDistance: Double = js.native
  
  /** determines the right margin of the footer. */
  var FooterRightMargin: Double = js.native
  
  /** determines the shadow of the footer. */
  var FooterShadowFormat: ShadowFormat = js.native
  
  /** contains the interface to the text of the footer. */
  var FooterText: XText = js.native
  
  /** contains the interface to the text of the footer of a left page. */
  var FooterTextLeft: XText = js.native
  
  /** contains the interface to the text of the footer of a right page.contains . */
  var FooterTextRight: XText = js.native
  
  /** contains the style of the top border line of the footer. */
  var FooterTopBorder: BorderLine = js.native
  
  /** contains the top border distance of the footer. */
  var FooterTopBorderDistance: Double = js.native
  
  /** contains the maximum height of the footnote area. If set to zero then the height of the current page is used as limit. */
  var FootnoteHeight: Double = js.native
  
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    *
    * com::sun::star::text::HorizontalAdjusts.
    */
  var FootnoteLineAdjust: Double = js.native
  
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color = js.native
  
  /** contains the distance between the footnote area and the separator line between the text and the footnote area. */
  var FootnoteLineDistance: Double = js.native
  
  /** contains the relative width of the separator line between the text and the footnote area. */
  var FootnoteLineRelativeWidth: Double = js.native
  
  /**
    * contains the style of the separator line between the text and the footnote area.
    * @see com.sun.star.style.FootnoteLineStyle for the possible values.
    */
  var FootnoteLineStyle: Double = js.native
  
  /** contains the distance between the text and the separator line between the text and the footnote area. */
  var FootnoteLineTextDistance: Double = js.native
  
  /** contains the weight of the separator line between the text and the footnote area. */
  var FootnoteLineWeight: Double = js.native
  
  /** contains the height of the base text line inside the text grid */
  var GridBaseHeight: Double = js.native
  
  /** contains the display color of the text grid */
  var GridColor: Color = js.native
  
  /** determines whether the text grid lines are visible or not */
  var GridDisplay: Boolean = js.native
  
  /** contains the number of lines in the text grid */
  var GridLines: Double = js.native
  
  /** contains the mode of the text grid (none, lines, ...), as represented by {@link com.sun.star.text.TextGridMode} constants */
  var GridMode: Double = js.native
  
  /** determines whether the text grid lines are printed */
  var GridPrint: Boolean = js.native
  
  /** determines whether the text grid's ruby line is located below or above the base line */
  var GridRubyBelow: Boolean = js.native
  
  /** contains the height of the ruby text line inside the text grid */
  var GridRubyHeight: Double = js.native
  
  /** contains the color of the background of the header. */
  var HeaderBackColor: Color = js.native
  
  /** contains the filter name of the background graphic of the header. */
  var HeaderBackGraphicFilter: String = js.native
  
  /** determines the location of the background graphic of the header. */
  var HeaderBackGraphicLocation: GraphicLocation = js.native
  
  /** contains the URL of the background graphic of the header. */
  var HeaderBackGraphicURL: String = js.native
  
  /**
    * determines if the background color of the header is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.HeaderBackColor} will not be used.
    */
  var HeaderBackTransparent: Boolean = js.native
  
  /** determines the distance between the header and the body text area. */
  var HeaderBodyDistance: Double = js.native
  
  /** determines the distance of all borders of the header. */
  var HeaderBorderDistance: Double = js.native
  
  /** determines the style of the bottom border line of the header. */
  var HeaderBottomBorder: BorderLine = js.native
  
  /** determines the bottom border distance of the header. */
  var HeaderBottomBorderDistance: Double = js.native
  
  /** determines whether to use dynamic spacing in header or not. */
  var HeaderDynamicSpacing: Boolean = js.native
  
  /** contains the height of the header. */
  var HeaderHeight: Double = js.native
  
  /** determines if the height of the header depends on the content. */
  var HeaderIsDynamicHeight: Boolean = js.native
  
  /** determines if a header is used on the page. */
  var HeaderIsOn: Boolean = js.native
  
  /** determines if the header content on left and right pages is the same. */
  var HeaderIsShared: Boolean = js.native
  
  /** determines the style of the left border line of the header. */
  var HeaderLeftBorder: BorderLine = js.native
  
  /** determines the left border distance of the header. */
  var HeaderLeftBorderDistance: Double = js.native
  
  /** contains the left margin of the header. */
  var HeaderLeftMargin: Double = js.native
  
  /** determines the style of the right border line of the header. */
  var HeaderRightBorder: BorderLine = js.native
  
  /** determines the right border distance of the header. */
  var HeaderRightBorderDistance: Double = js.native
  
  /** contains the right margin of the header. */
  var HeaderRightMargin: Double = js.native
  
  /** determines the shadow of the header. */
  var HeaderShadowFormat: ShadowFormat = js.native
  
  /** contains the interface to the text of the header. */
  var HeaderText: XText = js.native
  
  /** contains the interface to the text of the header of left pages. */
  var HeaderTextLeft: XText = js.native
  
  /** contains the interface to the text of the header of right pages. */
  var HeaderTextRight: XText = js.native
  
  /** determines the style of the top border line of the header. */
  var HeaderTopBorder: BorderLine = js.native
  
  /** determines the top border distance of the header. */
  var HeaderTopBorderDistance: Double = js.native
  
  /** contains the height of the page. */
  var Height: Double = js.native
  
  /** determines if the page format is landscape. */
  var IsLandscape: Boolean = js.native
  
  /** determines the style of the left border line of the page. */
  var LeftBorder: BorderLine = js.native
  
  /** determines the left border distance of the page. */
  var LeftBorderDistance: Double = js.native
  
  /** determines the left margin of the page. */
  var LeftMargin: Double = js.native
  
  /** determines the default numbering type for this page. */
  var NumberingType: Double = js.native
  
  /** determines the layout of the page. */
  var PageStyleLayout: typings.activexLibreoffice.com_.sun.star.style.PageStyleLayout = js.native
  
  /** contains the name of a paper tray of the selected printer. */
  var PrinterPaperTray: String = js.native
  
  /** determines if the register mode is active on that page. */
  var RegisterModeActive: Boolean = js.native
  
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String = js.native
  
  /** determines the style of the right border line of the page. */
  var RightBorder: BorderLine = js.native
  
  /** determines the right border distance of the page. */
  var RightBorderDistance: Double = js.native
  
  /** determines the right margin of the page. */
  var RightMargin: Double = js.native
  
  /** determines the shadow of the page. */
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat = js.native
  
  /** contains the paper size of the page. */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
  
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns = js.native
  
  /** determines the style of the top border line of the page. */
  var TopBorder: BorderLine = js.native
  
  /** determines the top border distance of the page. */
  var TopBorderDistance: Double = js.native
  
  /** determines the top margin of the page. */
  var TopMargin: Double = js.native
  
  /** contains the width of the page. */
  var Width: Double = js.native
  
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double = js.native
}
object PageStyle {
  
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    DisplayName: String,
    FirstIsShared: Boolean,
    FollowStyle: String,
    FooterBackColor: Color,
    FooterBackGraphicFilter: String,
    FooterBackGraphicLocation: GraphicLocation,
    FooterBackGraphicURL: String,
    FooterBackTransparent: Boolean,
    FooterBodyDistance: Double,
    FooterBorderDistance: Double,
    FooterBottomBorder: BorderLine,
    FooterBottomBorderDistance: Double,
    FooterDynamicSpacing: Boolean,
    FooterHeight: Double,
    FooterIsDynamicHeight: Boolean,
    FooterIsOn: Boolean,
    FooterIsShared: Boolean,
    FooterLeftBorder: BorderLine,
    FooterLeftBorderDistance: Double,
    FooterLeftMargin: Double,
    FooterRightBorder: BorderLine,
    FooterRightBorderDistance: Double,
    FooterRightMargin: Double,
    FooterShadowFormat: ShadowFormat,
    FooterText: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FooterTopBorder: BorderLine,
    FooterTopBorderDistance: Double,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineStyle: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    GridBaseHeight: Double,
    GridColor: Color,
    GridDisplay: Boolean,
    GridLines: Double,
    GridMode: Double,
    GridPrint: Boolean,
    GridRubyBelow: Boolean,
    GridRubyHeight: Double,
    HeaderBackColor: Color,
    HeaderBackGraphicFilter: String,
    HeaderBackGraphicLocation: GraphicLocation,
    HeaderBackGraphicURL: String,
    HeaderBackTransparent: Boolean,
    HeaderBodyDistance: Double,
    HeaderBorderDistance: Double,
    HeaderBottomBorder: BorderLine,
    HeaderBottomBorderDistance: Double,
    HeaderDynamicSpacing: Boolean,
    HeaderHeight: Double,
    HeaderIsDynamicHeight: Boolean,
    HeaderIsOn: Boolean,
    HeaderIsShared: Boolean,
    HeaderLeftBorder: BorderLine,
    HeaderLeftBorderDistance: Double,
    HeaderLeftMargin: Double,
    HeaderRightBorder: BorderLine,
    HeaderRightBorderDistance: Double,
    HeaderRightMargin: Double,
    HeaderShadowFormat: ShadowFormat,
    HeaderText: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    HeaderTopBorder: BorderLine,
    HeaderTopBorderDistance: Double,
    Height: Double,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsLandscape: Boolean,
    IsPhysical: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Name: String,
    NumberingType: Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PrinterPaperTray: String,
    PropertySetInfo: XPropertySetInfo,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): PageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], FirstIsShared = FirstIsShared.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], FooterBackColor = FooterBackColor.asInstanceOf[js.Any], FooterBackGraphicFilter = FooterBackGraphicFilter.asInstanceOf[js.Any], FooterBackGraphicLocation = FooterBackGraphicLocation.asInstanceOf[js.Any], FooterBackGraphicURL = FooterBackGraphicURL.asInstanceOf[js.Any], FooterBackTransparent = FooterBackTransparent.asInstanceOf[js.Any], FooterBodyDistance = FooterBodyDistance.asInstanceOf[js.Any], FooterBorderDistance = FooterBorderDistance.asInstanceOf[js.Any], FooterBottomBorder = FooterBottomBorder.asInstanceOf[js.Any], FooterBottomBorderDistance = FooterBottomBorderDistance.asInstanceOf[js.Any], FooterDynamicSpacing = FooterDynamicSpacing.asInstanceOf[js.Any], FooterHeight = FooterHeight.asInstanceOf[js.Any], FooterIsDynamicHeight = FooterIsDynamicHeight.asInstanceOf[js.Any], FooterIsOn = FooterIsOn.asInstanceOf[js.Any], FooterIsShared = FooterIsShared.asInstanceOf[js.Any], FooterLeftBorder = FooterLeftBorder.asInstanceOf[js.Any], FooterLeftBorderDistance = FooterLeftBorderDistance.asInstanceOf[js.Any], FooterLeftMargin = FooterLeftMargin.asInstanceOf[js.Any], FooterRightBorder = FooterRightBorder.asInstanceOf[js.Any], FooterRightBorderDistance = FooterRightBorderDistance.asInstanceOf[js.Any], FooterRightMargin = FooterRightMargin.asInstanceOf[js.Any], FooterShadowFormat = FooterShadowFormat.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FooterTopBorder = FooterTopBorder.asInstanceOf[js.Any], FooterTopBorderDistance = FooterTopBorderDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineStyle = FootnoteLineStyle.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], GridBaseHeight = GridBaseHeight.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], GridDisplay = GridDisplay.asInstanceOf[js.Any], GridLines = GridLines.asInstanceOf[js.Any], GridMode = GridMode.asInstanceOf[js.Any], GridPrint = GridPrint.asInstanceOf[js.Any], GridRubyBelow = GridRubyBelow.asInstanceOf[js.Any], GridRubyHeight = GridRubyHeight.asInstanceOf[js.Any], HeaderBackColor = HeaderBackColor.asInstanceOf[js.Any], HeaderBackGraphicFilter = HeaderBackGraphicFilter.asInstanceOf[js.Any], HeaderBackGraphicLocation = HeaderBackGraphicLocation.asInstanceOf[js.Any], HeaderBackGraphicURL = HeaderBackGraphicURL.asInstanceOf[js.Any], HeaderBackTransparent = HeaderBackTransparent.asInstanceOf[js.Any], HeaderBodyDistance = HeaderBodyDistance.asInstanceOf[js.Any], HeaderBorderDistance = HeaderBorderDistance.asInstanceOf[js.Any], HeaderBottomBorder = HeaderBottomBorder.asInstanceOf[js.Any], HeaderBottomBorderDistance = HeaderBottomBorderDistance.asInstanceOf[js.Any], HeaderDynamicSpacing = HeaderDynamicSpacing.asInstanceOf[js.Any], HeaderHeight = HeaderHeight.asInstanceOf[js.Any], HeaderIsDynamicHeight = HeaderIsDynamicHeight.asInstanceOf[js.Any], HeaderIsOn = HeaderIsOn.asInstanceOf[js.Any], HeaderIsShared = HeaderIsShared.asInstanceOf[js.Any], HeaderLeftBorder = HeaderLeftBorder.asInstanceOf[js.Any], HeaderLeftBorderDistance = HeaderLeftBorderDistance.asInstanceOf[js.Any], HeaderLeftMargin = HeaderLeftMargin.asInstanceOf[js.Any], HeaderRightBorder = HeaderRightBorder.asInstanceOf[js.Any], HeaderRightBorderDistance = HeaderRightBorderDistance.asInstanceOf[js.Any], HeaderRightMargin = HeaderRightMargin.asInstanceOf[js.Any], HeaderShadowFormat = HeaderShadowFormat.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], HeaderTopBorder = HeaderTopBorder.asInstanceOf[js.Any], HeaderTopBorderDistance = HeaderTopBorderDistance.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageStyleLayout = PageStyleLayout.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PrinterPaperTray = PrinterPaperTray.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[PageStyle]
  }
  
  @scala.inline
  implicit class PageStyleOps[Self <: PageStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackColor(value: Color): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicFilter(value: String): Self = this.set("BackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicLocation(value: GraphicLocation): Self = this.set("BackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicURL(value: String): Self = this.set("BackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTransparent(value: Boolean): Self = this.set("BackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDistance(value: Double): Self = this.set("BorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorder(value: BorderLine): Self = this.set("BottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = this.set("BottomBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("BottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstIsShared(value: Boolean): Self = this.set("FirstIsShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBackColor(value: Color): Self = this.set("FooterBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBackGraphicFilter(value: String): Self = this.set("FooterBackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBackGraphicLocation(value: GraphicLocation): Self = this.set("FooterBackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBackGraphicURL(value: String): Self = this.set("FooterBackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBackTransparent(value: Boolean): Self = this.set("FooterBackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBodyDistance(value: Double): Self = this.set("FooterBodyDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBorderDistance(value: Double): Self = this.set("FooterBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBottomBorder(value: BorderLine): Self = this.set("FooterBottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterBottomBorderDistance(value: Double): Self = this.set("FooterBottomBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterDynamicSpacing(value: Boolean): Self = this.set("FooterDynamicSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterHeight(value: Double): Self = this.set("FooterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterIsDynamicHeight(value: Boolean): Self = this.set("FooterIsDynamicHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterIsOn(value: Boolean): Self = this.set("FooterIsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterIsShared(value: Boolean): Self = this.set("FooterIsShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterLeftBorder(value: BorderLine): Self = this.set("FooterLeftBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterLeftBorderDistance(value: Double): Self = this.set("FooterLeftBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterLeftMargin(value: Double): Self = this.set("FooterLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRightBorder(value: BorderLine): Self = this.set("FooterRightBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRightBorderDistance(value: Double): Self = this.set("FooterRightBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRightMargin(value: Double): Self = this.set("FooterRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterShadowFormat(value: ShadowFormat): Self = this.set("FooterShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterText(value: XText): Self = this.set("FooterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTextLeft(value: XText): Self = this.set("FooterTextLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTextRight(value: XText): Self = this.set("FooterTextRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTopBorder(value: BorderLine): Self = this.set("FooterTopBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTopBorderDistance(value: Double): Self = this.set("FooterTopBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteHeight(value: Double): Self = this.set("FootnoteHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineAdjust(value: Double): Self = this.set("FootnoteLineAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineColor(value: Color): Self = this.set("FootnoteLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineDistance(value: Double): Self = this.set("FootnoteLineDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineRelativeWidth(value: Double): Self = this.set("FootnoteLineRelativeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineStyle(value: Double): Self = this.set("FootnoteLineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineTextDistance(value: Double): Self = this.set("FootnoteLineTextDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineWeight(value: Double): Self = this.set("FootnoteLineWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridBaseHeight(value: Double): Self = this.set("GridBaseHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColor(value: Color): Self = this.set("GridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridDisplay(value: Boolean): Self = this.set("GridDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLines(value: Double): Self = this.set("GridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridMode(value: Double): Self = this.set("GridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridPrint(value: Boolean): Self = this.set("GridPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRubyBelow(value: Boolean): Self = this.set("GridRubyBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRubyHeight(value: Double): Self = this.set("GridRubyHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackColor(value: Color): Self = this.set("HeaderBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackGraphicFilter(value: String): Self = this.set("HeaderBackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackGraphicLocation(value: GraphicLocation): Self = this.set("HeaderBackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackGraphicURL(value: String): Self = this.set("HeaderBackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTransparent(value: Boolean): Self = this.set("HeaderBackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBodyDistance(value: Double): Self = this.set("HeaderBodyDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBorderDistance(value: Double): Self = this.set("HeaderBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBottomBorder(value: BorderLine): Self = this.set("HeaderBottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBottomBorderDistance(value: Double): Self = this.set("HeaderBottomBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderDynamicSpacing(value: Boolean): Self = this.set("HeaderDynamicSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("HeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIsDynamicHeight(value: Boolean): Self = this.set("HeaderIsDynamicHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIsOn(value: Boolean): Self = this.set("HeaderIsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIsShared(value: Boolean): Self = this.set("HeaderIsShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLeftBorder(value: BorderLine): Self = this.set("HeaderLeftBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLeftBorderDistance(value: Double): Self = this.set("HeaderLeftBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLeftMargin(value: Double): Self = this.set("HeaderLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRightBorder(value: BorderLine): Self = this.set("HeaderRightBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRightBorderDistance(value: Double): Self = this.set("HeaderRightBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRightMargin(value: Double): Self = this.set("HeaderRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderShadowFormat(value: ShadowFormat): Self = this.set("HeaderShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderText(value: XText): Self = this.set("HeaderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextLeft(value: XText): Self = this.set("HeaderTextLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextRight(value: XText): Self = this.set("HeaderTextRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTopBorder(value: BorderLine): Self = this.set("HeaderTopBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTopBorderDistance(value: Double): Self = this.set("HeaderTopBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("IsLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorder(value: BorderLine): Self = this.set("LeftBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = this.set("LeftBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingType(value: Double): Self = this.set("NumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStyleLayout(value: PageStyleLayout): Self = this.set("PageStyleLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterPaperTray(value: String): Self = this.set("PrinterPaperTray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterModeActive(value: Boolean): Self = this.set("RegisterModeActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterParagraphStyle(value: String): Self = this.set("RegisterParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorder(value: BorderLine): Self = this.set("RightBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorderDistance(value: Double): Self = this.set("RightBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowFormat(value: ShadowFormat): Self = this.set("ShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColumns(value: XTextColumns): Self = this.set("TextColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorder(value: BorderLine): Self = this.set("TopBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorderDistance(value: Double): Self = this.set("TopBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingMode(value: Double): Self = this.set("WritingMode", value.asInstanceOf[js.Any])
  }
}
