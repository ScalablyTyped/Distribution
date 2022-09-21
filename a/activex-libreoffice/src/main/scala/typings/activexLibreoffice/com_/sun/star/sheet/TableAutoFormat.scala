package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an AutoFormat, containing exactly 16 AutoFormat fields.
  *
  * Each of the 16 fields contain formatting properties for a table cell at a specific position in the AutoFormat range. The rows of the range are divided
  * into a header row, a footer row and 2 data rows (repeated in turn between header and footer row). The columns are divided similar. This results in 16
  * different types of cells in the range. The AutoFormats are numbered row by row, then column by column.
  * @see com.sun.star.sheet.TableAutoFormatField
  */
trait TableAutoFormat
  extends StObject
     with XPropertySet
     with XIndexAccess
     with XEnumerationAccess
     with XNamed {
  
  /** specifies whether the background settings from the fields are used. */
  var IncludeBackground: Boolean
  
  /** specifies whether the border settings from the fields are used. */
  var IncludeBorder: Boolean
  
  /** specifies whether the font settings from the fields are used. */
  var IncludeFont: Boolean
  
  /** specifies whether the justification settings from the fields are used. */
  var IncludeJustify: Boolean
  
  /** specifies whether the number format settings from the fields are used. */
  var IncludeNumberFormat: Boolean
  
  /** specifies whether the column widths and row heights should be updated after applying the format. */
  var IncludeWidthAndHeight: Boolean
}
object TableAutoFormat {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    IncludeBackground: Boolean,
    IncludeBorder: Boolean,
    IncludeFont: Boolean,
    IncludeJustify: Boolean,
    IncludeNumberFormat: Boolean,
    IncludeWidthAndHeight: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, Any) => Unit
  ): TableAutoFormat = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], IncludeBackground = IncludeBackground.asInstanceOf[js.Any], IncludeBorder = IncludeBorder.asInstanceOf[js.Any], IncludeFont = IncludeFont.asInstanceOf[js.Any], IncludeJustify = IncludeJustify.asInstanceOf[js.Any], IncludeNumberFormat = IncludeNumberFormat.asInstanceOf[js.Any], IncludeWidthAndHeight = IncludeWidthAndHeight.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TableAutoFormat]
  }
  
  extension [Self <: TableAutoFormat](x: Self) {
    
    inline def setIncludeBackground(value: Boolean): Self = StObject.set(x, "IncludeBackground", value.asInstanceOf[js.Any])
    
    inline def setIncludeBorder(value: Boolean): Self = StObject.set(x, "IncludeBorder", value.asInstanceOf[js.Any])
    
    inline def setIncludeFont(value: Boolean): Self = StObject.set(x, "IncludeFont", value.asInstanceOf[js.Any])
    
    inline def setIncludeJustify(value: Boolean): Self = StObject.set(x, "IncludeJustify", value.asInstanceOf[js.Any])
    
    inline def setIncludeNumberFormat(value: Boolean): Self = StObject.set(x, "IncludeNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setIncludeWidthAndHeight(value: Boolean): Self = StObject.set(x, "IncludeWidthAndHeight", value.asInstanceOf[js.Any])
  }
}
