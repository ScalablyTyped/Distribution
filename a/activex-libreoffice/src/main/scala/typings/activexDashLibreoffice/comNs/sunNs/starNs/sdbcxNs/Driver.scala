package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.DriverPropertyInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XDriver
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the service {@link com.sun.star.sdbc.Driver} by beans for data definition.
  *
  * This service is optional for each driver. Its purpose is to define a common way for database definition, as the DDL differs between most DBMS.
  *
  * Definition and deletion of database catalogs can't be defined in a common manner for DBMS, but it should be possible to hide much of the complexity of
  * creation and deletion of catalogs. Each driver could provide methods to cover these tasks.
  */
trait Driver
  extends XDriver
     with XDataDefinitionSupplier
     with XCreateCatalog
     with XDropCatalog

object Driver {
  @scala.inline
  def apply(
    MajorVersion: Double,
    MinorVersion: Double,
    acceptsURL: String => Boolean,
    acquire: () => Unit,
    connect: (String, SeqEquiv[PropertyValue]) => XConnection,
    createCatalog: SeqEquiv[PropertyValue] => Unit,
    dropCatalog: (String, SeqEquiv[PropertyValue]) => Unit,
    getDataDefinitionByConnection: XConnection => XTablesSupplier,
    getDataDefinitionByURL: (String, SeqEquiv[PropertyValue]) => XTablesSupplier,
    getMajorVersion: () => Double,
    getMinorVersion: () => Double,
    getPropertyInfo: (String, SeqEquiv[PropertyValue]) => SafeArray[DriverPropertyInfo],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): Driver = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion, MinorVersion = MinorVersion, acceptsURL = js.Any.fromFunction1(acceptsURL), acquire = js.Any.fromFunction0(acquire), connect = js.Any.fromFunction2(connect), createCatalog = js.Any.fromFunction1(createCatalog), dropCatalog = js.Any.fromFunction2(dropCatalog), getDataDefinitionByConnection = js.Any.fromFunction1(getDataDefinitionByConnection), getDataDefinitionByURL = js.Any.fromFunction2(getDataDefinitionByURL), getMajorVersion = js.Any.fromFunction0(getMajorVersion), getMinorVersion = js.Any.fromFunction0(getMinorVersion), getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[Driver]
  }
}

