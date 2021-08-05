package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertyStates
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service specifies a single style sheet. */
trait Style
  extends StObject
     with UserDefinedAttributesSupplier
     with XStyle
     with XPropertySet
     with XMultiPropertySet
     with XMultiPropertyStates {
  
  /**
    * contains the name of the style as it is displayed in the user interface.
    *
    * The names of the styles at the API are language independent. The user interface names are localized.
    */
  var DisplayName: String
  
  /**
    * contains the name of the style that is applied to the next paragraph.
    *
    * This property is usually available at paragraph styles only.
    */
  var FollowStyle: String
  
  /**
    * Flag indicating whether to hide the style in the UI.
    * @since LibreOffice 4.0
    */
  var Hidden: Boolean
  
  /**
    * determines if a style is automatically updated, if the properties of an object that the style is applied to are changed.
    *
    * For example, if the style is applied to a paragraph and the properties of the paragraph are changed then the style will be updated accordingly.
    */
  var IsAutoUpdate: String
  
  /**
    * determines if a style is physically created.
    *
    * Built in styles may not be created until they are needed. To prevent standard style properties from being exported, it may be useful to check if the
    * style is created first.
    */
  var IsPhysical: Boolean
  
  /**
    * defines the context and styles for conditional paragraphs.
    *
    * This property is only available if the style is a conditional paragraph style.
    *
    * The sequence consists of pairs where the name part of the pair defines the context where it should be applied and the value part is a string naming
    * the style to be used in that context.
    *
    * Assigning an empty string to the style name will disable the conditional style for that context.
    *
    * The allowed strings (contexts) for the name part of an entry of the sequence are:
    *
    * umberingLevel1NumberingLevel2NumberingLevel3NumberingLevel4NumberingLevel5NumberingLevel6NumberingLevel7NumberingLevel8NumberingLevel9NumberingLevel10
    * @since OOo 2.0.1
    */
  var ParaStyleConditions: SafeArray[NamedValue]
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo
  
  /**
    * Grab bag of style properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var StyleInteropGrabBag: SafeArray[PropertyValue]
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object Style {
  
  inline def apply(
    DisplayName: String,
    FollowStyle: String,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsPhysical: Boolean,
    Name: String,
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
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[js.Any],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
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
    setPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit
  ): Style = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setFollowStyle(value: String): Self = StObject.set(x, "FollowStyle", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setIsAutoUpdate(value: String): Self = StObject.set(x, "IsAutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setIsPhysical(value: Boolean): Self = StObject.set(x, "IsPhysical", value.asInstanceOf[js.Any])
    
    inline def setParaStyleConditions(value: SafeArray[NamedValue]): Self = StObject.set(x, "ParaStyleConditions", value.asInstanceOf[js.Any])
    
    inline def setPropertySetInfo(value: XPropertySetInfo): Self = StObject.set(x, "PropertySetInfo", value.asInstanceOf[js.Any])
    
    inline def setStyleInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "StyleInteropGrabBag", value.asInstanceOf[js.Any])
  }
}
