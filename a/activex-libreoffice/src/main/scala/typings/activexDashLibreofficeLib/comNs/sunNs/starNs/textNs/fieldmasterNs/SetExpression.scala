package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the service of a set expression field master.
  * @see com.sun.star.text.TextFieldMaster
  */
trait SetExpression
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster {
  /** determines the number of the chapter. This values is used if the field master is set as number sequence. */
  var ChapterNumberingLevel: scala.Double
  /** determines the numbering separator string if the field master is set as number sequence. */
  var NumberingSeparator: java.lang.String
  /** determines the type of the field as {@link com.sun.star.text.SetVariableType} */
  var SubType: scala.Double
}

object SetExpression {
  @scala.inline
  def apply(
    ChapterNumberingLevel: scala.Double,
    DependentTextFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XDependentTextField],
    InstanceName: java.lang.String,
    Name: java.lang.String,
    NumberingSeparator: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SubType: scala.Double,
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
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SetExpression = {
    val __obj = js.Dynamic.literal(ChapterNumberingLevel = ChapterNumberingLevel, DependentTextFields = DependentTextFields, InstanceName = InstanceName, Name = Name, NumberingSeparator = NumberingSeparator, PropertySetInfo = PropertySetInfo, SubType = SubType, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[SetExpression]
  }
}

