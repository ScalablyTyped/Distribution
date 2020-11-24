package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to an RDF {@link Repository} .
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XRepositorySupplier extends js.Object {
  
  /**
    * provides the RDF {@link Repository} associated with this object.
    * @returns an object of type {@link XRepository}
    */
  val RDFRepository: XRepository = js.native
  
  /**
    * provides the RDF {@link Repository} associated with this object.
    * @returns an object of type {@link XRepository}
    */
  def getRDFRepository(): XRepository = js.native
}
object XRepositorySupplier {
  
  @scala.inline
  def apply(RDFRepository: XRepository, getRDFRepository: () => XRepository): XRepositorySupplier = {
    val __obj = js.Dynamic.literal(RDFRepository = RDFRepository.asInstanceOf[js.Any], getRDFRepository = js.Any.fromFunction0(getRDFRepository))
    __obj.asInstanceOf[XRepositorySupplier]
  }
  
  @scala.inline
  implicit class XRepositorySupplierOps[Self <: XRepositorySupplier] (val x: Self) extends AnyVal {
    
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
    def setRDFRepository(value: XRepository): Self = this.set("RDFRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRDFRepository(value: () => XRepository): Self = this.set("getRDFRepository", js.Any.fromFunction0(value))
  }
}
