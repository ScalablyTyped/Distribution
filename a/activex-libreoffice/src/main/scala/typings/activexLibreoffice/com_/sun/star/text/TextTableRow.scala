package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the properties of a text table row.
  * @see com.sun.star.TextTable
  */
@js.native
trait TextTableRow extends XPropertySet {
  /** specifies the color of the background. */
  var BackColor: Color = js.native
  /** contains the name of the file filter of a background graphic. */
  var BackGraphicFilter: String = js.native
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation = js.native
  /** contains the URL of a background graphic. */
  var BackGraphicURL: String = js.native
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: Boolean = js.native
  /** contains the height of the table row. */
  var Height: Double = js.native
  /** If the value of this property is `TRUE` , the height of the table row depends on the content of the table cells. */
  var IsAutoHeight: Boolean = js.native
  /**
    * If `TRUE` , the row is allowed to be split at page or column breaks.
    * @@since OOo 2.0
    */
  var IsSplitAllowed: Boolean = js.native
  /**
    * Grab bag of row properties, used as a string-any map for interop purposes.
    * @since LibreOffice 4.4  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var RowInteropGrabBag: SafeArray[PropertyValue] = js.native
  /** contains the description of the columns in the table row. */
  var TableColumnSeparators: SafeArray[TableColumnSeparator] = js.native
}

object TextTableRow {
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    Height: Double,
    IsAutoHeight: Boolean,
    IsSplitAllowed: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RowInteropGrabBag: SafeArray[PropertyValue],
    TableColumnSeparators: SafeArray[TableColumnSeparator],
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TextTableRow = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsAutoHeight = IsAutoHeight.asInstanceOf[js.Any], IsSplitAllowed = IsSplitAllowed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowInteropGrabBag = RowInteropGrabBag.asInstanceOf[js.Any], TableColumnSeparators = TableColumnSeparators.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextTableRow]
  }
  @scala.inline
  implicit class TextTableRowOps[Self <: TextTableRow] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutoHeight(value: Boolean): Self = this.set("IsAutoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSplitAllowed(value: Boolean): Self = this.set("IsSplitAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowInteropGrabBag(value: SafeArray[PropertyValue]): Self = this.set("RowInteropGrabBag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableColumnSeparators(value: SafeArray[TableColumnSeparator]): Self = this.set("TableColumnSeparators", value.asInstanceOf[js.Any])
  }
  
}

