package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a single style sheet. */
trait Style
  extends XStyle
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertyStates {
  /**
    * contains the name of the style as it is displayed in the user interface.
    *
    * The names of the styles at the API are language independent. The user interface names are localized.
    */
  var DisplayName: java.lang.String
  /**
    * contains the name of the style that is applied to the next paragraph.
    *
    * This property is usually available at paragraph styles only.
    */
  var FollowStyle: java.lang.String
  /**
    * Flag indicating whether to hide the style in the UI.
    * @since LibreOffice 4.0
    */
  var Hidden: scala.Boolean
  /**
    * determines if a style is automatically updated, if the properties of an object that the style is applied to are changed.
    *
    * For example, if the style is applied to a paragraph and the properties of the paragraph are changed then the style will be updated accordingly.
    */
  var IsAutoUpdate: java.lang.String
  /**
    * determines if a style is physically created.
    *
    * Built in styles may not be created until they are needed. To prevent standard style properties from being exported, it may be useful to check if the
    * style is created first.
    */
  var IsPhysical: scala.Boolean
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
  var ParaStyleConditions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
  /**
    * Grab bag of style properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var StyleInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

object Style {
  @scala.inline
  def apply(
    DisplayName: java.lang.String,
    FollowStyle: java.lang.String,
    Hidden: scala.Boolean,
    IsAutoUpdate: java.lang.String,
    IsPhysical: scala.Boolean,
    Name: java.lang.String,
    ParaStyleConditions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ParentStyle: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    StyleInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getName: js.Function0[java.lang.String],
    getParentStyle: js.Function0[java.lang.String],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    isInUse: js.Function0[scala.Boolean],
    isUserDefined: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParentStyle: js.Function1[java.lang.String, scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): Style = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName, FollowStyle = FollowStyle, Hidden = Hidden, IsAutoUpdate = IsAutoUpdate, IsPhysical = IsPhysical, Name = Name, ParaStyleConditions = ParaStyleConditions, ParentStyle = ParentStyle, PropertySetInfo = PropertySetInfo, StyleInteropGrabBag = StyleInteropGrabBag, UserDefinedAttributes = UserDefinedAttributes, acquire = acquire, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, firePropertiesChangeEvent = firePropertiesChangeEvent, getName = getName, getParentStyle = getParentStyle, getPropertyDefaults = getPropertyDefaults, getPropertySetInfo = getPropertySetInfo, getPropertyStates = getPropertyStates, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, isInUse = isInUse, isUserDefined = isUserDefined, queryInterface = queryInterface, release = release, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setName = setName, setParentStyle = setParentStyle, setPropertiesToDefault = setPropertiesToDefault, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[Style]
  }
}

