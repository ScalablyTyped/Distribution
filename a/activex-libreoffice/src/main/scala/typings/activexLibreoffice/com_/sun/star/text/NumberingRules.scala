package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the numbering rules.
  *
  * Numbering rules may be set at a {@link Paragraph} object. The numbering rules are levels of property values. Each level contains equal properties.
  */
trait NumberingRules
  extends StObject
     with XIndexReplace
     with XPropertySet {
  
  /** id of default list for the numbering rules instance */
  var DefaultListId: String
  
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: Boolean
  
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: Boolean
  
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: Boolean
  
  /** contains the name of the numbering rules. It is used to identify a certain numbering rules property */
  var Name: String
  
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: Boolean
  
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: Double
}
object NumberingRules {
  
  inline def apply(
    Count: Double,
    DefaultListId: String,
    ElementType: `type`,
    IsAbsoluteMargins: Boolean,
    IsAutomatic: Boolean,
    IsContinuousNumbering: Boolean,
    Name: String,
    NumberingIsOutline: Boolean,
    NumberingType: Double,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, Any) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): NumberingRules = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DefaultListId = DefaultListId.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], IsAbsoluteMargins = IsAbsoluteMargins.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsContinuousNumbering = IsContinuousNumbering.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingIsOutline = NumberingIsOutline.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[NumberingRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberingRules] (val x: Self) extends AnyVal {
    
    inline def setDefaultListId(value: String): Self = StObject.set(x, "DefaultListId", value.asInstanceOf[js.Any])
    
    inline def setIsAbsoluteMargins(value: Boolean): Self = StObject.set(x, "IsAbsoluteMargins", value.asInstanceOf[js.Any])
    
    inline def setIsAutomatic(value: Boolean): Self = StObject.set(x, "IsAutomatic", value.asInstanceOf[js.Any])
    
    inline def setIsContinuousNumbering(value: Boolean): Self = StObject.set(x, "IsContinuousNumbering", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumberingIsOutline(value: Boolean): Self = StObject.set(x, "NumberingIsOutline", value.asInstanceOf[js.Any])
    
    inline def setNumberingType(value: Double): Self = StObject.set(x, "NumberingType", value.asInstanceOf[js.Any])
  }
}
