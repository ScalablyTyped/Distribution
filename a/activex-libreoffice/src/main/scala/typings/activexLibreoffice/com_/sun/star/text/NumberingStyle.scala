package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.style.Style
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a style sheet numberings within a {@link com.sun.star.text.Text} . */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.text.NumberingRules because var conflicts: Name. Inlined DefaultListId, IsAbsoluteMargins, IsAutomatic, IsContinuousNumbering, NumberingIsOutline, NumberingType */ trait NumberingStyle
  extends StObject
     with Style
     with XIndexReplace {
  
  /** id of default list for the numbering rules instance */
  var DefaultListId: String
  
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: Boolean
  
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: Boolean
  
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: Boolean
  
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: Boolean
  
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object NumberingStyle {
  
  inline def apply(
    Count: Double,
    DefaultListId: String,
    DisplayName: String,
    ElementType: `type`,
    FollowStyle: String,
    Hidden: Boolean,
    IsAbsoluteMargins: Boolean,
    IsAutoUpdate: String,
    IsAutomatic: Boolean,
    IsContinuousNumbering: Boolean,
    IsPhysical: Boolean,
    Name: String,
    NumberingIsOutline: Boolean,
    NumberingType: Double,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PropertySetInfo: XPropertySetInfo,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    hasElements: () => Boolean,
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, Any) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValue: (String, Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Unit
  ): NumberingStyle = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DefaultListId = DefaultListId.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAbsoluteMargins = IsAbsoluteMargins.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsContinuousNumbering = IsContinuousNumbering.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingIsOutline = NumberingIsOutline.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), hasElements = js.Any.fromFunction0(hasElements), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[NumberingStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberingStyle] (val x: Self) extends AnyVal {
    
    inline def setDefaultListId(value: String): Self = StObject.set(x, "DefaultListId", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setIsAbsoluteMargins(value: Boolean): Self = StObject.set(x, "IsAbsoluteMargins", value.asInstanceOf[js.Any])
    
    inline def setIsAutomatic(value: Boolean): Self = StObject.set(x, "IsAutomatic", value.asInstanceOf[js.Any])
    
    inline def setIsContinuousNumbering(value: Boolean): Self = StObject.set(x, "IsContinuousNumbering", value.asInstanceOf[js.Any])
    
    inline def setNumberingIsOutline(value: Boolean): Self = StObject.set(x, "NumberingIsOutline", value.asInstanceOf[js.Any])
    
    inline def setNumberingType(value: Double): Self = StObject.set(x, "NumberingType", value.asInstanceOf[js.Any])
  }
}
