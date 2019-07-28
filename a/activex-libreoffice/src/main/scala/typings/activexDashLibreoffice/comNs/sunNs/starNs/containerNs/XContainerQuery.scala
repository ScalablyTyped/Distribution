package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports simple query feature on a container
  *
  * This interface makes it possible to create sub sets of container items which serve specified search criterion.
  */
trait XContainerQuery extends XInterface {
  /**
    * creates a sub set of container items which supports searched properties as minimum
    *
    * It's not possible to use special commands or search specific parameters here. You can match by properties only. Enumerated elements must provide
    * queried properties as minimum. Not specified properties willn't be used for searching.
    * @param Properties items of sub set must support given properties as minimum ;  example: ;  (supported) ;  search for items which match the name pattern
    * @returns an sub set of container items as an enumeration.
    */
  def createSubSetEnumerationByProperties(Properties: SeqEquiv[NamedValue]): XEnumeration
  /**
    * creates a sub set of container items which match given query command
    *
    * Items of this sub set must match used query string. Format of query depends from real implementation. Using of "param=value" pairs isn't necessary. So
    * it's possible to combine different parameters as one simple command string.
    * @param Query items of sub set must match to this query ;  example: ;  (1) ;  query as parameter sequence to return all elements which match the name pat
    * @returns an sub set of container items as an enumeration.
    */
  def createSubSetEnumerationByQuery(Query: String): XEnumeration
}

object XContainerQuery {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSubSetEnumerationByProperties: SeqEquiv[NamedValue] => XEnumeration,
    createSubSetEnumerationByQuery: String => XEnumeration,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContainerQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSubSetEnumerationByProperties = js.Any.fromFunction1(createSubSetEnumerationByProperties), createSubSetEnumerationByQuery = js.Any.fromFunction1(createSubSetEnumerationByQuery), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContainerQuery]
  }
}

