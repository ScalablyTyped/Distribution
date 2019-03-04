package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an AutoFormat, containing exactly 16 AutoFormat fields.
  *
  * Each of the 16 fields contain formatting properties for a table cell at a specific position in the AutoFormat range. The rows of the range are divided
  * into a header row, a footer row and 2 data rows (repeated in turn between header and footer row). The columns are divided similar. This results in 16
  * different types of cells in the range. The AutoFormats are numbered row by row, then column by column.
  * @see com.sun.star.sheet.TableAutoFormatField
  */
trait TableAutoFormat
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** specifies whether the background settings from the fields are used. */
  var IncludeBackground: scala.Boolean
  /** specifies whether the border settings from the fields are used. */
  var IncludeBorder: scala.Boolean
  /** specifies whether the font settings from the fields are used. */
  var IncludeFont: scala.Boolean
  /** specifies whether the justification settings from the fields are used. */
  var IncludeJustify: scala.Boolean
  /** specifies whether the number format settings from the fields are used. */
  var IncludeNumberFormat: scala.Boolean
  /** specifies whether the column widths and row heights should be updated after applying the format. */
  var IncludeWidthAndHeight: scala.Boolean
}

object TableAutoFormat {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    IncludeBackground: scala.Boolean,
    IncludeBorder: scala.Boolean,
    IncludeFont: scala.Boolean,
    IncludeJustify: scala.Boolean,
    IncludeNumberFormat: scala.Boolean,
    IncludeWidthAndHeight: scala.Boolean,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
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
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TableAutoFormat = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, IncludeBackground = IncludeBackground, IncludeBorder = IncludeBorder, IncludeFont = IncludeFont, IncludeJustify = IncludeJustify, IncludeNumberFormat = IncludeNumberFormat, IncludeWidthAndHeight = IncludeWidthAndHeight, Name = Name, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createEnumeration = createEnumeration, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, hasElements = hasElements, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[TableAutoFormat]
  }
}

