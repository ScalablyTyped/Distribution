package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports simple query feature on a container
  *
  * This interface makes it possible to create sub sets of container items which serve specified search criterion.
  */
@js.native
trait XContainerQuery extends XInterface {
  /**
    * creates a sub set of container items which supports searched properties as minimum
    *
    * It's not possible to use special commands or search specific parameters here. You can match by properties only. Enumerated elements must provide
    * queried properties as minimum. Not specified properties willn't be used for searching.
    * @param Properties items of sub set must support given properties as minimum ;  example: ;  (supported) ;  search for items which match the name pattern
    * @returns an sub set of container items as an enumeration.
    */
  def createSubSetEnumerationByProperties(Properties: SeqEquiv[NamedValue]): XEnumeration = js.native
  /**
    * creates a sub set of container items which match given query command
    *
    * Items of this sub set must match used query string. Format of query depends from real implementation. Using of "param=value" pairs isn't necessary. So
    * it's possible to combine different parameters as one simple command string.
    * @param Query items of sub set must match to this query ;  example: ;  (1) ;  query as parameter sequence to return all elements which match the name pat
    * @returns an sub set of container items as an enumeration.
    */
  def createSubSetEnumerationByQuery(Query: String): XEnumeration = js.native
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
  @scala.inline
  implicit class XContainerQueryOps[Self <: XContainerQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateSubSetEnumerationByProperties(value: SeqEquiv[NamedValue] => XEnumeration): Self = this.set("createSubSetEnumerationByProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateSubSetEnumerationByQuery(value: String => XEnumeration): Self = this.set("createSubSetEnumerationByQuery", js.Any.fromFunction1(value))
  }
  
}

