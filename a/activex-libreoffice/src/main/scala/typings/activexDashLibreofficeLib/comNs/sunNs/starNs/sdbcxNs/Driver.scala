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

