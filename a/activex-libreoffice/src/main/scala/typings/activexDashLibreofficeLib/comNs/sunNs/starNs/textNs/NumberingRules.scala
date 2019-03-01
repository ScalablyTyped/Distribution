package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the numbering rules.
  *
  * Numbering rules may be set at a {@link Paragraph} object. The numbering rules are levels of property values. Each level contains equal properties.
  */
trait NumberingRules
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** id of default list for the numbering rules instance */
  var DefaultListId: java.lang.String
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: scala.Boolean
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: scala.Boolean
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: scala.Boolean
  /** contains the name of the numbering rules. It is used to identify a certain numbering rules property */
  var Name: java.lang.String
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: scala.Boolean
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: scala.Double
}

object NumberingRules {
  @scala.inline
  def apply(
    Count: scala.Double,
    DefaultListId: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    IsAbsoluteMargins: scala.Boolean,
    IsAutomatic: scala.Boolean,
    IsContinuousNumbering: scala.Boolean,
    Name: java.lang.String,
    NumberingIsOutline: scala.Boolean,
    NumberingType: scala.Double,
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
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
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
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): NumberingRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DefaultListId")(DefaultListId)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("IsAbsoluteMargins")(IsAbsoluteMargins)
    __obj.updateDynamic("IsAutomatic")(IsAutomatic)
    __obj.updateDynamic("IsContinuousNumbering")(IsContinuousNumbering)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NumberingIsOutline")(NumberingIsOutline)
    __obj.updateDynamic("NumberingType")(NumberingType)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("replaceByIndex")(replaceByIndex)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[NumberingRules]
  }
}

