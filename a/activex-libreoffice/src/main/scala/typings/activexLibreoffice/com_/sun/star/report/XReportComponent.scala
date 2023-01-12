package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a component which may be part of a report.
  * @see XReportDefinition
  */
trait XReportComponent
  extends StObject
     with XCloneable
     with XChild
     with XComponent
     with typings.activexLibreoffice.com_.sun.star.drawing.XShape
     with XPropertySet {
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 2: simple border; `
    */
  var ControlBorder: Double
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see Border) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    */
  var ControlBorderColor: Double
  
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
  var DetailFields: SafeArray[String]
  
  /** specifies the height of the control. */
  var Height: Double
  
  /**
    * is used for subreports and contains the names of columns of the parent report.
    *
    * These columns are typically the foreign key fields of the parent report. The values of theses columns are used to identify the data for the subreport.
    * Each time the parent report changes its current row, the subreport requeries it's data based on the values of the master fields.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var MasterFields: SafeArray[String]
  
  /** the name of the component. */
  var Name: String
  
  /** specifies the horizontal position of the control. */
  var PositionX: Double
  
  /** specifies the vertical position of the control. */
  var PositionY: Double
  
  /**
    * Specifies that recurring values are printed. If set to `TRUE` then the value will be printed every time. If set to `FALSE` then the value will only be
    * printed once. The default value is `TRUE` .
    */
  var PrintRepeatedValues: Boolean
  
  /**
    * Specifies the section where the control belongs to. This is a shortcut to get control hierarchy up. This value is `NULL` when the control was not
    * inserted in any section.
    */
  var Section: XSection
  
  /** specifies the width of the control. */
  var Width: Double
}
object XReportComponent {
  
  inline def apply(
    ControlBorder: Double,
    ControlBorderColor: Double,
    DetailFields: SafeArray[String],
    Height: Double,
    MasterFields: SafeArray[String],
    Name: String,
    Parent: XInterface,
    Position: Point,
    PositionX: Double,
    PositionY: Double,
    PrintRepeatedValues: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Section: XSection,
    ShapeType: String,
    Size: Size,
    Width: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    getParent: () => XInterface,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setParent: XInterface => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, Any) => Unit,
    setSize: Size => Unit
  ): XReportComponent = {
    val __obj = js.Dynamic.literal(ControlBorder = ControlBorder.asInstanceOf[js.Any], ControlBorderColor = ControlBorderColor.asInstanceOf[js.Any], DetailFields = DetailFields.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], MasterFields = MasterFields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PrintRepeatedValues = PrintRepeatedValues.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XReportComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XReportComponent] (val x: Self) extends AnyVal {
    
    inline def setControlBorder(value: Double): Self = StObject.set(x, "ControlBorder", value.asInstanceOf[js.Any])
    
    inline def setControlBorderColor(value: Double): Self = StObject.set(x, "ControlBorderColor", value.asInstanceOf[js.Any])
    
    inline def setDetailFields(value: SafeArray[String]): Self = StObject.set(x, "DetailFields", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setMasterFields(value: SafeArray[String]): Self = StObject.set(x, "MasterFields", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPositionX(value: Double): Self = StObject.set(x, "PositionX", value.asInstanceOf[js.Any])
    
    inline def setPositionY(value: Double): Self = StObject.set(x, "PositionY", value.asInstanceOf[js.Any])
    
    inline def setPrintRepeatedValues(value: Boolean): Self = StObject.set(x, "PrintRepeatedValues", value.asInstanceOf[js.Any])
    
    inline def setSection(value: XSection): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
