package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.sdbcx.DatabaseDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the {@link com.sun.star.sdbc.Connection} of SDBC by providing the data definitions of a connected database. */
@js.native
trait Connection
  extends typings.activexLibreoffice.com_.sun.star.sdbc.Connection
     with XChild
     with XCommandPreparation
     with DatabaseDefinition
     with XQueriesSupplier
     with XSQLQueryComposerFactory
     with XMultiServiceFactory
