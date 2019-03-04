package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layer is an entity inside a document which contains shapes.
  *
  * There could be zero or more {@link Shapes} attached to such a layer.
  *
  * The properties of a {@link Layer} instance affect all {@link Shapes} attached to the {@link Layer} .
  * @see DrawingDocument
  * @see LayerManager
  */
trait Layer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** If a {@link Layer} is locked, the objects in this {@link Layer} cannot be edited in the user interface. */
  var IsLocked: scala.Boolean
  /** If a {@link Layer} is not printable, the objects in this {@link Layer} are not printed. */
  var IsPrintable: scala.Boolean
  /** If a {@link Layer} is not visible, the objects in this {@link Layer} are not shown in the user interface. */
  var IsVisible: scala.Boolean
  /** The name of a {@link Layer} is used to identify the {@link Layer} in the user interface. */
  var Name: java.lang.String
}

object Layer {
  @scala.inline
  def apply(
    IsLocked: scala.Boolean,
    IsPrintable: scala.Boolean,
    IsVisible: scala.Boolean,
    Name: java.lang.String,
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
  ): Layer = {
    val __obj = js.Dynamic.literal(IsLocked = IsLocked, IsPrintable = IsPrintable, IsVisible = IsVisible, Name = Name, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Layer]
  }
}

