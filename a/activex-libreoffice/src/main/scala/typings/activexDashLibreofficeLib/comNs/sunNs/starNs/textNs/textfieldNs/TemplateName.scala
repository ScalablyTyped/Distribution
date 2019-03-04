package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service text field that displays the name of the template the document has been created from.
  * @see com.sun.star.text.TextField
  */
trait TemplateName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** determines the format the template file name is displayed as specified in {@link com.sun.star.text.FilenameDisplayFormat} . */
  var FileFormat: scala.Double
}

object TemplateName {
  @scala.inline
  def apply(
    Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    AnchorType: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
    FileFormat: scala.Double,
    IsFieldDisplayed: scala.Boolean,
    IsFieldUsed: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    TextWrap: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    attach: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getPresentation: js.Function1[scala.Boolean, java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
  ): TemplateName = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, FileFormat = FileFormat, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, PropertySetInfo = PropertySetInfo, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getPresentation = getPresentation, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[TemplateName]
  }
}

