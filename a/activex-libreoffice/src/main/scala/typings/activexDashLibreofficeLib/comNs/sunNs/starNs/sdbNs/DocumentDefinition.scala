package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a sub document of a {@link OfficeDatabaseDocument} .
  *
  * Usual instances of a `DocumentDefinition` are forms and reports.
  *
  * Note that the `DocumentDefinition` does not denote the actual document (i.e. an object supporting the {@link com.sun.star.frame.XModel} interface),
  * but only a shortcut to access and load those actual documents.
  */
trait DocumentDefinition
  extends DefinitionContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XSubDocument {
  /** Indicates if the document is to be used as template, for example, if a report is to be filled with data. */
  var AsTemplate: scala.Boolean
  /** is the name of the document. If the document is part of the container, it is not possible to alter the name. */
  var Name: java.lang.String
}

