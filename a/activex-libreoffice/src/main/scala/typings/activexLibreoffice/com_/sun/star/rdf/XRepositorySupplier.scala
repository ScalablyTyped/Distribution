package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to an RDF {@link Repository} .
  * @see XRepository
  * @since OOo 3.0
  */
trait XRepositorySupplier extends js.Object {
  /**
    * provides the RDF {@link Repository} associated with this object.
    * @returns an object of type {@link XRepository}
    */
  val RDFRepository: XRepository
  /**
    * provides the RDF {@link Repository} associated with this object.
    * @returns an object of type {@link XRepository}
    */
  def getRDFRepository(): XRepository
}

object XRepositorySupplier {
  @scala.inline
  def apply(RDFRepository: XRepository, getRDFRepository: () => XRepository): XRepositorySupplier = {
    val __obj = js.Dynamic.literal(RDFRepository = RDFRepository.asInstanceOf[js.Any], getRDFRepository = js.Any.fromFunction0(getRDFRepository))
    __obj.asInstanceOf[XRepositorySupplier]
  }
}

