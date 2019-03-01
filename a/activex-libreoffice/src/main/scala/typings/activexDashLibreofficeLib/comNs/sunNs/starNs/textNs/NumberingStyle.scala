package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet numberings within a {@link com.sun.star.text.Text} . */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingRules because var conflicts: Name. Inlined DefaultListId, IsAbsoluteMargins, IsAutomatic, IsContinuousNumbering, NumberingIsOutline, NumberingType */ trait NumberingStyle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.Style {
  /** id of default list for the numbering rules instance */
  var DefaultListId: java.lang.String
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: scala.Boolean
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: scala.Boolean
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: scala.Boolean
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: scala.Boolean
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: scala.Double
}

object NumberingStyle {
  @scala.inline
  def apply(
    Count: scala.Double,
    DefaultListId: java.lang.String,
    DisplayName: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    FollowStyle: java.lang.String,
    Hidden: scala.Boolean,
    IsAbsoluteMargins: scala.Boolean,
    IsAutoUpdate: java.lang.String,
    IsAutomatic: scala.Boolean,
    IsContinuousNumbering: scala.Boolean,
    IsPhysical: scala.Boolean,
    Name: java.lang.String,
    NumberingIsOutline: scala.Boolean,
    NumberingType: scala.Double,
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
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
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
    hasElements: js.Function0[scala.Boolean],
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
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
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
  ): NumberingStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DefaultListId")(DefaultListId)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("FollowStyle")(FollowStyle)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IsAbsoluteMargins")(IsAbsoluteMargins)
    __obj.updateDynamic("IsAutoUpdate")(IsAutoUpdate)
    __obj.updateDynamic("IsAutomatic")(IsAutomatic)
    __obj.updateDynamic("IsContinuousNumbering")(IsContinuousNumbering)
    __obj.updateDynamic("IsPhysical")(IsPhysical)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NumberingIsOutline")(NumberingIsOutline)
    __obj.updateDynamic("NumberingType")(NumberingType)
    __obj.updateDynamic("ParaStyleConditions")(ParaStyleConditions)
    __obj.updateDynamic("ParentStyle")(ParentStyle)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("StyleInteropGrabBag")(StyleInteropGrabBag)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("firePropertiesChangeEvent")(firePropertiesChangeEvent)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParentStyle")(getParentStyle)
    __obj.updateDynamic("getPropertyDefaults")(getPropertyDefaults)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyStates")(getPropertyStates)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isInUse")(isInUse)
    __obj.updateDynamic("isUserDefined")(isUserDefined)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("replaceByIndex")(replaceByIndex)
    __obj.updateDynamic("setAllPropertiesToDefault")(setAllPropertiesToDefault)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParentStyle")(setParentStyle)
    __obj.updateDynamic("setPropertiesToDefault")(setPropertiesToDefault)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.asInstanceOf[NumberingStyle]
  }
}

