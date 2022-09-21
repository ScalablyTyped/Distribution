package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to create columns to be added into a grid control model.
  *
  * Grid columns (more precise: models of grid columns) are direct children of the grid control model they belong to. Grid columns can't be created on a
  * global service factory, instead, you need to create them on the grid, where you want to insert them later on.
  * @see com.sun.star.form.component.GridControl
  */
trait XGridColumnFactory
  extends StObject
     with XInterface {
  
  /**
    * returns a list of available column types.
    * @returns a list of column types.
    */
  val ColumnTypes: SafeArray[String]
  
  /**
    * creates a new column object
    * @param aColumnType the type of column to be created
    * @returns the new column object
    * @throws com::sun::star::lang::IllegalArgumentException if aColumnType is not available.
    */
  def createColumn(aColumnType: String): XPropertySet
  
  /**
    * returns a list of available column types.
    * @returns a list of column types.
    */
  def getColumnTypes(): SafeArray[String]
}
object XGridColumnFactory {
  
  inline def apply(
    ColumnTypes: SafeArray[String],
    acquire: () => Unit,
    createColumn: String => XPropertySet,
    getColumnTypes: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XGridColumnFactory = {
    val __obj = js.Dynamic.literal(ColumnTypes = ColumnTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createColumn = js.Any.fromFunction1(createColumn), getColumnTypes = js.Any.fromFunction0(getColumnTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGridColumnFactory]
  }
  
  extension [Self <: XGridColumnFactory](x: Self) {
    
    inline def setColumnTypes(value: SafeArray[String]): Self = StObject.set(x, "ColumnTypes", value.asInstanceOf[js.Any])
    
    inline def setCreateColumn(value: String => XPropertySet): Self = StObject.set(x, "createColumn", js.Any.fromFunction1(value))
    
    inline def setGetColumnTypes(value: () => SafeArray[String]): Self = StObject.set(x, "getColumnTypes", js.Any.fromFunction0(value))
  }
}
