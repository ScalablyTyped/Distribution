package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XHierarchicalNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XComponentLoader
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container which provides access to documents embedded into a database document, usually forms and reports.
  *
  * The {@link com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} should be used to create sub document container or form, or report
  * objects.
  *
  * The embedded documents do not support any particular database related service, instead, they're usual com::sun::star::document::OfficeDocuments. ;
  * The only thing worth mentioning here is that they support the {@link com.sun.star.container.XChild} interface, whose {@link
  * com.sun.star.container.XChild.getParent()} method can be used to obtain the database document which the embedded document belongs to.
  * @see DocumentDefinition
  * @see OfficeDatabaseDocument
  */
@js.native
trait DocumentContainer
  extends DefinitionContent
     with DefinitionContainer
     with XComponentLoader
     with XMultiServiceFactory
     with XHierarchicalNameContainer {
  def createInstanceWithArguments(aArguments: String): XInterface = js.native
}

