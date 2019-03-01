package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface gives access to an annotation inside a document. */
trait XAnnotation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** a reference to the document content this annotation is anchored to. */
  var Anchor: js.Any
  /** stores the full name of the author who created this annotation. */
  var Author: java.lang.String
  /** stores the date and time this annotation was last edited. */
  var DateTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** stores the initials of the author who created this annotation. */
  var Initials: java.lang.String
  /**
    * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
    * anchor.
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D
  /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D
  /** gives access to the annotations text. */
  var TextRange: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
}

object XAnnotation {
  @scala.inline
  def apply(
    Anchor: js.Any,
    Author: java.lang.String,
    DateTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    Initials: java.lang.String,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D,
    TextRange: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
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
    dispose: js.Function0[scala.Unit],
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
  ): XAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("Author")(Author)
    __obj.updateDynamic("DateTime")(DateTime)
    __obj.updateDynamic("Initials")(Initials)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("TextRange")(TextRange)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XAnnotation]
  }
}

