package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.document.OfficeDocument
import typings.activexLibreoffice.com_.sun.star.frame.XLoadable
import typings.activexLibreoffice.com_.sun.star.script.provider.XScriptProviderSupplier
import typings.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a office database document which is a storable document.
  *
  * These documents contain information about forms, and reports, and the properties of a data source.
  *
  * The database document contains no data per default. The following is stored inside the document: formsreportsThe table settings defined in {@link
  * DataSettings}The query settings defined in {@link DataSettings}All properties of the service {@link DataSource}
  * @see com.sun.star.sdb.XOfficeDatabaseDocument
  * @see com.sun.star.document.OfficeDocument
  * @since OOo 2.0
  */
@js.native
trait OfficeDatabaseDocument
  extends OfficeDocument
     with XOfficeDatabaseDocument
     with XScriptProviderSupplier
     with XLoadable
     with XCloseable
