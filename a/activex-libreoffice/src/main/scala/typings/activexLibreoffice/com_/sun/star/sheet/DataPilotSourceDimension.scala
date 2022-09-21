package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a dimension in a data pilot source.
  *
  * A dimension is equivalent to a column of a cell range in a spreadsheet used for a data pilot field.
  *
  * In more complex data sources, a dimension may contain several hierarchies, which consolidate items of a complex data type, called levels.
  *
  * Example: In a database, a column contains date values. This column will be a dimension of the data pilot source. One hierarchy may contain the 3
  * levels year, month, day. Another hierarchy may contain the 2 levels year and week number.
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.DataPilotTable
  */
trait DataPilotSourceDimension
  extends StObject
     with XNamed
     with XHierarchiesSupplier
     with XCloneable
     with XPropertySet {
  
  /** specifies which values are used. */
  var Filter: SafeArray[TableFilterField]
  
  /**
    * contains flags that control the usage of the dimension.
    * @see com.sun.star.sheet.DimensionFlags
    */
  var Flags: Double
  
  /** specifies how data are aggregated. */
  var Function: GeneralFunction
  
  /**
    * specifies how data are aggregated.
    * @since LibreOffice 5.3
    */
  var Function2: Double
  
  /** contains `TRUE` if this is the dimension used to layout the different data dimensions. */
  var IsDataLayoutDimension: Boolean
  
  /** specifies where the dimension is used. */
  var Orientation: DataPilotFieldOrientation
  
  /** returns the name of the dimension from which this dimension was cloned, or `NULL` if it was not cloned. */
  var Original: XNamed
  
  /** specifies the position of the dimension within its orientation. */
  var Position: Double
  
  /**
    * specifies which hierarchy of the dimension is used.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  var UsedHierarchy: Double
}
object DataPilotSourceDimension {
  
  inline def apply(
    Filter: SafeArray[TableFilterField],
    Flags: Double,
    Function: GeneralFunction,
    Function2: Double,
    Hierarchies: XNameAccess,
    IsDataLayoutDimension: Boolean,
    Name: String,
    Orientation: DataPilotFieldOrientation,
    Original: XNamed,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    UsedHierarchy: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    getHierarchies: () => XNameAccess,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, Any) => Unit
  ): DataPilotSourceDimension = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Function2 = Function2.asInstanceOf[js.Any], Hierarchies = Hierarchies.asInstanceOf[js.Any], IsDataLayoutDimension = IsDataLayoutDimension.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Original = Original.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], UsedHierarchy = UsedHierarchy.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), getHierarchies = js.Any.fromFunction0(getHierarchies), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataPilotSourceDimension]
  }
  
  extension [Self <: DataPilotSourceDimension](x: Self) {
    
    inline def setFilter(value: SafeArray[TableFilterField]): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: GeneralFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setFunction2(value: Double): Self = StObject.set(x, "Function2", value.asInstanceOf[js.Any])
    
    inline def setIsDataLayoutDimension(value: Boolean): Self = StObject.set(x, "IsDataLayoutDimension", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: DataPilotFieldOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: XNamed): Self = StObject.set(x, "Original", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setUsedHierarchy(value: Double): Self = StObject.set(x, "UsedHierarchy", value.asInstanceOf[js.Any])
  }
}
