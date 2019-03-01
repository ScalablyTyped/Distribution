package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a page for the actual draw pages to contain the drawings.
  * @see GenericDrawPage
  * @see DrawPages
  */
trait DrawPage
  extends GenericDrawPage
     with XMasterPageTarget
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XFormsSupplier

object DrawPage {
  @scala.inline
  def apply(
    BorderBottom: scala.Double,
    BorderLeft: scala.Double,
    BorderRight: scala.Double,
    BorderTop: scala.Double,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Forms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Height: scala.Double,
    IsBackgroundDark: scala.Boolean,
    MasterPage: XDrawPage,
    Name: java.lang.String,
    NavigationOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Number: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
    add: js.Function1[XShape, scala.Unit],
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
    bind: js.Function1[XShapes, XShape],
    combine: js.Function1[XShapes, XShape],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getForms: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    getMasterPage: js.Function0[XDrawPage],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    group: js.Function1[XShapes, XShapeGroup],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XShape, scala.Unit],
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
    setMasterPage: js.Function1[XDrawPage, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    split: js.Function1[XShape, scala.Unit],
    unbind: js.Function1[XShape, scala.Unit],
    ungroup: js.Function1[XShapeGroup, scala.Unit]
  ): DrawPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BorderBottom")(BorderBottom)
    __obj.updateDynamic("BorderLeft")(BorderLeft)
    __obj.updateDynamic("BorderRight")(BorderRight)
    __obj.updateDynamic("BorderTop")(BorderTop)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Forms")(Forms)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("IsBackgroundDark")(IsBackgroundDark)
    __obj.updateDynamic("MasterPage")(MasterPage)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NavigationOrder")(NavigationOrder)
    __obj.updateDynamic("Number")(Number)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("combine")(combine)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getForms")(getForms)
    __obj.updateDynamic("getMasterPage")(getMasterPage)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setMasterPage")(setMasterPage)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("split")(split)
    __obj.updateDynamic("unbind")(unbind)
    __obj.updateDynamic("ungroup")(ungroup)
    __obj.asInstanceOf[DrawPage]
  }
}

