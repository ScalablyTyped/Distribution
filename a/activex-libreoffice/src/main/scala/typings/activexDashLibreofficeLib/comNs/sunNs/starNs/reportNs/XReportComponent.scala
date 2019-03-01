package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a component which may be part of a report.
  * @see XReportDefinition
  */
trait XReportComponent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 2: simple border; `
    */
  var ControlBorder: scala.Double
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see Border) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    */
  var ControlBorderColor: scala.Double
  /**
    * is used for subreports and contains the names of the columns of the subreport which are related to the master fields of the parent report.
    *
    * Entries in this sequence can either denote column names in the sub report, or parameter names. ;  For instance, you could base the report on the SQL
    * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
    * the corresponding master field. ;  Alternatively, you could simply base your report on the table `invoices` , and add the column name `cust_ref` to
    * the DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
    * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
    * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
    *
    * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail report.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var DetailFields: activexDashInteropLib.SafeArray[java.lang.String]
  /** specifies the height of the control. */
  var Height: scala.Double
  /**
    * is used for subreports and contains the names of columns of the parent report.
    *
    * These columns are typically the foreign key fields of the parent report. The values of theses columns are used to identify the data for the subreport.
    * Each time the parent report changes its current row, the subreport requeries it's data based on the values of the master fields.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var MasterFields: activexDashInteropLib.SafeArray[java.lang.String]
  /** the name of the component. */
  var Name: java.lang.String
  /** specifies the horizontal position of the control. */
  var PositionX: scala.Double
  /** specifies the vertical position of the control. */
  var PositionY: scala.Double
  /**
    * Specifies that recurring values are printed. If set to `TRUE` then the value will be printed every time. If set to `FALSE` then the value will only be
    * printed once. The default value is `TRUE` .
    */
  var PrintRepeatedValues: scala.Boolean
  /**
    * Specifies the section where the control belongs to. This is a shortcut to get control hierarchy up. This value is `NULL` when the control was not
    * inserted in any section.
    */
  var Section: XSection
  /** specifies the width of the control. */
  var Width: scala.Double
}

object XReportComponent {
  @scala.inline
  def apply(
    ControlBorder: scala.Double,
    ControlBorderColor: scala.Double,
    DetailFields: activexDashInteropLib.SafeArray[java.lang.String],
    Height: scala.Double,
    MasterFields: activexDashInteropLib.SafeArray[java.lang.String],
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionX: scala.Double,
    PositionY: scala.Double,
    PrintRepeatedValues: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Section: XSection,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Width: scala.Double,
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
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    dispose: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
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
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XReportComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ControlBorder")(ControlBorder)
    __obj.updateDynamic("ControlBorderColor")(ControlBorderColor)
    __obj.updateDynamic("DetailFields")(DetailFields)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("MasterFields")(MasterFields)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PositionX")(PositionX)
    __obj.updateDynamic("PositionY")(PositionY)
    __obj.updateDynamic("PrintRepeatedValues")(PrintRepeatedValues)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Section")(Section)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[XReportComponent]
  }
}

