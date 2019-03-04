package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDriver
     with XDataDefinitionSupplier
     with XCreateCatalog
     with XDropCatalog

object Driver {
  @scala.inline
  def apply(
    MajorVersion: scala.Double,
    MinorVersion: scala.Double,
    acceptsURL: js.Function1[java.lang.String, scala.Boolean],
    acquire: js.Function0[scala.Unit],
    connect: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    createCatalog: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    dropCatalog: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    getDataDefinitionByConnection: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection, XTablesSupplier],
    getDataDefinitionByURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XTablesSupplier
    ],
    getMajorVersion: js.Function0[scala.Double],
    getMinorVersion: js.Function0[scala.Double],
    getPropertyInfo: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DriverPropertyInfo]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): Driver = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion, MinorVersion = MinorVersion, acceptsURL = acceptsURL, acquire = acquire, connect = connect, createCatalog = createCatalog, dropCatalog = dropCatalog, getDataDefinitionByConnection = getDataDefinitionByConnection, getDataDefinitionByURL = getDataDefinitionByURL, getMajorVersion = getMajorVersion, getMinorVersion = getMinorVersion, getPropertyInfo = getPropertyInfo, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[Driver]
  }
}

