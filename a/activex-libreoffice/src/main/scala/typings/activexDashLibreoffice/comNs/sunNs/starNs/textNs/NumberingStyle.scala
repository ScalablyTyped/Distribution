package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.Style
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet numberings within a {@link com.sun.star.text.Text} . */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.NumberingRules because var conflicts: Name. Inlined DefaultListId, IsAbsoluteMargins, IsAutomatic, IsContinuousNumbering, NumberingIsOutline, NumberingType */ trait NumberingStyle extends Style {
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
}

object NumberingStyle {
  @scala.inline
  def apply(
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
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    hasElements: () => Boolean,
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): NumberingStyle = {
    val __obj = js.Dynamic.literal(Count = Count, DefaultListId = DefaultListId, DisplayName = DisplayName, ElementType = ElementType, FollowStyle = FollowStyle, Hidden = Hidden, IsAbsoluteMargins = IsAbsoluteMargins, IsAutoUpdate = IsAutoUpdate, IsAutomatic = IsAutomatic, IsContinuousNumbering = IsContinuousNumbering, IsPhysical = IsPhysical, Name = Name, NumberingIsOutline = NumberingIsOutline, NumberingType = NumberingType, ParaStyleConditions = ParaStyleConditions, ParentStyle = ParentStyle, PropertySetInfo = PropertySetInfo, StyleInteropGrabBag = StyleInteropGrabBag, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), hasElements = js.Any.fromFunction0(hasElements), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
  
    __obj.asInstanceOf[NumberingStyle]
  }
}

