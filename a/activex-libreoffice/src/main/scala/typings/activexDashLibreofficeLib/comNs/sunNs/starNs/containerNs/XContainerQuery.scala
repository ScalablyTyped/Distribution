package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports simple query feature on a container
  *
  * This interface makes it possible to create sub sets of container items which serve specified search criterion.
  */
trait XContainerQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a sub set of container items which supports searched properties as minimum
    *
    * It's not possible to use special commands or search specific parameters here. You can match by properties only. Enumerated elements must provide
    * queried properties as minimum. Not specified properties willn't be used for searching.
    * @param Properties items of sub set must support given properties as minimum ;  example: ;  (supported) ;  search for items which match the name pattern
    * @returns an sub set of container items as an enumeration.
    */
  def createSubSetEnumerationByProperties(
    Properties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): XEnumeration
  /**
    * creates a sub set of container items which match given query command
    *
    * Items of this sub set must match used query string. Format of query depends from real implementation. Using of "param=value" pairs isn't necessary. So
    * it's possible to combine different parameters as one simple command string.
    * @param Query items of sub set must match to this query ;  example: ;  (1) ;  query as parameter sequence to return all elements which match the name pat
    * @returns an sub set of container items as an enumeration.
    */
  def createSubSetEnumerationByQuery(Query: java.lang.String): XEnumeration
}

object XContainerQuery {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createSubSetEnumerationByProperties: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XEnumeration
    ],
    createSubSetEnumerationByQuery: js.Function1[java.lang.String, XEnumeration],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContainerQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createSubSetEnumerationByProperties")(createSubSetEnumerationByProperties)
    __obj.updateDynamic("createSubSetEnumerationByQuery")(createSubSetEnumerationByQuery)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XContainerQuery]
  }
}

